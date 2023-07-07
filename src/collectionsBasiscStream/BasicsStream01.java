package collectionsBasiscStream;

import java.util.*;

public class BasicsStream01 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Ram");
		name.add("Raju");
		name.add("Kavi");
		name.add("Deva");
		name.add("Surya");
		name.add("Arun");
		name.add("Pavi");
        name.stream().filter(x-> x.startsWith("R")).forEach(y->System.out.println(y));
	}

}
