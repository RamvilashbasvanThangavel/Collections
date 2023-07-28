package collectionsBasiscStream;

import java.util.*;
import java.util.stream.Collectors;

public class UseWatch {
	public static void main(String[] args) {

		Watch w1 = new Watch("Fast", 5000, "silver", 4.8f, "digital", true);
		Watch w2 = new Watch("Titan", 4000, "Gold", 3.5f, "Analog", false);
		Watch w3 = new Watch("Sonata", 4000, "Black", 3.8f, "digital", false);
		Watch w4 = new Watch("Track", 8000, "silver", 4.6f, "digital", true);
		Watch w5 = new Watch("Remand", 5500, "silver", 3.2f, "digital", true);
		Watch w6 = new Watch("Sony", 7000, "Black", 4.2f, "digital", true);
		Watch w7 = new Watch("Rolex", 35000, "silver", 5.0f, "Analog", false);

		ArrayList<Watch> watches = new ArrayList<>();
		watches.add(w1);
		watches.add(w2);
		watches.add(w3);
		watches.add(w4);
		watches.add(w5);
		watches.add(w6);
		watches.add(w7);
		List<Watch> brandedWatches = watches.stream().filter(x -> x.getPrice() >= 5000).collect(Collectors.toList());
		Map<String, Watch> data1 = watches.stream().collect(Collectors.toMap(x -> x.getBrand(), y -> y));
		List<Watch> data2 = data1.values().stream().toList();
		List<String> data3 = data1.keySet().stream().toList();
		List<Watch> data4 = watches.stream().sorted(Comparator.comparing(Watch::getPrice)).toList();
		List<Watch> data5 = watches.stream().filter(x -> x.getPrice() > 5000)
				.sorted(Comparator.comparing(Watch::getPrice).reversed()).toList();
		List<Watch> data6 = watches.stream().distinct().toList();
		String data7 = watches.stream().filter(x -> x.getColour().endsWith("silver"))
				.sorted(Comparator.comparing(Watch::getPrice).reversed()).map(x->x.getBrand()).skip(1).findFirst().get();
		System.out.println(data7);
	    //data6.forEach(System.out::println);

		// brandedWatches.forEach(x -> System.out.println(x)); // total output of all
		// string price more than 5000

		List<String> digitalWatches = watches.stream().filter(x -> x.getType().equalsIgnoreCase("Digital"))
				.map(x -> x.getBrand()).collect(Collectors.toList());
		// for (String brand : digitalWatches) {System.out.println(brand);}
		HashMap<String, Watch> watche = new HashMap<>();
		watche.put(w1.getBrand(), w1);
		watche.put(w2.getBrand(), w2);

		watche.put(w3.getBrand(), w3);
		watche.put(w4.getBrand(), w4);
		watche.put(w5.getBrand(), w5);
		watche.put(w6.getBrand(), w6);
		watche.put(w7.getBrand(), w7);
		// Map<String,Watch> cs
		// =watche.values().stream().filter(x->x.getColour().equalsIgnoreCase("Silver")).collect(Collectors.toMap(x->x.getBrand(),y->y));
		// cs.values().forEach(x->System.out.println(x));

	}

}
