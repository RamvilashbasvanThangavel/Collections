package java8MethodReference;

public class UseFinding {
	public static void main(String[] args) {
		int[] num = { 12, 20, 70, 50, 80 };
		Data f = new Data();
		Finding maxi = f::max1;
		Finding mini = f::max2;
		System.out.println(maxi.find(num));
		System.out.println(mini.find(num));
	}

}
