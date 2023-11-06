package ex05;

import java.util.Arrays;
import java.util.Scanner;

import view.InvalidInputValidation;

public class Ex05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String input1 = "";
	String input2 = "";
	boolean validString = false;
	int count = 0;
	char[] conventerStrChar = null ;
	while (!validString) {
		try {
			System.out.println("\nNhập sâu S1:  ");
			input1 = sc.nextLine();
			isValidString(input1, "Sâu S1 không hợp lệ. ");
			System.out.println("\nEnter your string: ");
			input2 = sc.nextLine();
			isValidString(input2, "Sâu S2 không hợp lệ");
			validString = true;
			conventerStrChar = input1.toCharArray();
		} catch (InvalidInputValidation e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	char[] arraysChar1 = input1.toCharArray();
	char[] arraysChar2 = input2.toCharArray();
	char[] result = new char[arraysChar1.length];
	if(arraysChar1.length>=arraysChar2.length) {
		for(int i = 0; i<arraysChar2.length; i++) {
		
			if(arraysChar1[i]==arraysChar2[i]) {
			result[i]='T';
			} 	else {
			result[i]='F';
			}
		}
	}
	else if(arraysChar1.length<arraysChar2.length) {
		for(int i = 0; i<arraysChar1.length; i++) {
			
			if(arraysChar1[i]==arraysChar2[i]) {
				result[i]='T';
			} else {
				result[i]='F';
			}
		}
	}
	int max = 0;
	int countMax = 0;
	int position = 0;
	for(int i = 0; i < result.length;i++) {
		if(result[i]=='T') {
			countMax++;
			if(max < countMax) {
				max = countMax;
				position = i;
			}
		} else if(result[i]=='F') {
			if(countMax>max) {
			max = countMax;
			position = i-1;
			}
			countMax = 0;
		}
	}
	System.out.println(max);
	System.out.println(position);
	String resultStringArray = "";
	for(int i = (position-max+1);i<=position;i++) {
		resultStringArray+=conventerStrChar[i];	
	}
	System.out.println(" Sâu chuỗi dài nhất trùng nhau S1 và S2 là: "+resultStringArray);
}
	private static void isValidString(String text, String message) throws InvalidInputValidation {
	String pattern = "^[A-Z]+$";

		if (!text.matches(pattern)) {
		throw new InvalidInputValidation(message);
		}
	}
}

