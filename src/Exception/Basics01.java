package Exception;

public class Basics01 {
	public static void main(String[] args) {
		System.out.println("Welcome");
		int num1 = 10;
		int num2 = 0;
		System.out.println(num1);
		System.out.println(num2);
		try {
		System.out.println(num1 / num2);
		}
		catch(Exception ae) {
			System.out.println("Ae - error");
		}
		System.out.println("Thak You");
	}

}
