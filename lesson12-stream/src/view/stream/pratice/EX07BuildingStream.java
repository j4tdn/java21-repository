package view.stream.pratice;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class EX07BuildingStream {

	public static void main(String[] args) {
		// Tạo ra stream từ
		
		// array: primitive --> primitive stream --> Arrays.stream(...)
		
		// array: object --> stream<T> --> Arrays.stream(...)
		
		// collection: list/set --> stream<T> --> list.stream(), set.stream()
		
		// map: entryset -> stream<T> --> map.entrySet().stream()
		
		// tự build stream
		Stream.of(1,2,3)
			.forEach(System.out::println);
		
		String s = "a,b,c";
		String[] tokens = s.split(",");
		
		Pattern.compile(",").splitAsStream(s) // Stream<String>
			.filter(si -> si.compareTo("a") > 0)
			.forEach(System.out::println);
	}
}
