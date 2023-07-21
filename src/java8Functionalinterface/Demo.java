package java8Functionalinterface;

public interface Demo {
	
	
	public static String print() {
		return "Welcome";
	}

	public default String end() {
		return "Thank You";
	}

	public void show();

}
