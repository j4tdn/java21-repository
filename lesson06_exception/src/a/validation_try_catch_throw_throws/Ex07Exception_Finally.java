package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07Exception_Finally {
	public static void main(String[] args) throws IOException {
		String[] employees = mockData()
;		File file = new File("data.txt");
		System.out.println("Started writing file");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			for(String employee: employees) {			
				String newLine = createNewLine(employee);
				if(newLine != null) {
					fw.write(newLine + "\n");
					System.out.println(">>>>> " + newLine);
				}
				
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}finally {		
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static String[] mockData() {
		return new String[] {
				"1, Le A, 3",
				"2, Le B, 4",
				"3, Le C, 5"
		};
	}
	
	private static String createNewLine(String employee) {
		String newLine = null;
		try {
			String[] tokens = employee.split(", ");
			
			String id = tokens[0];
			String name = tokens[1];
			int age = Integer.parseInt(tokens[2]);
			int factor = (age - 18) * 2;
			
			newLine = id + ", " + name +", " + factor;			
						
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			System.out.println("Skip line --> " + employee + "is invalid format !!!");
		}
		return newLine;
	}
	
}
