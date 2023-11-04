package view.string.imutable;

public class Ex04StringLib02 {
	public static void main(String[] args) {
		String s = "cheers from da nang";
		
		// Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		
		System.out.println("start with hello --> " + s.startsWith("hello"));
		
		System.out.println("start with hello --> " + s.startsWith("cheers"));
		
		System.out.println("start with ng --> " + s.endsWith("ng"));
		
		// Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		
		s = s.replace("from", "to");
		System.out.println("s with replace: " + s);
		
		// Loại bỏ các khoảng trắng thừa của chuỗi s3 
		s = s.strip().replaceAll("\\s+", " ");
		System.out.println("s with replace all: " + s);
		
		// Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		String sub = s.substring(2);
		System.out.println("sub string --> " + sub);
		
		// Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay k
		System.out.println("string contains: " + s.contains("da"));
	}
}
