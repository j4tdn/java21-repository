package a.validation_try_catch_throw_throws;

import java.io.File;

public class Ex04Exception_Throw_Throws {
	public static void main(String[] args) {
		
	}
	
	// path = [folder]../..filename.ex(txt, jpg, pdf)
	private static File creaFile(String path) {
		File file = new File(path);
		
		boolean isSuccess = file.createNewFile();
		
		return file;
	}
	
}
