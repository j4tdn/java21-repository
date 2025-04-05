package lesson23_thlong;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		
		String result = handleFile("input.txt","D:/JAVA21/05. FRONT END/java21-thlong-java/lesson23_thlong/output.txt");
		System.out.println(result);
		
	}
	
	private static String handleFile(String inputFile, String outputFile) {
		File file = new File(inputFile);
		
		if (!file.exists()) {
			return ">>> File '" + file.getName() + "' is not existed yet !!";
		}
		
		try {
			List<String> elements = Files.readAllLines(file.toPath());
			
			if (elements.size() != 0) {
				elements.remove(0);
			}
			List<String> numbers = elements.stream()
				.map(e -> e.split("[a-z]+"))
				.flatMap(aof -> Arrays.stream(aof)) 
				.filter(e -> !e.isEmpty())
				.map(Integer::parseInt)
				.sorted()
				.map(String::valueOf)
				.toList();
			
			File target = FileUtils.createNewFile(outputFile);
			Files.write(target.toPath(), numbers);
			FileUtils.open(target);
			
		} catch (IOException e) {
			e.printStackTrace();
			return "File bị lỗi";
		}
		
		return "Hoàn thành xử lý file";
	}
}
