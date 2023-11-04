package view.string.immutable;

public class Ex04StringLi02 {

	public static void main(String[] args) {
		String s = "cheers from da nang";
		
		// kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		System.out.println("start with hello --> " + s.startsWith("hello"));
		System.out.println("start with hello --> " + s.startsWith("cheers"));
		System.out.println("end with ng -->" + s.endsWith("ng"));
		
		// thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		s = s.replace("from", "to");
		System.out.println("s with replace: " + s);
		
		// loại bỏ các khoảng trắng thừa của chuỗi s3\
		s = s.strip().replaceAll("\\s+", " ");
		System.out.println("\ns with replace all: " + s );
		
		// tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		String sub = s.substring(2);
		System.out.println("sub string --> " + sub);
		
		//
		System.out.println("string contains: " + s.contains("da"));
		
	}
}
