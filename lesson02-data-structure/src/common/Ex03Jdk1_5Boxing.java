package common;

public class Ex03Jdk1_5Boxing {
	
	public static void main(String[] args) {
		
		//với những kiểu dữ liệu có sẵn(nguyên thủy và đối tượng) của Java
		//int 		Integer: int 
		//float 	Float  : float
		//long 		Long   : long 
		
		//int có thể nhận giá trị từ Integer --> ko cần ép kiểu 
		//Integer có thể nhận giá trị từ int --> ko cần ép kiểu 
		
		//từ v1.0 đến v1.4
		//chưa xuất hiện khái niệm auto-boxing, auto-unboxing
		
		//Từ v1.5
		//Xuất hiện khái niệm :
		
		//	auto-boxing  --> Java sẽ tự động convert kiểu nguyên thủy sang kiểu đối tượng tương ứng
		//  --> int(Integer), long(Long)
		
		//	auto-unboxing --> Java sẽ tự động convert kiểu đối tượng sang kiểu nguyên thủy tương ứng
		
		// CẨN THẬN KHI unboxing(đối tượng sang nguyên thủy)
		//đối tượng(null, value)
		//nguyên thủy(value)
		Integer a = 5;// Integer a = null;
		int b = a;
		System.out.println("b --> " + b);
		
	}
}
