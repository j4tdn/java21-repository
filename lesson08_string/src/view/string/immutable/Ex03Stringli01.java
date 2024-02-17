package view.string.immutable;

public class Ex03Stringli01 {

	public static void main(String[] args) {
		String s = "welcome to class";
		
		// tính chiều dài chuỗi s --> length
		
		// nối chuỗi s1 vào chuỗi s --> +, concat
		
		// lấy một ký tự tại vị trí index(3) trong chuỗi s
		char letter = s.charAt(3);
		
		// duyệt từng ký tự trong chuỗi
		for(int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		
		// duyệt từng từ trong chuỗi, các từ cách nhau bởi space
		// thủ công
		System.out.println();
		s = s.strip().replaceAll("\\s+", " ");
		System.out.println("s replace -->: " + s + "|||");
		String word = "";
		for (int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			if(tmp == ' ') {
				System.out.println("word: " + word);
				word = " ";
			}else {
				word = word + tmp;
				if(i == s.length() - 1) {
					System.out.println("word" + word);
				}
			}
		}
		
		// dung ham co san --> split
		//strip cắt đầu căt cuối
		s = "  welcome  to  class   ";
		String[] tokens = s.strip().split("\\s+");
		for(String token: tokens) {
			System.out.println("tk --> |" + token + "|");
		}
		
		// tìm vị trí - chỉ số xuất hiện đầu tiên, cuối cùng của kí tự 'c' trong chuỗi s
		// --> bắt đầu : 
		// --> kết thúc:
		System.out.println("vị trí đầu tiên của 'c' --> " + s.indexOf("c"));
		System.out.println("vị trí kết thúc của 'c' --> " + s.lastIndexOf("c"));
		
	}
}
