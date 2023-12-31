package view.string.immutable;

public class Ex04StringLib02 {
	public static void main(String[] args) {
		String s = "cheers from da nang";
		// Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuối s không
		
		System.out.println("start with hello --> " + s.startsWith("hello"));
		System.out.println("start with hello --> " + s.startsWith("cheers"));
		
		System.out.println("end with ng --> " + s.endsWith("ng"));
		System.out.println("end with ng --> " + s.endsWith("as"));

		// Thay thế chuỗi s1 bằng chuỗi s1 trong chuỗi s
		s = s.replace("from", "to"); // replace all with 'regex'
		System.out.println("s with replace: " + s);
		// Loại bỏ các khoảng trắng thừa của chuỗi s3
		s = s.strip().replaceAll("\\s+", " ");
		System.out.println("\ns with replace all: " + s);
		// Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2
		String sub = s.substring(2);
		System.out.println("\nSub string --> " + sub);
		// Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("\nstring contains: " + s.contains("da"));
	}
}