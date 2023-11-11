package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07Exception_Finally {
	
	public static void main(String[] args) {
		System.out.println("Started writing file");
		
		String[] employees = mockData();
		File file = new File("data.txt");
		FileWriter fw = null;
		try {
			// open connect file
			fw = new FileWriter(file);
			for (String employee : employees) {
				String newLine = createNewLine(employee);
				if(newLine != null) {
					fw.write(newLine + "\n");
					System.out.println(">>>>" + newLine);
				}
			}
		} catch (NumberFormatException | IOException e) {
			
		} finally {
			close(fw);
		}
		System.out.println("Finished write file");
	}
	
	private static String createNewLine(String employee) {
		String newLine = null;
		try {
			String[] tokens = employee.split(", ");
			String id = tokens[0];
			String name = tokens[1];
			int age = Integer.parseInt(tokens[2]);
			int factor = (age - 18) * 2;
			newLine = id + ", " + name + ", " + factor;
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			System.out.println("Skip line -->" + employee + " is invalid format !!!");
		}
		return newLine;
	}
	
	private static void close(FileWriter fw) {
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String[] mockData() {
		return new String[] {
			"1, Le A, 26",
			"1, Le B, 22t",
			"1, Le C, 23",
			"1, Le D, 24",
			"1, Le E, 25",
			"1, Le F, 28",
			"1, Le G, 29",
			// ..........
			"80, Le H, 21",
			"81, Le K, 22",
			// ..........
			"100, Le L, 34",
		};
	}
}
