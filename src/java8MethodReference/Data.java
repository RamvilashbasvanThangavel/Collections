package java8MethodReference;

public class Data {
	public int max1(int[] num) {
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max <= num[i]) {
				max = num[i];
			}

		}
		return max;
	}

	public int max2(int[] n) {
		int min = n[0];
		for (int i = 0; i < n.length; i++) {
			if (min >= n[i]) {
				min = n[i];
			}

		}
		return min;

	}

}
