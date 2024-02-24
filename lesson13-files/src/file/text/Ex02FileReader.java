package file.text;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02FileReader {
	
	public static void main(String[] args) {
		
		//file nào
		File file = new File("data/input.txt");

		if (!file.exists()) {
			System.out.println(">>>File " + file.getName() + " is not exited yes!!!");
			return;
		}
		// read file -->List<String>
	try {
		List<String> elements = Files.readAllLines(file.toPath());
		
		//optional: handle/ process logic
		//line = {4 ,43silos0, zita002, le2sim, 231233}
		if (elements.size() != 0) {
			elements.remove(0);
		}
		List<String> numbers = elements.stream()
		.map(e -> e.split("[a-z]+")) //stream<String>
		//Stream<String[]> --> { {43,0} , { "" , 002} , {"", 2, 77} , {2131233}
		.flatMap(aof -> Arrays.stream(aof))
		//Stream<String> --> {43, 0, "", 002, "", 2, 77, 2131233}
		.filter(e -> !e.isEmpty()) // có ký tự trống là loại
		.map(Integer::parseInt)
		.sorted()
		.map(String::valueOf)
		.toList();
		
		//convert # type || write to target file
		
		File target = FileUtils.createNewFile("data/output.txt");
		Files.write(target.toPath(), numbers);
		FileUtils.open(target);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
		
		
			
	
	//convert # type || write to target file
	}
}
