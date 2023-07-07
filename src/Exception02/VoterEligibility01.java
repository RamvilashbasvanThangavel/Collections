package Exception02;

public class VoterEligibility01 {
	public static void main(String[] args) {
		System.out.println("Welcome");
		int age = Integer.parseInt(args[0]);
		try {
			if (age > 18) {
				System.out.println("Eligible");
			} else {
				throw new AgeException("You are Under 18");
			}
		} catch (Exception e) {
			System.out.println("underAge");
		} finally {
			System.out.println("Continuing the Process");
			System.out.println("Thank you");
		}

	}

}
