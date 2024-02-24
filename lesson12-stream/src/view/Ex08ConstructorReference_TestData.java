package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import utils.CollectionUtils;
import view.Ex07ConstructorReferenceExamples.TestCon;

public class Ex08ConstructorReference_TestData {

	public static void main(String[] args) {
		List<String> lines = readFile("testcon_data.txt");

		lines.forEach(line -> {
			System.out.println("line --> " + line);
		});

        //
		List<TestCon> result = map(lines, TestCon::new);
		
		CollectionUtils.generate("1. Converted result", result);

	}
	
	private static <T, R> List<R> map(List<T> source, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		source.forEach(element -> {
			R t = function.apply(element);
			result.add(t);
		});
		return result;
	}

	private static List<String> readFile(String pathFile) {
//		File file = new File(pathFile);
		Path path = Paths.get(pathFile);
		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			System.out.println(e);
		}
		return List.of();
	}

}
