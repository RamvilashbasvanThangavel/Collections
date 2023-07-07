package collectionsBasicsArrayList;

public class Fresher {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	private String designation;
	private int experience;

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

	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getgender() {
		return gender;
	}

	public void setsalary(int salary) {
		this.salary = salary;
	}

	public int getsalary() {
		return salary;
	}

	public void setdesignation(String designation) {
		this.designation = designation;
	}

	public String getdesignation() {
		return designation;
	}

	public void setexperience(int experience) {
		this.experience = experience;
	}

	public int getexperience() {
		return experience;
	}

	public Fresher(int id, String name, int age, String gender, int salary, String designation, int experience) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.designation = designation;
		this.experience = experience;
	}

	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary
				+ ", designation=" + designation + ", experience=" + experience + "]";
	}

	

}
