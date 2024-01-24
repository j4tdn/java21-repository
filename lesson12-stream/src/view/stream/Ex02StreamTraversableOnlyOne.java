package view.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex02StreamTraversableOnlyOne {
	
	public static void main(String[] args) {
		
		// Trong Collection<T> -> stream() -> Stream<T>
		
		String[] elements = {"a", "b", "c", "d", "e"};
		
		Stream<String> stream = Arrays.stream(elements);  //Stream<String>
		
		stream.forEach(System.out::println);
		
		System.out.println("\n===\n");
		
		stream.forEach(System.out::println); // exception: stream has already been operated upon or closed
		
	}

}
