package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04_Exception_ThrowThrows {

	// Validation: validation trước đoạn code có khả năng bị exception
	// try catch: đưa đoạn code có khả năng bị exception vào khối try

	// throw_throws
	// throw: ném exception trước khi đoạn code có khả năng bị exception xảy ra
	//		: ném khi mà exception xảy ra hay không phụ thuộc vào param truyền lúc gọi hàm
	// throws: ném compile exception ở chỗ khai báo hàm để nơi gọi hàm phải xử lí lỗi.
	
	// compile, runtime exception
	// trong một hàm: nếu mình throw new runtime exception thì tại chỗ khai báo hàm ko bắt buộc phải throws ra runtime exception(RE)
	// 				  và nếu mình có throws RE thì nó cũng vô nghĩa.(RE nó không bắt buộc phải  xử lý tại compile)
	// trong một hàm: nếu mình throw new compile exception thì tại chỗ khai báo hàm bắt buộc phải throws ra compile exception(CE)
	// 				  để chỗ gọi hàm biết đc bên trong hàm có CE --> bắt buộc xử lí tại compile
	
	// multiple exception
	// custom exception

	public static void main(String[] args) {
		System.out.println("Ex04 - Start");
		try {
			createFile("data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ex04 - End");
	}
	
	// path = [foder] ../.. filename.ext(txt, jpg, pdf)
	private static File createFile(String path) throws IOException {
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println(">>File " + file.getName() + " is available");
			return file;
		}
		
	 	boolean isSuccess = file.createNewFile();
	 	
	 	String message = isSuccess ? "successful" : "failed";
	 	
	 	System.out.println("File" + file.getName() + " is created " + message);
		
		return file;
	}
}
