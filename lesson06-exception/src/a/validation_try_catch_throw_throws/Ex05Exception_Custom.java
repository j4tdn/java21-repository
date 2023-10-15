package a.validation_try_catch_throw_throws;

import Exception.InvalidImagaException;

public class Ex05Exception_Custom {
/*
 KIểm tra tính hpự lệ của hình ảnh
 	+Tên file
 	+Đuôi file(.....)
 	
 */

	private static String[] imageExtensions = {"jpg" , "jpeg" , "png" , "svg"};
	
	public static void main(String[] args) {
		String[] files = {"hello.svg", "toi.png","gbye.txt ", "ta.jpeg"};
		
		for (String file : files) {
			if(!isValid(file)) {
				try {
					throw new InvalidImagaException("File " +file +" is an invalid image !!!");
				} catch(InvalidImagaException e) {
					System.out.println("e --> " +e.getMessage());
				}
				
			} else {
				System.out.println("Uploaded file "+ file + " successful");
				
			}
			System.out.println();
		}
	}
	private static boolean isValid(String file) {
		for(String ext : imageExtensions) {
			if(file.endsWith(ext)) {
				return true;
			}
		}
		return false;
	}
}
