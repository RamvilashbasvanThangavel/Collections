package Exception02;

public class VoterEligibility {
	public static void main(String[] args) {
		System.out.println("Welcome");
		int age = Integer.parseInt(args[0]);
		try {
		if (age > 18) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not Eligible To Vote");
		}}
		catch(Exception e) {
			System.out.println("e-error");
		}
		System.out.println("Continuing the Process");
		System.out.println("Thank you");

	}

}
