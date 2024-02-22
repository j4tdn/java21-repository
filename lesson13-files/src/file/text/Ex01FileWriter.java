package file.text;

import java.awt.Desktop;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.stream.Collectors;

import bean.Apple;
import model.Datamodel;
import utils.FileUtils;

public class Ex01FileWriter {
	
	public static void main(String[] args) {
		Path path = Paths.get("data", "inventory.txt");
		 
		File file = new File("data/inventory.txt");
		
		if(!file.exists()) {
			System.out.println(">>> File '" + file.getName() + "' is not existed yet !!");
			return;
		}
		
		// data(#file, java --> T, List<T>, Set<?>)...
		var apples = Datamodel.getApples();
		
		// --> convert List<String>
		var lines = apples.stream()
			.map(Apple::toLine)
			.collect(Collectors.toCollection(ArrayList::new));
		
		lines.add(0, "*** Danh sách mặt hàng ***");
		lines.add(1, "==========================");
		lines.add(2, "==========================");
		
		// --> write List<String> to target file
		try {
			Files.write(file.toPath(), lines);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		// awt open file
		FileUtils.open(file);
		
		// Each element in List<String --> 1 line in target file
		System.out.println(">>>finish<<<");
	}
	
}
