package view;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import utils.CollectionUtils;
import view.Ex07ConstructorReferenceExamples.TestCon;

public class Ex08ConstructorReference_TestData {
	public static void main(String[] args) {
		List<String> lines = readFile("testcon_data.txt");
		lines.forEach(line -> 
			System.out.println("line --> "+line));	
		System.out.println("\n");
		
		
		
				
      //List<TestCon> result = map(lines, (line -> new TestCon(line)));
	    List<TestCon> result = map(lines , TestCon::new);
	  //List<TestCon> result = map(lines , TestCon::transfer);
		
		CollectionUtils.generate("1. Converted Resullt: ", result);
		 
	}
	
	private static List<String> readFile(String pathFile){
		Path path = Paths.get(pathFile);
		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return List.of();
	}
	private static <T, R> List<R> map(List<T> source, Function<T, R> function){
		List<R> result = new ArrayList<>();
		source.forEach(element -> {
			R r = function.apply(element);  //convert element qua KDL R
			result.add(r);
		});
		return result;
	}
}
