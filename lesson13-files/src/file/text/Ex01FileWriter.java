package file.text;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {

	public static void main(String[] args) {

		File f = new File("data/inventory.txt");
		
		if(!f.exists()) {
			System.out.println(">>> File '" + f.getName() + "' is not existed yet!!");
			System.exit(0);
		}
		
		// data(#file, java) --> T, List<T> , Set<?> ,....
		List<Apple> apples = DataModel.getApples();
		
		// ==> convert List<String>
		List<String> lines = apples.stream()
			.map(Apple::toLine)
			.collect(Collectors.toCollection(ArrayList:: new));
		System.out.println(lines);
		
	
		
		
		// ==> write List<String> to target file
		
		// Each element in List<String --> 1 line in target file
		
		try {
			
			Files.write(f.toPath(), lines);
			
		} catch (IOException e) {
		e.printStackTrace();
		}
		
		
		// awt open file
		FileUtils.open(f);
		
		System.out.println("Ket thuc");
	}
	
	
}
