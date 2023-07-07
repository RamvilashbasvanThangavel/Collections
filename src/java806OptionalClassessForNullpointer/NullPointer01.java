package java806OptionalClassessForNullpointer;

public class NullPointer01 {
	public static void main(String[] args) {
		String a = null;
		try {
			String b = a.toUpperCase();
			System.out.println(b);
		} catch (NullPointerException npe) {
			System.out.println("npe-Error");
		}
	}

}
