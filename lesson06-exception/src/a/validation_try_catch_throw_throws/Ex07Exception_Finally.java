package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07Exception_Finally {

	public static void main(String[] args) {
		System.out.println(" Started writing file");
		String [] employees = mockData();
		
		File file = new File("data.txt");
		FileWriter fw = null;
		try {
			// open/ connect file

			fw = new FileWriter(file);
			for (String employee : employees) {
				String newLine = createNewLine(employee);
				if (newLine != null) {
					fw.write(newLine + "\n");
					System.out.println(">>>>> " + newLine);
				}
			}
			//save //close file --> invalid  khi nội dung truyền vào bị exception
			//fw.close();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			//save //close file --> invalid  khi nội dung truyền vào không bị exception
			//fw.close();
		} finally {
			// luôn luôn được thực thi dùng try có bị exception, exception có bắt được hay không
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
			int age = Integer.parseInt(tokens[2]); // NFE
			int factor = (age - 18) * 2;

			newLine = id + ", " + name + ", " + factor;

		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			System.out.println("Skip line --> " + employee + "is  invalid format");
		}
		return newLine;

	}
	private static void close(FileWriter fw) {
		try {
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String[] mockData() {
		return  new String [] {
				"1, Le A, 26", 
				"2, Le B, 23",
				"3, Le C, 24",
				"4, Le D, 25",
				"5, Le E, 26",
				"6, Le F, 28",
				"7, Le G, 29",
				
				"100, Le F, 26",
				
				
		};
	}
}
