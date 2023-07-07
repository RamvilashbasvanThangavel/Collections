package java805Static;

public class MemoryExample {
	static int c = 1;

	public MemoryExample() {
		c++;
		System.out.println(c);
	}

	public static void main(String[] args) {
		MemoryExample c1 = new MemoryExample();
		MemoryExample c2 = new MemoryExample();

	}

}
