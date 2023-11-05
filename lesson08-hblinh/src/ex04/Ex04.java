package ex04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

import view.InvalidInputValidation;

public class Ex04 {
	static int count1 = 0;
	static int count2 = 0;
	static Long a1 = 0L;
	static Long b1 = 0L;
	static Long[] num1 = new Long[100];
	static Long[] num2 = new Long[100];
	static Long[] num21 = new Long[100];
	static Long[] num11 = new Long[100];
	static int countNew1 = 0;
	static int countNew2 = 0;
	static int l = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean validString = false;
		while (!validString) {
			try {
				System.out.println(" Nhập giá trị của số a: ");
				String a = sc.nextLine();
				System.out.println(" Nhập giá trị của số b");
				String b = sc.nextLine();
				isValid(a,b, "Vui lòng nhập lại !");
				validString = true;
			} catch (InvalidInputValidation e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		if(l==0) {
			checkNum(a1,b1);
			l = 1;
			if(l==1) {
				checkNum1();
				checkNum2();
				l=2;
				if(l==2) {
					resultNum();
				}
			}
		}
	}
	private static void isValid(String a, String b, String message) throws InvalidInputValidation {
		String pattern = "^[0-9]+$";

		if (!a.matches(pattern)&&!b.matches(pattern)) {
			throw new InvalidInputValidation(message);
		}
		a1 = Long.parseLong(a);
		b1 = Long.parseLong(b);
		Long c = 300000000000000000L;
		if ((a1<(2L))||a1>(c)||(b1<(2L))||b1>(c))
				 {
			throw new InvalidInputValidation(message);
			
	}}
	private static void checkNum(Long a1, Long b1) {
		
		for(Long i = 1L;i<= a1;i++) {
			if(a1%i==0) {
				num1[count1] = i;
				count1++;
			}
		}
		
		for(Long i = 1L;i<= b1;i++) {
			if(b1%i==0) {
				num2[count2] = i;
				count2++;
			}
		}
		
		
	}
	private static void checkNum1() {
		int count11 = 0;
		for(int i = 0; i < count1; i++) {
			for(int k = 1;k<=num1[i];k++) {
				if(num1[i]%k==0) {
					count11++;
				}
			}
			if(count11==2) {
				num11[countNew1] = num1[i];
				countNew1++;
			}
			count11 = 0;
		}
		
	}
	private static void checkNum2() {
		
		
		int count21 = 0;
		for(int i = 0; i < count2; i++) {
			for(int k = 1;k<=num2[i];k++) {
				if(num2[i]%k==0) {
					count21++;
				}
			}
			if(count21==2) {
				num21[countNew2] = num2[i];
				countNew2++;
			}
			count21 = 0;
		}
	}
	private static void resultNum() {
		int count3 = 0;
		if(countNew1==countNew2) {
			for(int i = 0; i < countNew1;i++) {
				if(num1[i]==num2[i]) {
					count3++;
				}
			}
		
			if(count3==countNew1) {
				System.out.println(" YES");
			} else{System.out.println(" NO");}
		} else {System.out.println("NO");}
	}
}
