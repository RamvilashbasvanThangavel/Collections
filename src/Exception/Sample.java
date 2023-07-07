package Exception;

public class Sample { // for Error example
	public void findA() {
		findB();
	}

	public void findB() {
		findA();
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.findA();
	}

}
