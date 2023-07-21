package PreExceptionFail;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExceptionMap {
	public static void main(String[] args) {
		// Map<Integer, String> a = new HashMap<>();
		Map<Integer, String> a = new ConcurrentHashMap<>();
		a.put(101, "Ram");
		a.put(102, "Arun");
		a.put(103, "Sinthiya");

		for (String x : a.values()) {
			System.out.println(x);
			a.put(104, "Muthu");
		}
	}

}
