import java.util.Scanner;
import java.text.Normalizer;
import java.util.regex.Pattern;


public class Ex03 {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	
	System.out.print("Nhập chuỗi ký tự bất kỳ:");
	String input = ip.nextLine().strip().replaceAll("\\s+", " ");
	System.out.println("input Tiếng Việt có dấu:" +input);
	
	System.out.print("input Tiếng Việt không dấu:" +removeAccent(input));
}



 
 public static String removeAccent(String s) {
  
  String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
  Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
  return pattern.matcher(temp).replaceAll("").replaceAll("đ", "d").replaceAll("Đ", "D");
 }
}
