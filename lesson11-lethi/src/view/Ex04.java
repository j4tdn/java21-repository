package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bean.Word;

public class Ex04 {

	public static void main(String[] args) {
		
		Map<String, Word> dictionary = new HashMap<>();
		
		Scanner ip = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Thêm từ mới ");
			System.out.println("2. Tra từ điển ");
			System.out.println("3. Thoát ");
			
			System.out.println("===Chọn chức năng (1-3)===");
			int choice = ip.nextInt();
			ip.nextLine();
			
			switch (choice) {
			case 1:
				addNewWord(ip, dictionary);
				break;
			case 2:
				search(ip, dictionary);
				break;
			case 3:
				System.out.println("Thoát");
			default:
				System.out.println("Vui lòng chọn từ 1 -> 3");
				break;
			}
		}
		
	}
	
	private static void addNewWord(Scanner ip, Map<String, Word> dictionary) {
		System.out.print("Nhập từ vựng: ");
		String word = ip.nextLine();
		
		if (dictionary.containsKey(word)) {
            System.out.println("Từ vựng \"" + word + "\" đã tồn tại trong từ điển.");
            return;
        }
		
		System.out.print("Nhập nghĩa: ");
		String mean = ip.nextLine();
		
		System.out.print("Nhập loại từ: ");
		String type = ip.nextLine();
		
		System.out.print("Nhập ghi chú: ");
		String note = ip.nextLine();
		
		Word newWord = new Word(word, mean, type, note);
		dictionary.put(word, newWord);
		System.out.println("Đã thêm \"" + word + " \" vào từ điển.");
	}
	
	private static void search(Scanner ip, Map<String, Word> dictionary) {
		System.out.print("Nhập từ cần tra: ");
		String searchWord = ip.nextLine();
		
		Word word = dictionary.get(searchWord);
		if(word != null) {
			System.out.println("\"" + searchWord + "\" có nghĩa là: " + word.getMean());
			System.out.println("Loại từ: " + word.getType());
			System.out.println("Ghi chú: " + word.getNote());
		}else {
			System.out.println("Không tìm thấy từ \"" + searchWord + "\" trong từ điển."); 
		}
	}
	
}
