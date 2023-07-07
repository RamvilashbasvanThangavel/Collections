package collectionsBasicsHashMap;

import java.util.HashMap;

public class BasicHashMap03 {
	public static void main(String[] args) {
		HashMap<String, Long> phoneBook = new HashMap<>();
		phoneBook.put("Ram", 9443183914l);
		phoneBook.put("Kavi", 6374307218l);
		phoneBook.put("Arun", 9840283674l);
		phoneBook.put("Muthu", 7486124890l);

		// phoneBook.forEach((x, y) -> System.out.println(x + "," + y));
		// phoneBook.forEach((x, y) -> System.out.println(y));
		// phoneBook.keySet().forEach(x-> System.out.println(x));
		phoneBook.values().forEach(y -> System.out.println(y));

	}

}
