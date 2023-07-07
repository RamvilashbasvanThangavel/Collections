package java803;

public class UseAnimal {
	public static void main(String[] args) {
		Animal cat = (x, y) -> System.out.println(x + y);
		cat.eat(800, 700);
		Animal rat = (x, y) -> System.out.println(x + y);
		rat.eat(200, 200);

		Animal sleep = (s, z) -> System.out.println(s + z);
		sleep.eat(2, 700);
	}

}
