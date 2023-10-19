package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04Exception_ThrowThrows {
	
	 // validation: validation trước đoạn code có khả năng bị exception
	 // try catch: đưa đoạn code có khả năng bị exception vào khối try
		
	 // throw_throws
	 // throw: ném exception trước khi đoạn code có khả năng bị exception xảy ra
	 //	    : ném khi mà exception xảy ra hay ko phụ thuộc vào param truyền vào lúc gọi hàm
	 // throws: ném compile exception ở chỗ khai báo hàm để nơi gọi hàm này phải xử lí lỗi
	
	 // compile, runtime exception
	 // trong hàm: nếu mình throw new runtime exception(RE) thì tại chỗ khai báo hàm ko bắt buộc phải throws ra RE
	 //            và nếu mình có throws RE thì nó vô nghĩa(RE ko bắt buộc phải xử lí tại compile)
	 //
	
	public static void main(String[] args) {
		System.out.println("Ex04 - Start");
		try {
			createFile("data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Ex04 - End");
	}
	
	// path = [folder]../..filename.ext(txt, jpg, pdf)
	private static File createFile(String path) throws IOException {
		File file = new File(path);
		
		boolean isSuccess = file.createNewFile();
		
		String message = isSuccess ? "successful" : "failed";
		
		if(isSuccess) {
			System.out.println("File " + file.getName() + " is created" + message);
		}
		
		return file;
	}
	
}
