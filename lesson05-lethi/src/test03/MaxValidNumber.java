package test03;

import java.util.Scanner;

public class MaxValidNumber {

	public static int getMaxValidNumber(String n) {

		String[] str = n.split("[^0-9]+");
		int maxNumber = -1;

		for (String strs : str) {
			if (!strs.isEmpty()) {
				int currentNumber = Integer.parseInt(strs);
				if (currentNumber > maxNumber) {
					maxNumber = currentNumber;
				}
			}
		}

		return maxNumber;

	}

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập chuỗi : ");
		String n = ip.nextLine();
		
		if(getMaxValidNumber(n) != -1) {
			System.out.println("Max number is " + getMaxValidNumber(n));
		}else {
			System.out.println("Not found number");
		}
		
	}
}
