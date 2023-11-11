package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		boolean isValidate = false;
		while(!isValidate) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhập số nguyên dương: ");
		String n = sc.nextLine();
		if(Integer.parseInt(n)>0) {
			isValidate = true;
		}
		if(n.toCharArray().length==1) {
			System.out.println(" "+n+ "là số không hạnh phúc.");
		}
		char[] nNumber = n.toCharArray();
			int[] arrNum = new int[nNumber.length];
			for(int i = 0; i < nNumber.length; i++) {
				arrNum[i] = Character.getNumericValue(nNumber[i]);
			}
			int isNum = 0;
			while(isNum!=1) {				
				for(int k = 0; k<arrNum.length;k++) {
				isNum+= k*k;
				}
				if(isNum==1) {
					System.out.println("Là số hạnh phúc");
				} else{
					for(int k = 0; k<arrNum.length;k++) {
						arrNum[k]=arrNum[k]-1;
						}
				for(int k = 0; k<arrNum.length;k++) {
					if(k<=0) {
						return;
					}
				}
				}
				}
			}
		}
		
	}
	

