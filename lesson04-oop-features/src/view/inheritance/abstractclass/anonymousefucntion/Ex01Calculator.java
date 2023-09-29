package view.inheritance.abstractclass.anonymousefucntion;

public class Ex01Calculator {
	public static void main(String[] args) {
		int a = 10, b = 2;
		// Anonymous class: tạo ra một đối tượng giá trị KDL Strategy
		System.out.println("Sum --> Strategy: " + cal(a, b, new Strategy() {
			@Override
			public int process(int a, int b) {
				return a + b;
			}
		}));
		
		// Thay vì anonymous function(hàm ẩn danh) để hiện cho đối tượng "functional interface"
		// Functional interface là chỉ có duy nhất một hàm trừu tượng(abstract class)
		// Là hàm không có tên, dùng để override hàm trừu tượng trong 'functional interface'
		// anonymous function == lambda ex
		// lambda expression là một cách viết ngắn gọn để tạo ra một functional interface
		Strategy divStra = (int x, int y) -> {
			return x / y;
		};
		System.out.println("Div --> Strategy: " + cal(a, b, divStra));
		
		Strategy subStra = (x, y) -> x - y;
		System.out.println("Sub --> Strategy: " + cal(a, b, subStra));
		
		Strategy mulStra = (x, y) -> x * y;
		System.out.println("Mul --> Strategy: " + cal(a, b, mulStra));
		
		// Mục đích: giải quyết các bài toán có chung đặc điểm a, b
		// Nhưng trong làm gì thì do người dùng truyền vào
//		System.out.println("Div --> Strategy: " + cal(a, b, new Strategy() {
//			@Override
//			public int process(int a, int b) {
//				return a / b;
//			}
//		}));

	}
	private static int cal(int a, int b, Strategy strategy) {
		return strategy.process(a, b);
	}
}
