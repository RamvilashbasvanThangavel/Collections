package java8FunctionalInterfaceWithLambda;

public class FindingVowels01 {
	public static void main(String[] args) {
		String[] a = { "Sum", "mom", "bcd", "xyz" };
		FindingVowels v = (x) -> {
			for (String b : x) {
				if (b.contains("a") || b.contains("e") || b.contains("i") || b.contains("o") || b.contains("u")) {
					continue;
				} else {
					System.out.println(b);
				}
			}

		};
		v.findNotVowels(a);
	}
}
