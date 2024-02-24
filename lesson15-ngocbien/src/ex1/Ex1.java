package ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex1 {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);

		Map<Integer, Long> count = input.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		System.out.println("Elements appear once : ");
		count.entrySet().stream().filter(e -> e.getValue() == 1).forEach(e -> {
			System.out.print(e.getKey() + " - ");
		});

		System.out.println();
		System.out.println("Elements appear more than 1 time : ");

		count.entrySet().stream().filter((e) -> e.getValue() > 1).forEach((e) -> {
			System.out.print(e.getKey() + " - ");
		});
	}

}
