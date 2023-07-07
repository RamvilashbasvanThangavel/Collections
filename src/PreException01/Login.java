package PreException01;

public class Login {
	public void checkPassword(String password) throws LogException, Exception {
		try {
			if (password.length() > 8) {
				System.out.println("Successfully logedIn");
			} else {
				throw new LogException("Must Contain more the Eight Digit");
			}
		} catch (LogException le) {
			le.printStackTrace();
		}
	}

}
