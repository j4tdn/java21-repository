package a.validation_try_catch_throw_throws;

import java.io.File;
import java.io.IOException;

//validation: validation trước đoạn code có khả năng bị exception
//try catch: đưa đoạn code có khả năng bị exception vào khối try

//throw_throws
	//throw: ném exception trước khi đoạn code có khả năng bị exception xảy ra
		 //: ném khi exception xảy ra hay không phụ thuộc vào  param truyền vào lúc gọi hàm
	//throws: ném compile exception ở chổ khai báo hàm để nơi gọi hàm nảy phải xử lý lỗi
	//			
	//compile, runtime exception
	// trong hàm: nếu mình throw new runtime exception (RE)
				//thì tại chổ khai báo hàm bắt buộc phải throws ra RE
				//và nếu mình có throws RE thì nó vô nghĩa (RE không bắt buộc xử lý tại compile)
	// trong hàm: Nếu mình throw new compile exception(CE)
				//thì tại chổ khai báo hàm bắt buộc phải throws ra CE
	//			  để chổ gọi hàm biết được bên trong hàm có CE -> bắt buộc phải xử lý tại compile

// mutiple exception
// custom exception
// try/catch  try/finally   try/catchh/finnally   
public class Ex04Exception_throwThrows {
	
	public static void main(String[] args) {
		System.out.println("Ex04 - Start");
		try {
			createFile("data_test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Ex04 - End");
	}
	// path = [folder] ../..filename.ext(txt,jpg,pdf...)
	//private static File	 createFile(String path) {
	//	File f = new File(path);
		//boolean isSuccess = File.createTempFile(path, path)
	//}
	private static File createFile(String path) throws IOException {
		File file = new File(path);
		
		if (file.exists()) {
			System.out.println(">>> File " +file.getName() + " is available");
			return file;
		}
		boolean isSuccess = file.createNewFile();

		String message = isSuccess ? "successful" : "failed";

		System.out.println("File " + file.getName() + " is created " + message);

		return file;
	}
}
