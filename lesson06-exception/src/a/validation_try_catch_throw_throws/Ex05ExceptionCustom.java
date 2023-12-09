package a.validation_try_catch_throw_throws;

import exception.InvalidImageException;

public class Ex05ExceptionCustom {
	
	/*
	 Kiểm tra tính hợp lệ của hình ảnh
	 	+ Tên file
	 	+ Đuôi file [jpg, jpeg, png, svg]
	 
	 */
	
	private static String[] imageExtensions = {"jpg" , "jpeg", "png", "svg"};
	
	public static void main(String[] args) {
		String[] files = {"hello.svg", "toi.png", "gbye.txt", "ta.jpeg"};
		
		for (String file : files) {
			if(!isValid(file)) {
				try {
					throw new InvalidImageException("File is an invalid image !!!");
				} catch (InvalidImageException e) {
					System.out.println("e --> " + e.getMessage());
				}
			} else {
				System.out.println("Uploaded file '" + file + "' successful");
			}
			
		}
	}
	
	private static boolean isValid(String file) {
		for (String ext : imageExtensions) {
			if(file.endsWith(ext)) {
				return true;
			}
		}
		return false;
	}
}