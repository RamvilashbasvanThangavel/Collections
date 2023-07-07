package collectionsBasiscStream;

import java.util.*;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String[] args) {

		Car c1 = new Car("TN45AH9657", "Hyundai", 700000, "White", 4.8f, "Creta");
		Car c2 = new Car("TN24AP1994", "Tata", 1500000, "Black", 3.8f, "Nexan");
		Car c3 = new Car("TN48PH1974", "Renualt", 2000000, "Gray", 4.5f, "k10");
		Car c4 = new Car("TN28VH1648", "MG", 250000, "White", 3.6f, "Hector");
		Car c5 = new Car("TN24VB1972", "Mer", 7000000, "Silver", 4.8f, "Y20");
		Car c6 = new Car("TN26PV1245", "Hyundai", 800000, "Blue", 3.6f, "I10");
		Car c7 = new Car("TN18HK6472", "Mahendra", 1200000, "Brown", 3.9f, "Xuv-700");

		HashMap<String, Car> cars = new HashMap<>();
		cars.put(c1.getNoPlate(), c1);
		cars.put(c2.getNoPlate(), c2);
		cars.put(c3.getNoPlate(), c3);
		cars.put(c4.getNoPlate(), c4);
		cars.put(c5.getNoPlate(), c5);
		cars.put(c6.getNoPlate(), c6);
		cars.put(c7.getNoPlate(), c7);
		Map<String, Car> lc = cars.values().stream().filter(x -> x.getPrice() > 500000)
				.collect(Collectors.toMap(x -> x.getNoPlate(), y -> y));
		List<Car> nLc = cars.values().stream().filter(x -> x.getPrice() < 500000).collect(Collectors.toList());
		// lc.values().forEach(x->System.out.println(x));
		// nLc.forEach(x -> System.out.println(x));

	}

}
