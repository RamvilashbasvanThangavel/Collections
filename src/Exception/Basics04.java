package Exception;

public class Basics04 {
	public static void main(String[] args) {
		String name = args[0]; // Ramvilashbasvan
		try {
			System.out.println(name.charAt(30));
		} catch (ArithmeticException a) {
			System.out.println("aError");
		} catch (NullPointerException n) {
			System.out.println("nError");
		} catch (IndexOutOfBoundsException i) {
			System.out.println("iError");
		} finally {
			System.out.println(name);

		}

	}
}
