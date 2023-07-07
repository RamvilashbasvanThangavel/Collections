package java8MethodReference01;

import java.util.Arrays;
import java.util.List;

public class UseData01 {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("ram", "kavi", "dev", "prem");
		Data01 d = new Data01();
		Data d1 = d::find;
		d1.findLength(name);

	}
}