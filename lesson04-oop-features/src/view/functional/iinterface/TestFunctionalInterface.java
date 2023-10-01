package view.functional.iinterface;

public class TestFunctionalInterface {
	public static void main(String[] args) {
		// Tạo 1 đối tượng cho interface InComparator
		
		// Để tạo 1 đối tương (thể hiện) cho interface 
		//--> Sử dụng external class, anonymous class để tạo đối tượng cho 1 interface bất kì
		
		
		//Cách 1: External class
		// Tốn thêm class
		
		//Cách 2: Anonymous class
		// Dài code chỗ tạo đối tượng
		IntComparator ic1 = new IntComparator() {
			
			@Override
			public int compare(int a, int b) {
				return a - b;
			}
		};
		System.out.println( "Test anonymous class --> "+ ic1.compare(5, 7));
		
		
		
		
	    //lamda (anonymous function): là một cách viết ngắn gọn để mình tạo ra một đối tượng cho 1 functional interface
		
		//dùng lamda để tạo 1 đối tượng cho interface được không? ĐƯỢC, nhưng chỉ được cho functional interface
		
		
		//--> Sử dụng anonymous function (lamda expression) để tạo đối tượng cho 1 functional interface 
		// ( functional interface là interface có duy nhất 1 hàm trừu tượng) 
		
		// Cách 3: Anonymous function ( từ java 8 trở đi) 
		// Anonymous fucntion là đoạn dùng để override hàm trừu tượng từ interface
		// Hàm ẩn danh là hàm không có tên
		
		IntComparator ic2 = (int a, int b) -> {
			return a + b;
		};
		
		// không bắt buộc khai báo KDL cho các tham số
		// Nếu chỉ có 1 tham số --> có thể bỏ luôn ()
		// Nếu phần body chỉ có 1 dòng  --> có thể xóa luôn phần {}
		//   body return void : code như bình thường
		//   body return !void : xóa chữ return
		IntComparator ic3 = (a,b) -> a + b;
		
		System.out.println( "Test anonymous class --> "+ ic2.compare(5, 7));
	}
}
