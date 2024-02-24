package test01;

import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Test01 {
	public static void main(String[] args) {
		double number;
		//number = inputNumber();
		
		findSimpleNum(1.34);
		
		//System.out.println("Number: " + number);
	}
	
	private static double inputNumber() {
		double number = 0;
		String input;
		int count = 0;
		Scanner ip  = new Scanner(System.in);
		do {
			System.out.print("Nhập số thực cần tìm: ");
			input = ip.nextLine();
			try {
				number = checkNum(input);
				break;
			} catch (NumberFormatException | VerifyNumException e) {
				count++;
				System.out.println(e.getMessage());
				if(count >= 3) {
					System.out.println("Bạn nhập sai quá + " + count + " lần ==> Kết thúc");
					break;
				}
			}
		} while (true);
		
		ip.close();
		return number;
	}
	private static double checkNum(String num) throws VerifyNumException {
		boolean isNum = false;
		double number = 0;
		try {
			number = Double.parseDouble(num);
			isNum = (number % 1) != 0 ? true:false;
			if(!isNum) {
				throw new VerifyNumException("Vui lòng nhập số thập phân khác 0 !!!");
			}
		} catch (Exception e) {
			throw new VerifyNumException("Vui lòng nhập số thập phân khác 0 !!!");
		}
		return number;
	}
	private static void findSimpleNum(double number) {
		String str;
		double size, num1, num2, divNum = 1;
		
		str = String.valueOf(number);
		str = str.substring(str.indexOf(".") + 1);
		size = str.length();
		for(int i = 0; i < size; i++) {
			divNum *= 10;
		}
		num1 =((number * divNum) + (number % 1));
		System.out.println("1: " + num1);
		num1 = num1 - number;
		System.out.println("2: " + num1);
		num2 = divNum;
		System.out.println("divNum: " + divNum + " num1: " + num1);
		size = size * 10;
		
	}
}
