package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.IOException;

public class Ex04Exception_ThrowThrows {
	
	//validation: valadation trước đoạn code cs khả năng bị exception
	// try catch: Đưa đoạn code có khả năng bị exception vào khối try catch
	
	// throw_throws
	// throw: ném expection trước khi đoạn code có khả năng bị exception xảy ra
	//      : ném khi mà expection xảy ra hay không phụ thuộc vào param truyền vào
	//      : lúc gọi hàm.  
	
	
	// compile, runtime exception
	// trong hàm : Nếu mình throw new runtime exception(RE)
	// 			   thì tại chổ khai báo hàm k bắt buộc phải throws ra RE
	//			   và nếu mình có throws RE thì nó vô nghĩa(RE k bắt buộc phải xử lý tại compile)
	
	public static void main(String[] args) {
		System.out.println("EX04 - Start");
		try {
			createFile("data.txt");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	//	createFile("test.txt");
		
		System.out.println("Ex04 - End ");
	}

	//path = [foder].../...filename.ext(txt, jpg, pdf)
	
	private static File createFile(String path) throws IOException {
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println(">>> File " + file.getName() + " is available");
			return file;
		}
		
		boolean isSuccess =	file.createNewFile();
		
		String message = isSuccess ? "successful" : "failed";
		
		if(isSuccess) {
			System.out.println("File" + file.getName() + " is created" + message);
		}
		
		return file;
	}
	
}
