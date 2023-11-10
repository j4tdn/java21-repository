package view.string.immutable;

public class Ex03StringLib01 {
	public static void main(String[] args) {
		
		String s = "welcome    to class";
		
		// Tính chiều dài của chuỗi s --length
		
		//Nối chuỗi s1 vào chuỗi s2 --> +, concat
		
		//Lấy một ký tự tại vị trí index(3), trong chuỗi s
		
		char letter = s.charAt(3);
		System.out.println("letter: " +letter);
		//Duyệt ký tự trong chuỗi
		for (int i = 0; i<s.length(); i++) {
			System.out.println(s.charAt(i) + "");
		}
		
		System.out.println("\n\n"	);
		//Duyệt từng từ trong chuỗi, các từ cách nhau bởi space 
		//s= s.strip();
				//System.out.println("Strip:");
		//Thủ công
		s =s.strip().replaceAll("\\s+", " ")	;
		// /s So khớp với bất kỳ ký tự trống nào (dấu cách, tab, xuống dòng), viết tắt của [\t\n\x0B\f\r]
		System.out.println("s replaced --> |||: " +s + "|||"); //nếu có nhiều khoảng trắng thì thay bằng 1 khoảng trắng
		String word = "";
		for (int i = 0; i<s.length(); i++) {
			char tmp = s.charAt(i);
			if ( tmp == ' ') {
				System.out.println("word: " +word);
				word = "";
			} else {
				word = word + tmp;
				if(i ==s.length()-1) {
					System.out.println("word: " +word);
				}
			}
		}
		System.out.println("==================");
		s = "welcome to  c our class";
		//Dùng hàm có sẵn --> split
		
		String [] tokens = s.strip().split("\\s+");
		for (String token:tokens) {
			System.out.println("tk --> |" +token + "|");
		}
		
		//Tìm vị trí - chỉ số xuất hiện đầu tiên cuối cùng của ký tự "a" trong chuỗi s
		// --> c bắt đầu: 3  (0,1,2,3)
		// --> c kết thúc: 15
		System.out.println("Vị trí bắt đầu của 'c' --> " +s.indexOf("c"));
		System.out.println("Vị trí kết thúc của 'c' --> " +s.lastIndexOf("c"));
	}
}
