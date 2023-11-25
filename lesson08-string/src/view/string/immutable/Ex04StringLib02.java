package view.string.immutable;

public class Ex04StringLib02 {
	public static void main(String[] args) {
		String s = "cheers from da nang";
		// kiem tra chuoi s1 co phai la chuoi bat dau hoac ket thuc trong chuoi s khong
		System.out.println("start with hello--->" + s.startsWith("hello"));
		System.out.println("start with hello --->" + s.startsWith("cheers"));
		System.out.println("end with ng--->" + s.endsWith("ng"));

		// thay the chuooi s1 bang chuoi s2
		s = s.replace("from", "to");
		System.out.println("s with replace:" + s);

		// loai bo cac khoang trang thua trong chuoi
		s = s.strip().replaceAll("\\s+", " ");
		System.out.println("\ns Wish replace all: " + s);

		// tạo chuỗi con của chuỗi s bắt đầu từ vị trị thứ 2
		String sub = s.substring(2);
		System.out.println("sub string--->" + sub);
		
		//xác định chuỗi s2 có tồn tại trong chuỗi s1 không
		System.out.println("String contains:"+ s.contains("da"));

	}
}
