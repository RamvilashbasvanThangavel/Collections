package PreReviewTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx01 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(5, 6, 7, 3, 8);
		List<Integer> list3 = Arrays.asList(4, 3, 2, 11, 10, 9);

		List<List<Integer>> l = Arrays.asList(list1, list2, list3);
		List<Integer> results = l.stream().flatMap(x -> x.stream()).distinct().sorted().collect(Collectors.toList());
		List<Integer> resultsDesc = l.stream().flatMap(x -> x.stream()).distinct().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		//System.out.println("Ascending order " + results);
		//System.out.println("Descending order " + resultsDesc);
		
		List<Integer> dat = l.stream().flatMap(x->x.stream()).distinct().sorted().collect(Collectors.toList());
		System.out.println(dat);

	}

}
