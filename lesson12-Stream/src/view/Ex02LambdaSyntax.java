package view;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class Ex02LambdaSyntax {
	public static void main(String[] args) {
		// Khi code cho 1 lambda(đúng) --> suy ra được công thức"Hàm Trừu Tượng " 
		// của KDL trả về functional interface
		Runnable runnable = () -> {};
		// () -> {}  => void method
		
		Supplier<String> supplier = () -> "Raul"; // -> T, truyền void trả về T
		Callable<String> callable = () -> "Raul"; // Type interface
		
	}
}
