package bai6;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào vị trí cần in ra: ");
	int n=sc.nextInt();
	int h=0;
	int i=1;
	StringBuffer string = new StringBuffer("");
	while(h<=n) {
		String test = String.valueOf(i);
		i=i+1;
		string.append(test);
		h=string.length();
	}
	System.out.println(string);
	System.out.println("---------------------");
	System.out.println("Vị trí thứ "+ n +" là: "+string.charAt(n));
}
}
