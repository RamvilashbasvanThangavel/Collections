package collectionsBasicsHashMap;

import java.util.HashMap;

public class BasicHashMap01 {
	public static void main(String[] args) {
		HashMap<String, Long> phoneBook = new HashMap<>();
		phoneBook.put("Ram", 9443183914l);
		phoneBook.put("Kavi", 6374307218l);
		phoneBook.put("Arun", 9840283674l);
		phoneBook.put("Muthu", 7486124890l);

		System.out.println(phoneBook.get("Kavi"));

	}

}
