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
		// read file --> List<String>
		if(!file.exists()) {
			System.out.println(">>> File '" + file.getName() + "' is not existed yet !!");
			return;
		}
		try {
			List<String> lines = Files.readAllLines(file.toPath());
			int size = lines.size();
			if (lines.size()!= 0) {
				lines.remove(0);
			}
			List<String> numbers = lines.stream()
				 .map(line -> line.split("[a-z]+"))// Stream<String[]> --> {{43,0}, {002}, {2, 77}, {2131233}}
				 .flatMap(aof -> Arrays.stream(aof)) // Stream<String> --> {43,0,002,2, 77,2131233}
				 .filter(e -> !e.isEmpty())
				 .map(i -> Integer.parseInt(i))
				 .sorted()
				 .map(String::valueOf)
				 .toList();
			File target = FileUtils.createNewFile("data/output.txt");
			Files.write(target.toPath(), numbers);
			FileUtils.open(target);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
		
		// opt: handle/process logic
		/*
		 *  4
			43silos0
			zita002
			le2sim
			231233
		 */
		
		// convert # type || write to target file
		
	}
}
