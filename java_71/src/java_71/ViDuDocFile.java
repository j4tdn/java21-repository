package java_71;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ViDuDocFile {
	public static void main(String[] args) {
		/* Cách 1
		try {
			File file = new File("D:\\workspace\\java21\\2.JAVA\\java_71\\file.txt");
			BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while(true) {
				line = br.readLine();
				if(line == null) {
					break;
				}else {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		File file = new File("D:\\workspace\\java21\\2.JAVA\\java_71\\file.txt");
		try {
			List<String> allText = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
			for(String line : allText) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
