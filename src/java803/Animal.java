package java803;

@FunctionalInterface
public interface Animal {
	public void eat(int e,int a);

	public static String sleep(String a) {
		return a;
	}

	public default String work(String b) {
		return b;
	}

}
