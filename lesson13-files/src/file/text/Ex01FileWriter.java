package file.text;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;

public class Ex01FileWriter {

	public static void main(String[] args) {
		File file = new File("data/draft.txt");
		
		if (!file.exists()) {
			System.out.println(">>> File '" + file.getName() + "' is not exited");
			return;
		}
		// data(#file, java) --> T, List<T>, Set<?> ...
		var applies = DataModel.getApples();
		// --> convert List<String>
		List<String> lines = applies.stream()
			.map(Apple::toLine)
			.collect(Collectors.toCollection(ArrayList::new));
			//.toList(); ko dùng được vì toList() là imutable nên xuống dưới lines.add() sẽ ko đc
		lines.add(0, "ds mat hang");
		// --> write List<String> to target file
		
		// Each element in List<String> --> 1 line in target file
		try {
			Files.write(file.toPath(),lines);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//awt open file
		utils.FileUtils.open(file);
		
		System.out.println("finish");
	}
}
