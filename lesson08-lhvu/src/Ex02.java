import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

	Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập chuỗi ký tự bất kỳ:");
		String input = ip.nextLine().strip().replaceAll("\\s+", " ");
		System.out.println("input -->:" +input);
		
		display(input);
	}

	private static void display(String input) {
		StringBuilder s = new StringBuilder();
		String[] words = input.split("\\s"); //tach chuoi dua tren khoang trang
		for (String word : words) {
			String upperCaseFirstLetter = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
			s.append(upperCaseFirstLetter).append(" ");
			
		}
		System.out.println("format name:" +s);
	
}
}
