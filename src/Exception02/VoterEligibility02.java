package Exception02;

public class VoterEligibility02 {
	public static void main(String[] args) throws AgeException {
		System.out.println("Welcome");
		int age = Integer.parseInt(args[0]);
		if (age > 18) {
			System.out.println("Eligible");
		} else {
			throw new AgeException("You are Under 18");
		}
		System.out.println("Continuing the Process");
		System.out.println("Thank you");

	}

}
