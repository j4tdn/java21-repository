package c5.functional;

    //static type
	// dynamic type
	// design pattern --> strategy pattern
   
public class Ex01Calculator {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		System.out.println("Sum --> "+ sum(a,b));
		
		// anonymous class to create an instance for interface
		System.out.println("Sum strategy --> "+ calc(a, b, new Strategy() {
			
			@Override
			public int process(int x, int y) {
				return x + y;
			}
		}));
		
		System.out.println("Sub --> "+ sub(a,b));
		
		// anonymous class to create an instance for interface
		System.out.println("Sub strategy --> "+ calc(a, b, new Strategy() {
			
			@Override
			public int process(int x1, int y1) {
				return x1 - y1;
			}
		}));
		
		// anonymous class to create an instance for interface
		// ** From JDK 1.8 --> using "anonymous function" to create an instance for 
		//                     functional interface
		// functional interface is interface has ONLY abstract method
		// "anonymous function" is the function without name to override abstract method of functional interface
		// "anonymous function" --> lambda expression
		
		/*
		        Strategy mulStrategy = new Strategy() {
			
			    @Override
			    public int process(int x, int y) {
				       return x * y;
			      }
		        }; 
		 */
		Strategy mulStrategy = (x, y) -> {
			return x * y;
		};
		System.out.println("Mul --> "+ mul(a,b));
		System.out.println("Mul strategy --> "+ calc(a, b, mulStrategy));
		
		//Strategy divStrategy = (x, y) -> x/y;
		System.out.println("Div --> "+ div(a, b));
		System.out.println("Div strategy --> "+ calc(a, b, (x, y) -> x/y));
		
	}
	
	// strategy: int process (a, b)
	private static int calc(int a, int b, Strategy strategy) {

		return strategy.process(a, b);

	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static int sub(int a, int b) {
		return a - b;
	}
	
	private static int mul(int a, int b) {
		return a * b;
	}
	
	private static int div(int a, int b) {
		return a / b;
	}
	
	
	

}
