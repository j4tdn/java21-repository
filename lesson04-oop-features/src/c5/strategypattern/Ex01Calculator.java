package c5.strategypattern;

public class Ex01Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		
		System.out.println("sum -->" +sum(a,b));
		System.out.println("sum strategy -->" +calc(a, b, new Strategy() {
			
			@Override
			public int process(int x, int y) {
				return x+y;
			}
		}));
		System.out.println("sub -->" +sub(a,b));
		//anonymous to create an instance for intreface lớp ẩn danh	
		System.out.println("sub strategy -->" +calc(a,b, new Strategy() {
			
			@Override
			public int process(int x1, int y1) {
				return x1-y1;
			}
		}));
		System.out.println("mul -->" +mul(a,b));
		
		Strategy mulStrategy = (int x, int y) ->{
			 return x*y;
		};
		System.out.println("mul Strategy -->" +calc(a, b, mulStrategy));
		
		
		System.out.println("div -->" +div(a,b));
		
		Strategy divStrategy = (x,y) -> x/y;
		
		System.out.println("div Strategy -->" +calc(a,b, divStrategy));
	}
		// a+b
		// a-b
		// a*b
		// a/b
		//strategy: int process(a,b)
	// anonoymous class to create an instance for interface
	// from JDK 1.8
	//-> using 'anonymous function' to create an instance for 'functional' interface
	// functional interface is interface has ONE abstract method
	// 'anonymous function' is function without name to  override abstract method of 
	// 'anonymous function' --> lambda expression là 1 cách viết ngắn gọn để tạo ra 1 giá trị hay thể hiện  cho 1 biến
	// 
	private static int calc(int a, int b, Strategy strategy) {
		return strategy.process(a, b);
	}
	private static int sum(int a, int b) {
		return a+b;
	}
	private static int sub(int a, int b) {
		return a-b;
	}
	private static int mul(int a, int b) {
		return a*b;
	}
	private static int div(int a, int b) {
		return a/b;
	}
}
