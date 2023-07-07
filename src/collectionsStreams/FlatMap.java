package collectionsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(35, 25, 40);
		List<Integer> list2 = Arrays.asList(32, 28, 35);
		List<List<Integer>> a = Arrays.asList(list1, list2);
		List<Integer> results = a.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		results.forEach(x -> System.out.println(x));
	}

}
