package java8Functionalinterface;

public class Sample implements Demo {
	public static String print() { // overrided form Demo
		return "bye";
	}

	public  String end() { // when we Override default from interface means need to remove the KeyWord.
		return "Well";
	}

	public void show() {
		System.out.println("Steam");
	}

}
