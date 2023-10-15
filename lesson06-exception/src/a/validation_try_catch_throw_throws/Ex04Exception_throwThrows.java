package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04Exception_throwThrows {

	// validation: validation trước đoạn code có khả năng bị exception
	// try-catch: đưa đoạn code có khả năng bị exception vào khối try

	// throw_throws

	public static void main(String[] args) {
		try {
			createFile("data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static File createFile(String path) throws IOException {
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println(file + " da ton tai !");
			return file;
		}
		
		boolean isSucces = file.createNewFile();
		
		String message = isSucces ? "successfull" : "failed";
		
		System.out.println("File " + file.getName() + " is created " + message);
		
		return file;
	}

}
