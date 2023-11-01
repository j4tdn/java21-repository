package view.string.immutable;

public class Ex03StringLib01 {
	public static void main(String[] args) {
		

//		• Tính chiều dài của chuỗi s --> length
//		• Nối chuỗi s1 vào chuỗi s ---> +, concat
//		• Lấy một ký tự tại vị trí index(3) trong chuỗi s 
		
//		char letter = s.charAt(3);
//		• Duyệt từng ký tự trong chuỗi
		
//		for(int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i) + " ");
//		}
		
//		Duyệt từng từ trong chuỗi, các từ cách nhau bởi space
		
		// làm thủ công
		String s  = "   welcome  to    class   ";
		s = s.strip().replaceAll("\\s+", " ");  //strip là cắt 2 đầu
		System.out.println("s replaced --> |||" + s + "|||");
		String word = "";
		for(int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			if(tmp == ' ') {
				System.out.println("word: " + word);
				word = "";
			} else {
				word = word + tmp;
				if(i == s.length() - 1) { //kiểm tra xem i đã đến cuối chuỗi s chưa
					System.out.println("word: " + word);
				}
			} 
		}
		
//		dùng hàm có sẵn split
		System.out.println("\n==================================\n");
		s  = "welcome   to  class   ";
		String[] tokens = s.strip().split("\\s+");
		for (String token : tokens) {
			System.out.println("tk --> |" + token + "|");
		}
		
		 
//		• Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự “c” trong chuỗi s 
		// --> bắt đầu : 3
		// --> kết thúc: 14
		System.out.println("\nvị trí bắt đầu của 'c' --> " + s.indexOf("c"));
		System.out.println("vị trí kết thúc của 'c' --> " + s.lastIndexOf("c"));
		
		
		
				
	}
}
