package file.text;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {
	
	public static void main(String[] args) {
		
		File file = new File("data/invetory.txt");
		
		if (!file.exists()) {
			System.out.println(">>> File '" + file.getName() + "' is not existed yet !");
			return;
		}
		// data(#file, java) --> T, List<T>,..
		var apples = DataModel.getApples();
		
		// --> convert to List<String>
		List<String> lines = apples.stream()
			.map(Apple::toLine)
			.collect(Collectors.toCollection(ArrayList::new));
		
		lines.add(0, "*** Danh sách các mặt hàng ***");
		lines.add(1, "==============================");
		// write List<String> to target file
		// Each element in List<String> -->
		try {
			Files.write(file.toPath(), lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// awt open file
		FileUtils.open(file);
		
		System.out.println("--Kết thúc--");
	}

}
