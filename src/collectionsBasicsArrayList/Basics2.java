package collectionsBasicsArrayList;

import java.util.ArrayList;

public class Basics2 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(100);
		nums.add(101);
		nums.add(102);
		nums.add(103);
		nums.add(104);

		ArrayList<Integer> oddNumber = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 != 0) {
				oddNumber.add(nums.get(i));
			}
		}

		System.out.println(oddNumber);
	}

}
