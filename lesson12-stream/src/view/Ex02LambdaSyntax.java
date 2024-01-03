package view;

import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex02LambdaSyntax {
	
	public static void main(String[] args) {
		// khi code cho 1 lambda(đúng)
		// --> suy ra được công thức hàm trừu tượng của KDL trả về functional interface
		
		Runnable runnable = () -> {}; // void method()
		
		Supplier<String> supplier =  () -> "Raul"; // () -> T
		Callable<String> callable = () -> "Raul"; // type inference
		
		Function<Integer, String> function =  (Integer i) ->  "Alan " + i; // R -> method(T t)
		
		System.out.println("apply 15 --> " + function.apply(15));
		
		UnaryOperator<String> uo = (String s) -> "Iron Man";
		
		
	}

}
