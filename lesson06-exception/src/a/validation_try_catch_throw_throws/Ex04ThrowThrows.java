package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04ThrowThrows {
	public static void main(String[] args) {
		System.out.println("Ex04 - Start");
		try {
			creatFile("data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Ex04 - End");
	}
	
	private static File creatFile(String path) throws IOException {
		File file = new File(path);
		if(file.exists()) {
			System.out.println(">>> File "+ file.getName()+" is available");
			return file;
		}
		boolean isSuccess = file.createNewFile();
		String messenge = isSuccess ? "successful" : "failed";
		if(isSuccess) {
			System.out.println("File "+file.getName()+" is created "+messenge);
		} else{
			
		}
		return file;
		
	}
}

