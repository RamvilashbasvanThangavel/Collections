package collectionsBasicsArrayList;

import java.util.ArrayList;

public class Basics1 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(100);
		nums.add(101);
		nums.add(103); // add() method to insert .
		nums.add(104);
		nums.add(106);
		// System.out.println(nums);
		nums.set(4, 105); // set() method to replace.
		// System.out.println(nums);
		nums.add(2, 102);
		// System.out.println(nums.size()); // size() method length of the Array list
		// length of the Array.
		// nums.remove(2); // remove() method of the Array list.
	//	System.out.println(nums.get(1)); // get method() to take the values to print.
		
		for(int i = 0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		
		}
	}

}
