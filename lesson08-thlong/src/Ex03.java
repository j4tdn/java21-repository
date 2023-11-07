import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("Nhập chuỗi tiếng việt: ");
		Scanner ip = new Scanner(System.in);
		String str = ip.nextLine();
		System.out.println(convertStr(str));
	}
	
	private static String convertStr (String str) {
		String letter = Normalizer.normalize(str, Normalizer.Form.NFD);
		Pattern pt = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pt.matcher(letter).replaceAll("");
	}
	
}
