package collectionsBasicsHashMap;

public class Employee {
	private int id;
	private String name;
	private int age;
	private int salary;
	private String gender;

	public void setid(int id) {
		this.id = id;
	}

	public int getid() {
		return id;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setage(int age) {
		this.age = age;
	}

	public int getage() {
		return age;
	}

	public void setsalary(int salary) {
		this.salary = salary;
	}

	public int getsalary() {
		return salary;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getgender() {
		return gender;
	}

	public Employee(int id, String name, int age, int salary, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}

	public String toString() {
		return "EmplyeeDetails :-" + " ID: " + id + ", Name:" + name + ", Age:" + age + ", Salary:" + salary
				+ ", Gender:" + gender;
	}

}
