package java8FunctionalInterface01;

import java.util.*;

public class FindingNumber01 {
	public static void main(String[] args) {
		int[] a = { 4, 2, 3, 6, 60, 30 };
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			nums.add(a[i]);
		}

		FindingNumber nP = (x) -> {
			for (int div : x) {
				if (div % 2 == 0 && div % 3 == 0) {
					System.out.println(div);
				}
			}
		};
		nP.findingNumbers(a);
	}
}
