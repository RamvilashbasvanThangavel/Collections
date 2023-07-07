package Exception;

public class Basics02 {
	public static void main(String[] args) {
		System.out.println("Welcome");
		int num1 = 10;
		int num2 = 0;
		System.out.println(num1);
		System.out.println(num2);
		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			// System.out.println("Don't divide any numbers by zero");
			// System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Thak You");
	}

}
