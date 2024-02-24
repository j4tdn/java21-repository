package view.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex02StreamTraversableOnlyOne {

	public static void main(String[] args) {
		
		// Collection<T> --> stream() --> Stream<T>
		// Array & primitive
		String[] elements = { "a", "v", "b", "c", "d" };
		Stream<String> stream = Arrays.stream(elements);

		stream.forEach(System.out::println);
		
		System.out.println("==================");
		
		stream.forEach(System.out::println); // exception: stream has already been operated upon or closed
	
	}

}
