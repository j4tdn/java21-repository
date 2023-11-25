package view.string.immutable;

public class Ex03StringLib01 {
	public static void main(String[] args) {
		String s = "welcom to class";
		//Tính chiều dài của chuỗi s --->length
		//Nối chuỗi s1 vào s
		//Lấy 1 kí tự tại vị trí index(3) trong chuỗi s
		//duyệt từng kí tự, từ trong chuỗi
		//duyệt từng kí tự trong chuỗi
		
		//duyệt từng từ trong chuỗi
		String word = "";
		for(int i =0; i< s.length(); i++) {
			System.out.println(s.charAt(i) +" ");
			
		}
		System.out.println("\n\n");
		s = s.strip().replaceAll("\\s+", " ");
		System.out.println("s replace  --->" +s); 
		}
		// split 
		// trip
	//indexof lấy ra vị trí đầu tiên của từ muốn lấy
	//lastIndexOf lấy vị trí cuối cùng của từ muốn lấy
		//Tìm vị trí- chỉ số xuất hiện đầu tiền, cuối cùng của kí tự "a" trong chuỗi s
	}

