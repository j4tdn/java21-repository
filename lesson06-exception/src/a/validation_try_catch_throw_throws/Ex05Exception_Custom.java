package a.validation_try_catch_throw_throws;

public class Ex05Exception_Custom {
	
		/*
		 Kiểm tra tính hợp lệ của hình ảnh
		 + tên file
		 + Đuôi file [jpg, jpeg, png, svg]
		 */
	
	private static String[] imageExtension = {"jpg", "jpeg", "png", "svg"};
	
	public static void main(String[] args) {
		
		String[] files = {"Hello.svg", "toi.png", "gbye.txt", "ta.jpeg"};
		
		for(String file: files) {
			if(!isValid(file)) {
				try {
					throw new InvalidImageException("File " + file + " is an invalid image!");
				} catch (InvalidImageException e) {
					System.out.println("e --> " + e.getMessage());
				}
			} else {
				System.out.println("Uploaded file '" + file + " 'successful");
			}
			System.out.println();
		};
	}

	private static boolean isValid(String file) {
		for(String ext:imageExtension) {
			if(file.endsWith(ext)) {
				return true;
			}
		}
		return false;
	}
}
