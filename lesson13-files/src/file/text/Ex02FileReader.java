package file.text;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02FileReader {
	public static void main(String[] args) {
		// which file?
		File file = new File("data/input.txt");
		
		if(!file.exists()) {
			System.out.println(">>> File '" + file.getName() + "' is not existed yet!");
			return;
		}
		
		// read file --> List<String>
		
		try {
			List<String> elements = Files.readAllLines(file.toPath());
			// opt: handle/process login
			// lines = {4,43silos0,zita002,le2sim,231233}
			int size = elements.size();
			if(size != 0) {
				elements.remove(0);
			}
			List<String> numbers = elements.stream()
			    .map(e -> e.split("[a-z]+")) // Stream<String>
				// Stream<String[]> --> { {43, 0}, {"", 002}, {2, 77}, {231233}}
				.flatMap(aof -> Arrays.stream(aof))
				// Stream<String> --> {43, 0, "", 002, 2, 77, 231233}
				.filter(e -> !e.isEmpty())
				.map(Integer::parseInt)
				.sorted()
				.map(String::valueOf)
				.toList();
			
			// convert # type
			File target = FileUtils.createNewFile("data/output.txt");
			Files.write(target.toPath(), numbers);
			
			FileUtils.open(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	

		
	}

}
