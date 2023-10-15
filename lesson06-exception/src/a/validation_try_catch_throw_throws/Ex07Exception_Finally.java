package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07Exception_Finally {
	public static void main(String[] args) {
		String[] employees = mockData();
		File file = new File("data.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			if(fw != null) {
				for (String employee : employees) {
					String[] tokens = employee.split(", ");
					String id = tokens[0];
					String name = tokens[1];
					try {
						int age = Integer.parseInt(tokens[2]);
						int factor = (age -18)*2;
						String newLine = id +", "+ name +", "+ factor;
						fw.write(newLine + "\n");
						System.out.println(">>>>" + newLine);
					} catch (NumberFormatException e) {
						String newLine = "Skip line" + id;
						fw.write(newLine + "\n");
						System.out.println(">>>>" + newLine);
					}
					}}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception ioe) {
				ioe.printStackTrace();
			}
		}
		System.out.println("Finished write file");
}
	private static String[] mockData() {
		return new String[] {
				"1, Le A, 26",
				"2, Le B, 26",
				"3, Le C, 26",
				"4, Le D, 2o",
				"5, Le E, 26",
				"6, Le F, 2o",
				"7, Le G, 26",
				//...........
				"80, Le X, 21",
				"81, Le Y, 22",
				//............
				"100, Le W, 34",
		};
				
		}
	
	

}
