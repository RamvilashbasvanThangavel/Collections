package PreException01;

public class LogException extends Exception {

	public LogException(String a) {
		super(a);	
	}
	public void printStackTrace() {
		System.out.println("Success");
		
	}
	

}
