package java806OptionalClassessForNullpointer;

import java.util.Optional;

public class NullPointer04OrElse {
	public static void main(String[] args) {
		String a = "Ram";
		Optional<String> b = Optional.ofNullable(a);
		System.out.println(b.orElse("Empty"));
		
	}

}
