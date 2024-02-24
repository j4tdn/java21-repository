package file.text;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02FileReader {
	
	public static void main(String[] args) {
		// which file ?
		File file = new File("data/input.txt");
		
		if(!file.exists()) {
			System.out.println(">>> File '" + file.getName() + "' is not existed yet !");
			return;
		}
		
		// read file --> List<String>
		try {
			List<String> elements = Files.readAllLines(file.toPath());
			if (elements.size() != 0) {
				elements.remove(0);
			}
			List<String> numbers = elements.stream()
				.map(e -> e.split("[a-z]+")) // Stream<String>
				// stream<String[]> --> { {34,0}, }
				.flatMap(aof -> Arrays.stream(aof))
				.filter(e -> !e.isEmpty())
				.map(Integer::parseInt)
				.sorted()
				.map(String::valueOf)
				.toList();
			
			// convert # type || write target file
			File target = FileUtils.createNewFile("data/output.txt");
			Files.write(target.toPath(), numbers);
			
			FileUtils.open(target);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// opt: handle/
	}

}
