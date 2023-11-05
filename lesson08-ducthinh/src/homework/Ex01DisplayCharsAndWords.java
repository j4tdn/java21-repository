package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01DisplayCharsAndWords {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		String inputStr = inputString();
		displayCharsofStr(inputStr);
		displayWordsofStr(inputStr);
		displayCharsofStrDe(inputStr);
		displayWordsofStrDe(inputStr);
	}
	
	// input String function
	public static String inputString() {
		while(true) {
		System.out.println("Input string: ");
		String inputStr = ip.nextLine();
		if(isVietnameseStr(inputStr)) {
			System.out.println("The string just entered is approciate");
			return inputStr;			
		}else {
			System.out.println("The string just entered isn't approciate");
		}
		}
	}
	
	// check string Vietnamese function
	public static boolean isVietnameseStr(String inputStr) {
		Pattern pattern = Pattern.compile("^[a-zA-ZÀ-ỹỳỲáÁảẢãÃạẠâÂầẦấẤẩẨẫẪậẬăĂằẰắẮẳẲẵẴặẶèÈéÉẻẺẽẼẹẸêÊềỀếẾểỂễỄệỆíÍìÌỉỈĩĨịỊòÒóÓỏỎõÕọỌôÔồỒốỐổỔỗỖộỘơƠờỜớỚởỞỡỠợỢùÙúÚủỦũŨụỤưỪỪứỨửỬữỮựỰýÝỳỲỷỶỹỸỵỴ\\s]+$");
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}
	
	// display chars of string function
	public static void displayCharsofStr(String inputStr) {
		System.out.println("Display chars of string: ");
		char[] inputArr = inputStr.toCharArray();
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i]==' ') {
				continue;
			}
			System.out.println(inputArr[i]);
		}
	}
	// display words of string function
	public static void displayWordsofStr(String inputStr) {
		System.out.println("Display words of string");
		String[] inputStrArr = inputStr.split(" ");
		for(int i=0; i<inputStrArr.length; i++) {
			System.out.println(inputStrArr[i]);
		}
	}
	// display char of string reverse
	public static void displayCharsofStrDe(String inputStr) {
		System.out.println("Display chars of string reverse: ");
		char[] inputArr = inputStr.toCharArray();
		for(int i=inputArr.length-1; i>=0; i--) {
			if(inputArr[i]==' ') {
				continue;
			}
			System.out.println(inputArr[i]);
		}
	}
	// display words of string function reverse
		public static void displayWordsofStrDe(String inputStr) {
			System.out.println("Display words of string reverse:");
			String[] inputStrArr = inputStr.split(" ");
			for(int i=inputStrArr.length-1; i>=0; i--) {
				System.out.println(inputStrArr[i]);
			}
		}
	
}
