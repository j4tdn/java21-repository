package view;

import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex02LambdaSyntax {

	public static void main(String[] args) {
		
		// Khi code cho 1 lambda(đúng)
		// --> suy ra được công thức của " HÀM TRỪA TƯỢNG" của KDL trả về functional interface
		
		Runnable runnable =	() -> {}; // --> void method()
		Supplier<String> supplier = () -> "Raul"; // () -> T
		Callable<String> callable = () -> "Raul"; // type inference
		
		Function<Integer, String> function = (Integer i) ->  "Alan" + i; // R method(T t);
		System.out.println("apply-- 22" + function.apply(15));
		
		UnaryOperator<String> ua= (String s) -> "Iron man"; // T method(T t);
		System.out.println("uo-- 22" + ua.apply("abc"));
		
		
		// Predicate<T>     --> T     -> boolean  --> signature , descriptor
		// Consumer<T>      --> T     -> void
		// Comparator<T>    --> (T,T) -> int
		// Function<T,R>    --> T     -> R
		// UnaryOperator<T> --> T     -> T
		// Supplier<T>      --> ()    -> T
		// Callable<T>      --> () throws Exception -> T
		// Runnable         --> ()    -> void
	} 
	
}
