
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Nhập chuỗi: ");
		Scanner ip = new Scanner(System.in);
		String str = ip.nextLine();
		
		//In ra mỗi kí tự trên một dòng
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		//In ra mỗi từ trên mỗi dòng	
		System.out.println("\n========\n");
		String regex = "\\s+";
		String[] tokens = str.strip().split(regex);
		for (String token: tokens) {
			System.out.println(token);
		}
		
		//In ra chuỗi đảo ngược theo kí tự
		System.out.println("\n========\n");
		for (int i = str.length(); i > 0; i--) {
			System.out.println(str.charAt(i-1));
		}
		
		//In ra chuỗi đảo ngược theo từ
		System.out.println("\n========\n");
		for (int i = tokens.length; i > 0; i--) {
			System.out.println(tokens[i-1]);
		}
	}
	
	
	
	
}
