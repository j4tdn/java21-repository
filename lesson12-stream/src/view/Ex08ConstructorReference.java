package view;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import utils.StreamUtils;
import view.Ex07ConstructorReferenceExamples.TestCon;

public class Ex08ConstructorReference {
	public static void main(String[] args) {
		List<String> lines = readFile("testcon_data.txt");
		
		lines.forEach(line -> {
			System.out.println("line -> " + line);
		});
		
		System.out.println("\n=\n");
		// convert line(String) to testcon(Object)
		List<TestCon> result = map(lines, TestCon::new);
		
		StreamUtils.generate("1. Converted Results", result);
	}
	
	private static <T, R> List<R> map(List<T> sources, Function<T, R> function){
		List<R> result = new ArrayList<>();
		sources.forEach(line -> {
			R r = function.apply(line);
		});
		return result;
	}
	
	private static List<String> readFile(String filepath){
		Path path = Paths.get(filepath);
		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return List.of();
//		map("1. Sorted Map", null)
	}
}
