package collectionsStreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(35, 25, 40);
		List<Integer> list2 = Arrays.asList(32, 28, 35);
		List<List<Integer>> a = Arrays.asList(list1, list2);
		List<Integer> results = a.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		List<Integer> data = Arrays.asList(10, 20, 25, 10, 3, 25);
		Set<Integer> dup = new HashSet<Integer>();
		Set<Integer> d = data.stream().filter(x -> !dup.add(x)).collect(Collectors.toSet());
		System.out.println(d);
		// results.forEach(x -> System.out.println(x));
	}

}
