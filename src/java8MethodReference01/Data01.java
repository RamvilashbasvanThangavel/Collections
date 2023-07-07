package java8MethodReference01;

import java.util.List;

public class Data01 {
	public void find(List<String> a) {
		for (String s : a) {
			if (s.length() >= 4) {
				System.out.println(s);
			}

		}
	}
}
