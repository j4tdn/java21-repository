package view.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex02StreamTraversableOnlyOnce {

	public static void main(String[] args) {
		
		// Collection<T> --> stream() --> Stream<T>
		
		// Array<T> & primitive
		
		String[] elements = {"a", "b", "c", "d"};
		
		Stream<String> stream = Arrays.stream(elements);// Stream<String>
		
		stream.forEach(System.out::println);
		
		System.out.println("\n==\n");
		
		stream.forEach(null);
	}
	
}
