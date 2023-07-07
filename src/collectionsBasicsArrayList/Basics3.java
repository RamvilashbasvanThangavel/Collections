package collectionsBasicsArrayList;

import java.util.ArrayList;

public class Basics3 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(100);
		nums.add(101);
		nums.add(103); // add() method to insert .
		nums.add(104);
		nums.add(106);

		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) % 2 == 0) {
				System.out.println(nums.get(i));
			}

		}
	}

}
