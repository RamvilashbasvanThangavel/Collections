package java8Functionalinterface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.*;

public class Functionalineterface {
	public static void main(String[] args) {
		Predicate<Integer> p = (x) -> x == 60 + 80;
		System.out.println(p.test(140));

		Consumer<Long> c = (x) -> System.out.println(x);
		c.accept(6374307218l);

		Supplier<String> s = () -> "RamvilashBasvan";
		System.out.println(s.get());

		Function<Integer, Integer> f = (x) -> x + 2000;
		System.out.println(f.apply(500));

	}
}
