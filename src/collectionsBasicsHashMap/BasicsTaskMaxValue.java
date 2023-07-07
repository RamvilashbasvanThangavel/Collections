package collectionsBasicsHashMap;

import java.util.*;

public class BasicsTaskMaxValue {
	public static void main(String[] args) {
		HashMap<Integer, String> oneSoft = new HashMap<>();
		oneSoft.put(1181, "Ram");
		oneSoft.put(1174, "Sinthiya");
		oneSoft.put(1166, "Yokesh");
		oneSoft.put(1179, "Arun");

		int max = 0;
		for (int value : oneSoft.keySet()) {
			if (max < value) {
				max = value;
			}
		}
		System.out.println("New Student: " + max + "," + oneSoft.get(max));

		int min = max;
		for (int data : oneSoft.keySet()) {
			if (min > data) {
				min = data;
			}
		}
		System.out.println("Old Student: " + min + ", " + oneSoft.get(min));
	}

}
