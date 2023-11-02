package view.string.imutable;

public class Ex04StringLib02 {
	public static void main(String[] args) {
		String s = "cheers from da nang";
		// KIểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s hay
		// không
		System.out.println("start with hello --> " + s.startsWith("hello"));
		System.out.println("start with hello --> " + s.startsWith("cheers"));
		System.out.println("end with ng --> " + s.endsWith("ng"));

		// thay thế chuỗi s1 bằng chuỗi s1 trong chuỗi s

		s = s.replace("from", "to");
		System.out.println("s with replace: " + s);

		// Loại bỏ các khoảng trắng thừa của chuỗi s3
		s = s.strip().replaceAll("\\s+", " ");
		System.out.println("\ns with replace all: " + s);
		
		// Tạc chuỗi con của chuỗi s bắt đầu vị trí số 2
		String sub = s.substring(2);
		System.out.println("sub string --> " + sub);
		
		// Tạo chuỗi con của chuỗi s bát đầu từ vị trí s1 hay không
		System.out.println("String contains: " + s.contains("da"));
	}
}
