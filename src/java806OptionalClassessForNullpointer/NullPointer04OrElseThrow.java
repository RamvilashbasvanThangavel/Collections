package java806OptionalClassessForNullpointer;

import java.util.Optional;

public class NullPointer04OrElseThrow {
	public static void main(String[] args) {
		String a = "Ram";
		Optional<String> b = Optional.ofNullable(a);
		System.out.println(b.orElseThrow(() -> new NullPointerException("NoData")));

	}

}
