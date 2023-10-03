package view.strategy.practice;

public class Ex01Calculator {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println("sum --> " + sum(a,b));
		
		System.out.println("sum stratrgy --> " + calc(a, b, new Strategy() {
			// anonymous class
			@Override
			public int process(int x, int y) {
				return x + y;
			}
		}));
		
		
		System.out.println("sub --> " + sub(a,b));
		System.out.println("mul --> " + mul(a,b));
		
		
		//from jdk1.8
		//--> using 'ananymous function' to create an instance for 'functional' interface
		// functional interface is interface has abstract method
		/*Strategy mulStrategy = new Strategy() {
			
			@Override
			public int process(int x, int y) {
				return x * y;
			}
		};*/ 
		
		Strategy mulStrategy = (int x,int y) -> {
			return x * y;
		};
		
		
		
		System.out.println("div --> " + div(a,b));
		
		//Strategy divStrategy = (x,y) -> x * y;
		
		System.out.println("div --> " + calc(a, b, (x, y) -> x / y));
		
		
	}
	
	private static int calc (int a, int b, Strategy strategy) {
		return strategy.process(a, b);
	}
	
	private static int sum (int a, int b) {
		return a + b;
	}
	
	private static int sub (int a, int b) {
		return a - b;
	}
	
	private static int mul (int a, int b) {
		return a * b;
	}
	
	private static int div (int a, int b) {
		return a / b;
	}
}


