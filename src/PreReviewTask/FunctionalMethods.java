package PreReviewTask;

import java.util.function.*;

public class FunctionalMethods {
	public static void main(String[] args) {
		Function<Integer, String> fun = (a) -> "This value is " + a;
		System.out.println(fun.apply(500));

		Consumer<Integer> con = (a) -> System.out.println(a + 500);
		con.accept(200);

		Supplier<String> sup = () -> "Ram";
		System.out.println((sup.get()));

		Predicate<String> pre = (a) -> a.equals("Ram");
		System.out.println(pre.test("RamVilash"));

	}

}
