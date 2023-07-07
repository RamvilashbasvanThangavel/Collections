package java806OptionalClassessForNullpointer;

import java.util.Optional;

public class NullPointer02OfNullAble {
	public static void main(String[] args) {
		String a = null;
		Optional<String> b = Optional.ofNullable(a);
		if (b.isPresent()) {
			System.out.println(a.toUpperCase());
		} else {
			System.out.println("Value is Null");
		}
	}

}
