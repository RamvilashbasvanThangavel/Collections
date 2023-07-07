package java805Static;

public class UseStudent {
	public static void main(String[] args) {
		Student.collegeName = "Arunai Eng college";
		Student.degree = "Be-Mech";
		Student s1 = new Student();
		s1.name = "Pavi";
		s1.age = 28;
		Student s2 = new Student();
		s2.name = "Ram";
		s2.age = 27;
		Student s3 = new Student();
		s3.name = "Pavi";
		s3.age = 28;
		s3.collegeName = "Aec"; // overided.
		Student.degree = "Be-cs";
		System.out.println(s1.name + "," + s1.age + "," + s1.degree + "," + s1.collegeName);
		System.out.println(s2.name + "," + s2.age + "," + s3.degree + "," + s2.collegeName);
		System.out.println(s3.name + "," + s3.age + "," + s3.degree + "," + s3.collegeName);

	}

}
