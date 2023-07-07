package PreException01;

public class UseLogin {
	public static void main(String[] args) throws LogException, Exception {
		Login log = new Login();
		log.checkPassword("ram");
	}

}
