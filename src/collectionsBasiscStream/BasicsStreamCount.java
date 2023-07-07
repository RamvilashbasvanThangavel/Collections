package collectionsBasiscStream;

import java.util.*;

public class BasicsStreamCount {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Ram");
		name.add("Raju");
		name.add("Kavi");
		name.add("Deva");
		name.add("Surya");
		name.add("Arun");
		name.add("Pavi");
		Long c = name.stream().filter(x->x.length()%2==0).count();
		System.out.println(c);
	}

}
