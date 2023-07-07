package collectionsBasiscStream;

import java.util.*;
import java.util.stream.Collectors;

public class BasicsStreamWithCollect {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Ram");
		name.add("Raju");
		name.add("Kavi");
		name.add("Deva");
		name.add("Surya");
		name.add("Arun");
		name.add("Pavi");
		List<String> rnames = name.stream().filter(x -> x.startsWith("R")).collect(Collectors.toList());
		System.out.println(rnames);

	}

}
