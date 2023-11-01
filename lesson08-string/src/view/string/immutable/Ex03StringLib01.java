package view.string.immutable;

public class Ex03StringLib01 {
	public static void main(String[] args) {
		
		String s = "welcom to class  ";
		
		// Tính chiều dài của chuỗi s --> length
		
		// Nối chuỗi s1 vào chuỗi s --> +, concat
		
		// Lấy một ký tự tại vị trí index(3) trong chuỗi s
		char letter = s.charAt(3);
		System.out.println("letter: " + letter);
		
		// Duyệt từng ký tự trong chuỗi
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println("\n");
		
		// Duyệt từng từ trong chuỗi, các từ cách nhau bởi space
		// thủ công
		s = s.strip().replaceAll("\\s+", " ");
		String word = "";
		for(int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			if (tmp == ' ') {
				System.out.println("word: " + word);
				word = "";
			} else {
				word = word + tmp;
				if (i == s.length() - 1) {
					System.out.println("word: " + word);
				}
			}
		}
		
		// Dùng hàm có sẵn --> split
		s = "welcom    to     our   class  ";
		String[] tokens = s.strip().split("\\s+");
		for (String token: tokens) {
			System.out.println("token --> |" + token + "|");
		}
		
		// Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự “c” trong chuỗi s
		// bắt đầu: 3
		// kết thúc: 23
		System.out.println("Vị trí bắt đầu của 'c' -->" + s.indexOf("c"));
		System.out.println("Vị trí kết thúc của 'c' -->" + s.lastIndexOf("c"));
	}
}
