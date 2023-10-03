package view.functional.iinterface;

public class TextFunctionalInterface {
    
	public static void main(String[] args) {
		
	// Các cách tạo đối tượng cho 1 interface	
	// Interface bất kì     --> External class, Anonymous class 
	// Functional interface:--> "   "    "   ", "  "  "    "  ", Anonymous function(lambda expression)
	
	// C1: External class --> Tốn class
	// C2: Anonymous class --> Code dài
	Comparator ic1 = new Comparator() {
		
		@Override
		public int compare(int a, int b) {
			return a - b;
		}
	};
	
	System.out.println("Test anonymous class --> "+ ic1.compare(5, 7));
	
	// C3: Anonymous function (Từ java 8 trở đi)
	Comparator ic2 = (int a, int b) -> {
		return a + b;
	};
	System.out.println("Test anonymous class --> "+ ic2.compare(5, 7));
	
	//----------------------------------------------
	// Ko bắt buộc khai báo KDL cho các tham số
	// Nếu chỉ có 1 tham số --> có thể xóa phần ()
	// Nếu phần body chỉ có một dòng --> có thể xóa luôn phần {}
	//    body return void: code như bình thường
	//    body return !void: xóa chữ return
	Comparator ic3 = (a, b) -> a * b;
	System.out.println("Test anonymous class --> "+ ic3.compare(5, 7));
	
	// ---> strategy pattern
	}

}
