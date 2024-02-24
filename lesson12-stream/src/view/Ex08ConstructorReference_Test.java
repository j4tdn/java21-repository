package view;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import view.Ex07ConstructorReferenceExamples;
import view.Ex07ConstructorReferenceExamples.TestCon;

public class Ex08ConstructorReference_Test {

	public static void main(String[] args) {
		List<String> lines = readFile("testcon_data.txt");
		lines.forEach(line -> {
			System.out.println("line(string) -> " + line);
		});
		
		System.out.println("\n=\n");
		
		// convert line(string) to testcon(object)
		List<TestCon> result = new ArrayList<>() ;
		lines.forEach(line -> {
			String[] tokens = line.split(", ");
			if (tokens.length == 4) {
				Integer a1 = Integer.parseInt(tokens[0]);
				String a2= tokens[2];
				LocalDate a3 = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy")) ;
				BigDecimal a4 = new BigDecimal(tokens[3]);
			}
		});
		
	}
	
	public static TestCon transfer(String line) {
		String[] tokens = line.split(", ");
		TestCon tc = new TestCon();
		if (tokens.length == 4) {
			Integer a1 = Integer.parseInt(tokens[0]);
			String a2 = tokens[2];
			LocalDate a3 = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
			BigDecimal a4 = new BigDecimal(tokens[3]);
			tc = new TestCon();
		}
		return tc;
	}
	
	public static TestCon convert(String line) {
		String[] tokens = line.split(", ");
		TestCon tc = new TestCon();
		if (tokens.length == 4) {
			Integer a1 = Integer.parseInt(tokens[0]);
			String a2 = tokens[2];
			LocalDate a3 = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
			BigDecimal a4 = new BigDecimal(tokens[3]);
		}
		return tc;
	}
	
	private static ArrayList<String> readFile(String pathFile) {
		File file = new File(pathFile);
		return readFile(pathFile);
//		try {
//			return File.(path);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return List.of();
	}
	
}
