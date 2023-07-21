package PreExceptionFail;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExceptionList {
	public static void main(String[] args) {
		// List<String> a = new ArrayList<>();
		List<String> a = new CopyOnWriteArrayList<>();
		a.add("Ram");
		a.add("Arun");
		a.add("Sinthiya");
		for (String x : a) {
			System.out.println(x);
			// a.remove(1);
			a.set(2, "Muthu");
		}
	}

}
