package file.text;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataMode;
import utils.FileUtils;

public class Ex01FileWriter {

	public static void main(String[] args) {
	File file =	FileUtils.createNewFile("data/inventory.txt");
		
		if(!file.exists()) {
			System.out.println(">>>File " + file.getName() + " is not exited yes!!!");
			return;
		}
		//data(#File, java) --> T, List<T>, Set<?>...
		List<Apple> apples = DataMode.getApples();
		
		// -->convert to List<String>
		List<String> lines = apples.stream()
				.map(Apple::toLine)
				.collect(Collectors.toCollection(ArrayList::new));
		
		lines.add(0, "*** Danh sach mat hang***");
		lines.add(1,  "=========================");
		lines.add("============================");
		//-->write List<String> to target file
		
		//Each element in List<String> --> 1 line in target file
			try {
				Files.write(file.toPath(), lines);
			}catch (IOException e) {
				e.printStackTrace();
			}
			FileUtils.open(file);
		System.out.println(">>>>Kết thúc<<<");
	
	}
}
