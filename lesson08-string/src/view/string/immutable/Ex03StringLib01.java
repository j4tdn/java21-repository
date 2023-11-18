package view.string.immutable;

public class Ex03StringLib01 {

	public static void main(String[] args) {
		
		// Tính chiều dài của chuỗi s
		String s = "welcome to class";
		
		// duyệt từ trong chuỗi dùng hàm có sẵn
		String[] tokens = s.strip().split("\\s+");
		for (String token: tokens) {
			System.out.println("tk--> |" + token + "| ");
		}
		}
	}


