package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04Exception_Throw_Throws {
	public static void main(String[] args) {
		System.out.println("Ex04 - Start");
		
		try {
			creaFile("data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// path = [folder]../..filename.ex(txt, jpg, pdf)
	private static File creaFile(String path) throws IOException {
		File file = new File(path);
		
		if (file.exists()) {
			System.out.println(">>> File " + file.getName() + " is available");
			return file;
		}
		
		boolean isSuccess = file.createNewFile();
		
		String message = isSuccess? "successfull" : "failed";
		
		System.out.println("File " + file.getName() + " is created " + message);
		
		return file;
	}
	
	private static int divide(int a, int b) throws FileNotFoundException {
		if (b == 0) {
			throw new FileNotFoundException("e -> / by zero");
		}
		
		return a / b;
	}
}
