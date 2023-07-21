package Exception;

public class Basics03 {
	public static void main(String[] args) {
		String a = args[0]; // TN24AH1994
		try {
			int num = Integer.parseInt(a);
			System.out.println(num);
		} catch (NullPointerException n) {
			System.out.println("error");
		} catch (ArithmeticException c) {
			System.out.println("noterror");
		} catch (Exception e) {
			System.out.println("n-error");
		}
		System.out.println(a);
	}

}
