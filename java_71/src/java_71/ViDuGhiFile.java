package java_71;

import java.io.PrintWriter;
import java.nio.charset.Charset;

public class ViDuGhiFile {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("D:\\workspace\\java21\\2.JAVA\\java_71\\file.txt", "UTF-8");
			pw.print("xin chào");
			pw.print(" ");
			pw.print("Thinh");
			pw.close();
		} catch (Exception e) {
			
		}
	}
}
