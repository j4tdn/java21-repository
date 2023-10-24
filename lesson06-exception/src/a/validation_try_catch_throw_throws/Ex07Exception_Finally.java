package a.validation_try_catch_throw_throws;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Ex07Exception_Finally {
	public static void main(String[] args) {
		System.out.println("Started writing file");
		
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
				
				System.out.println(">>>> " + newLine);
			}
			//save/close file  --> để đây sẽ fail khi nội dung truyền vào bị exception
            //fw.close();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			try {
				fw.close();
				//save/close file
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		System.out.println("Finised write file");

	}

	private static String[] mockData() {
		return new String[] {
				"1, Le A, 26",
				"2, Le B, 22",
				"3, Le C, 23",
				"4, Le D, 25",
				"5, Le E, 27",
				"6, Le F, 26",
				"7, Le G, 29",
				//----------
				"80, Le X, 21",
				"81, Le Y, 22",
				//----------
				
				"100, Le W, 34",
		};
	}
}
