package view.stream.practice;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex07BuildingStream {

	public static void main(String[] args) {
		// Tạo ra stream từ
		
		// array: primitive --> primitive stream --> Arrays.stream(...)
		
		// array: object --> Stream<T> --> Arrays.stream(...)
		
		// collection: list/set --> Stream<T> --> list.stream(), set.stream()
		
		// map: entrySet --> Stream<T> --> map.entrySet().stream()
		
		// tự build stream
		Stream.of(1, 2, 3)
		      .forEach(System.out::println);
		
		String s = "a, b, c";
		String[] tokens = s.split(", ");
		
		Pattern.compile(", ").splitAsStream(s) // Stream<String>
		               .filter(si -> si.compareTo("a") > 0)
		               .forEach(System.out::println);
	}
}
