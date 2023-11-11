import java.util.Scanner;

public class Ex03 {

	/*
	 * Bài 3(20đ): Cho dãy kí tự chứa các kí tự thường và khoảng trắng. Viết chương
	 * trình loại bỏ khoảng trắng thừa và đảo chuỗi như sau: 
	 * Example: 
	 * input: Welcome to JAVA10 class
	 * output: emocleW ot 01AVAJ ssalc
	 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập chuỗi ký tự bất kỳ: ");
		String input = ip.nextLine().strip().replaceAll("\\s+", " ");
		System.out.println("Chuỗi sau khi bỏ nhiều khoảng trắng: " + input);
		
		System.out.println("Chuỗi sau khi đảo: "+reverse(input));
	}

	public static String reverse(String s) {
		String words[] = s.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		return reverseWord.trim();
		
	}
}
