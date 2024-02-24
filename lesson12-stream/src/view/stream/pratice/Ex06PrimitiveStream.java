package view.stream.pratice;

import java.util.Arrays;

public class Ex06PrimitiveStream {
	public static void main(String[] args) {
		//Primitive Stream: IntStream, DoubleStream,LongStream
		// -->100% chứa các ptu kiểu dữ liệu nguyên thủy: int, duoble, long
		// --> hỗ trợ các hàm giống như trong Stream<T> nhưng thay vì truyền T biết được là chính 
		// --> hỗ trợ thêm các hàm cho KDL nguyên thủy như sum, sub, mul, agv, div
		
		
		//IntStream
		//forEach(IntComSummer consumer
		
		//Object Stream: Stream<T>
		//forEach(ConSumer<T> consumer)
		
		int [] numbers = {1,2,3};
		Arrays.stream(numbers)  //IntStream
		.forEach(System.out::println);  //hàm in
		
	}
}
