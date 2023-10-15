package a.validation_try_catch_throw_throws;

import exception.InvalidImageException;

/*
 * Kiểm tra tính hợp lệ của hình ảnh
 * + Tên file
 * + Đuôi file (jpg, png, jpeg, svg)
 */

public class Ex05Exception_Custom {
	
	private static String[] imageExtensions = {"jpg", "jpeg", "svg", "png"};
	
	public static void main(String[] args) {
		
		String[] files = {"hello.svg", "toi.png", "gbye.txt", "ta.jpeg"};
		
		for(String file: files) {
			if(!isValid(file)) {
				try {
					throw new InvalidImageException("File "+ file +" is an invalid image !");
				} catch (InvalidImageException e) {
					System.out.println("error: " + e.getMessage());
				}
			} else {
				System.out.println("Upload file " + file + " successful");
			}
			System.out.println();
		}
	}

	private static boolean isValid(String file) {	
		for(String ext: imageExtensions) {
			if(file.endsWith(ext)) {
				return true;
			}
		}
		return false;
	}
}
