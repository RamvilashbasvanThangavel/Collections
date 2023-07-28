package collectionsStreams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ram", 1181, 35000, "Male", 'T', "Executive");
		Employee e2 = new Employee("Kavi", 1187, 55000, "Female", 'D', "SeniorExecutive");
		Employee e3 = new Employee("Muthu", 1180, 48000, "Male", 'A', "Manager");
		Employee e4 = new Employee("Arun", 1179, 250000, "Male", 'K', "SenoirManager");
		Employee e5 = new Employee("Arun", 1178, 250000, "Male", 'K', "SenoirManager");

		List<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		String da =  emp.stream().filter(x->x.getGender().equals("Male"))
				.map(x->x.getName()).sorted(Comparator.reverseOrder()).findFirst().get();
		//System.out.println(da);
		
		// SecondHighestSalary
				int sHS = emp.stream().map(x -> x.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
						.get();
				// System.out.println(sHS);


		// filter -
		List<Employee> filter = emp.stream().filter((x) -> x.getGender().equals("Female")).collect(Collectors.toList());
		// filter.forEach(x -> System.out.println(x));

		// Map
		List<Integer> map = emp.stream().map((x) -> x.getSalary()).collect(Collectors.toList());
		// map.forEach(x -> System.out.println(x));

		// Count
		long count = emp.stream().filter((x) -> x.getSalary() >= 50000).count();
		// System.out.println(count);

		// Distinct
		List<String> distinct = emp.stream().map(x -> (x.getName())).distinct().collect(Collectors.toList());
		 System.out.println(distinct);

		// Sort
		List<Integer> sort1 = emp.stream().map((x) -> x.getSalary()).sorted().collect(Collectors.toList());
		// System.out.println(sort);
		List<Employee> sort2 = emp.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		// sort2.forEach(x->System.out.println(x));

		List<Integer> sortdes = emp.stream().map((x) -> x.getSalary()).sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		// System.out.println(sortdes);
		List<Employee> sortdes1 = emp.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		// sortdes1.forEach(x->System.out.println(x));

		// Limit
		List<Employee> limit = emp.stream().limit(3).collect(Collectors.toList());
		// limit.forEach((x) -> System.out.println(x));

		// AnyMatch
		boolean anyMatch = emp.stream().anyMatch(x -> (x.getName().equals("Arun")));
		// System.out.println(anyMatch);

		// Max
		Employee maxSalary = emp.stream().max(Comparator.comparing(Employee::getSalary)).get();
		// System.out.println(maxSalary);

		// Min
		Employee minSalary = emp.stream().min(Comparator.comparing(Employee::getSalary)).get();
		// System.out.println(minSalary);

		// SummmingInt
		int summingint = emp.stream().collect(Collectors.summingInt(Employee::getSalary));
		// System.out.println(summingint);

		// toMap()
		Map<Integer, Employee> toMap = emp.stream().collect(Collectors.toMap((x) -> x.getId(), y -> y));
		// To get value
		// toMap.forEach((x,y)->System.out.println(y));
		// To get Key
		// toMap.keySet().forEach((x)->System.out.println(x));

		// toSet()
		Set<Employee> toSet1 = emp.stream().filter(x -> x.getGender().equalsIgnoreCase("Male"))
				.collect(Collectors.toSet());
		// toSet1.forEach(x -> System.out.println(x));

		// GroupingBy()
		Map<String, List<Employee>> groupBy = emp.stream().collect(Collectors.groupingBy(Employee::getName));
		// groupBy.forEach((x,y)->System.out.println(x));
		// groupBy.forEach((x, y) -> System.out.println(y));

	}
}
