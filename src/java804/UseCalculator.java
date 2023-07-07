package java804;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator add = (x, y) -> x + y;
		System.out.println(add.maths(4, 10));
		Calculator sub = (x, y) -> x - y;
		System.out.println(sub.maths(10, 4));
		Calculator mul = (x, y) -> x * y;
		System.out.println(mul.maths(10, 4));

	}

}
