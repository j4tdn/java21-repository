package ex03;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập n = ");
		int n = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[n + 2];
		int temp = 1, temp2 = 1;
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= i + 1; j++) {
				
				if(j == 0 || j == i + 1) {
					System.out.print(1 + " ");
					arr[j] = 1;
				} else {
					temp = arr[j];
					arr[j] = arr[j] + temp2;
					temp2 = temp;
					System.out.print(arr[j] + " ");
				}
				
			}
			System.out.println("");
			
		}
		sc.close();
	}
}
