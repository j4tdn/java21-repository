package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07Exception_Finally {

	public static void main(String[] args) throws IOException {
		String[] employees = mockData();

		File file = new File("data.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for (String employee : employees) {
				String[] tokens = employee.split(", ");

				String id = tokens[0];
				String name = tokens[1];
				int age = Integer.parseInt(tokens[2]);
				int factor = (age - 18) * 2;

				String newLine = id + ", " + name + ", " + factor;
				fw.write(newLine + "\n");
				
				System.out.println("--> " + newLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				fw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	}

	private static String[] mockData() {
		return new String[] { 
				"1, Le A, 26",
				"2, Le B, 22",
				"3, Le C, 22",
				"4, Le D, 24",
				"5, Le E, 25",
				"6, Le F, 28",
				"7, Le G, 29",
				// ...........
				"80, Le X, 21",
				// .......
				"100, Le Y, 34", };
	}
}
