package view;

import java.io.File;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import Utils.PredicateUtils;
import view.Ex07ConstructorReferenceExamples.TestCon;

public class Ex08ConstructorReference_TestData {

	public static void main(String[] args) {
		
		List<String> lines = readFile("Testcon_data.txt");
		lines.forEach(line ->{
			System.out.println("line --> " +line);
		});
		
		//convert line(string) to testcon(object)
		
		List<TestCon> resulf = map(lines, TestCon::new);
		PredicateUtils.generate("1. ", resulf);
		
	}
	
	private static <R> List<R> map(List<String > source,Function<String, R> function){
		List<R> result = new ArrayList<>();
		source.forEach(element -> {
			R r = function.apply(element);
			result.add(r);
		});
		return result;
	}
	
	public static List<String> readFile(String pathFile){
		Path path = Paths.get(pathFile);
		
		try {
			return Files.readAllLines(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return List.of();
		
	}
	
}
