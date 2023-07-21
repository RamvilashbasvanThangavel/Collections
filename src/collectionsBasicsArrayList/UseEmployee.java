package collectionsBasicsArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1181, "Ram", 28, "male", 20000, "Executive", 6);
		Employee e2 = new Employee(1157, "Arun", 26, "male", 45000, "Asst-Manager", 8);
		Employee e3 = new Employee(1127, "Muthu", 25, "male", 28000, "Manager", 2);
		Employee e4 = new Employee(1186, "Saranya", 28, "Female", 150000, "Senior-Manager", 15);
		Employee e5 = new Employee(1184, "Harani", 22, "Female", 18000, "Executive", 3);
		Employee e6 = new Employee(1156, "Kavi", 21, "Female", 25000, "Senior-Executive", 4);
		Employee e7 = new Employee(1128, "Rajesh", 22, "male", 17000, "Executive", 5);

		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);

		// min salary employee name

		String da = emp.stream().filter(x -> x.getage() >= 25).min(Comparator.comparing(Employee::getsalary)).get()
				.getname();
		// System.out.println(da);

		List<Employee> em = emp.stream().filter(x -> x.getsalary() < 20000)
				.sorted(Comparator.comparing(Employee::getsalary).reversed()).toList();
		em.forEach(x -> System.out.println(x));

//		ArrayList<Employee> female = new ArrayList<>();
//		for (int i = 0; i < emp.size(); i++) {
//			if (emp.get(i).getgender().equalsIgnoreCase("Female")) {
//				female.add(emp.get(i));
//			}
//		}
//		female.forEach(x -> System.out.println(x));

//		
//		for (Employee a : emp) {
//			if (a.getgender().equals("Female")) {
//				System.out.println(a.getname());
//			}
//		}

		emp.forEach(x -> {
			if (x.getsalary() > 20000) {
				// System.out.println(x.getname() + "-" + x.getsalary());
			}
		});

		Employee eMin = emp.stream().min(Comparator.comparing(Employee::getsalary)).get();
		Employee eMax = emp.stream().max(Comparator.comparing(Employee::getsalary)).get();
		Employee emMin = emp.stream().sorted(Comparator.comparing(Employee::getsalary)).findFirst().get();
		Employee emMin2 = emp.stream().sorted(Comparator.comparing(Employee::getsalary)).skip(1).findFirst().get();
		Employee emMax = emp.stream().sorted(Comparator.comparing(Employee::getsalary).reversed()).findFirst().get();
		Employee emMax2 = emp.stream().sorted(Comparator.comparing(Employee::getsalary).reversed()).skip(1).findFirst()
				.get();
		List<Employee> emFirst3 = emp.stream().sorted(Comparator.comparing(Employee::getsalary)).limit(5)
				.collect(Collectors.toList());
		List<Employee> emBetWeen = emp.stream().sorted(Comparator.comparing(Employee::getsalary)).skip(3).limit(2)
				.toList();
		// System.out.println("Minimum Salary"+eMin);
		// System.out.println("Maximum salary"+eMax);
		// System.out.println("Minimum Salary"+emMin);
		// System.out.println("Second Minimum"+emMin2);
		// System.out.println("Maximum salary"+emMax);
		// System.out.println("Second Maximum"emMax2);
		// emFirst3.forEach((x)-> System.out.println(" firts 3 min"+x));

		// emBetWeen.forEach((x) -> System.out.println("4th and 5th min" + x));
	}

}
