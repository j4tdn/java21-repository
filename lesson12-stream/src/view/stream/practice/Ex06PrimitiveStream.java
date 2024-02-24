package view.stream.practice;

import java.util.Arrays;

public class Ex06PrimitiveStream {
	
	public static void main(String[] args) {
		// Primitive Stream: IntStream, DoubleStream, LongStream
		// --> 100% chứa các phần tử có KDL nguyên thủy: int, double, long
		// --> hỗ trợ các hàm giống như trong Stream<T> nhưng thay vì truyền T thì nó biết được là chính xác primitive type nào
		// --> hỗ trợ thêm các hàm cho KDL nguyên thủy như sum, avg, div
		
		// IntStream
		// forEach(IntConsumer consumer)
		
		// Object Stream: Stream<T>
		// forEach(Consumer<T> consumer)
		
		// int[] numbers = {1, 2, 3};
		// Arrays.stream(numbers) // IntStream
		//      .forEach(System.out::println);
		
		// Integer[] digits = {1, 2, 3};
	}
}
