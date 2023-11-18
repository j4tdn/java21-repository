package view.string.immutable;

public class Ex04StringLib02 {

	public static void main(String[] args) {
		
		String s = "cheers from da nang";
		// Kiểm tra chuỗi có phải bắt đầu || kết thúc trong chuỗi s
		
		System.out.println("start with hello --> " + s.startsWith("cheers"));
		System.out.println("start with hello --> " + s.startsWith("from"));
		System.out.println("end with D --> " + s.endsWith("D"));
		
		// Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		
		s = s.replace("from", "to");
		System.out.println("\ns with replace: " + s);
		
		// loại bỏ khoảng trắng
		s = s.strip().replace("\\s+", " ");
		System.out.println("\ns with replace all : " + s);
		
		// tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		String sub = s.substring(2);
		System.out.println("sub string: " + sub);
		
		// Xác định chuỗi s2 có tồn tại trong chuỗi s1 k
		
		System.out.println("string contain: " + s.contains("da"));
		
	}
	
}
