package codebyme;

import java.util.Random;
import java.util.Scanner;

public class Ex01Test {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner ip = new Scanner(System.in);
		
		System.out.print("text your name: ");
		String name = ip.nextLine();
		
		System.out.print("text your age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.print("text school: ");
		String school = ip.nextLine();
		
		
		
		int rn1 = rd.nextInt();
		System.out.println("random --> " + rn1);
		
		int rn2 = rd.nextInt(20, 21);
		System.out.println("random --> " + rn2);
		
		int rn3 = rd.nextInt(5);
		System.out.println("random --> " + rn3);


	}

}
