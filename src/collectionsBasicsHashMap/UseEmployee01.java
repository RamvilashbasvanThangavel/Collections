package collectionsBasicsHashMap;

import java.util.*;

public class UseEmployee01 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1181, "Ram", 28, 25000, "Male");
		Employee e2 = new Employee(789, "Kavi", 29, 15000, "Male");
		Employee e3 = new Employee(164, "Muth", 22, 35000, "Male");
		Employee e4 = new Employee(1174, "Ramya", 32, 26000, "FeMale");
		Employee e5 = new Employee(1128, "Surya", 26, 17000, "Male");
		Employee e6 = new Employee(154, "Pavan", 28, 250000, "Male");
		Employee e7 = new Employee(1286, "Pavithra", 25, 250000, "Female");
		Employee e8 = new Employee(1782, "Sakthi", 18, 280000, "Male");
		Employee e9 = new Employee(1182, "RasuKutty", 38, 55000, "Male");
		Employee e10 = new Employee(1189, "NagaLakshmi", 29, 45000, "FeMale");

		HashMap<Integer, Employee> employees = new HashMap<>();
		employees.put(e1.getid(), e1);
		employees.put(e2.getid(), e2);
		employees.put(e3.getid(), e3);
		employees.put(e4.getid(), e4);
		employees.put(e5.getid(), e5);
		employees.put(e6.getid(), e6);
		employees.put(e7.getid(), e7);
		employees.put(e8.getid(), e8);
		employees.put(e9.getid(), e9);
		employees.put(e10.getid(), e10);

		for(int k : employees.keySet()) {
			System.out.println(k);
		}
		
	}
	}


