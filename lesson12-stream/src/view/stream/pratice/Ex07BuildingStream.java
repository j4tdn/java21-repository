package view.stream.pratice;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex07BuildingStream {

	public static void main(String[] args) {
		
		//Tạo ra Stream từ 
		// array: primitive --> primitive stream
		// array: object --> stream<T>
		// collection: list/set --> Stream<T> --> list.stream(), set.stream()
		// map: entryset --> stream<t> -> map.entrySet().stream()
		
		
		//Tự tạo build Stream từ 
		Stream.of(1, 2, 3)
			.forEach(System.out::println);
		
		String s = "a, b, c, d , e, f";
		//String [] tokens = s.split(",");
		Pattern.compile(",").splitAsStream(s) //Stream<Sting>
				.filter(si -> si.compareTo("a") > 0)
				.forEach(System.out::println);
		
	}
}
