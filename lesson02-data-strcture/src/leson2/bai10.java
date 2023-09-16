package leson2;

import java.util.Random;

public class bai10 {
	public static void main(String[] args) {
		Random rd = new Random();
		int arr[] = new int[10];
		for (int i = 1; i <= 6; i++) {
			arr[i] = rd.nextInt(20, 31);
			//System.out.println(+i+ "--------" + arr[i]);
			if (i>=2)
				for (int j = 1; j <= i - 1; j++) {

					if (arr[i] == arr[j]) {
						// System.out.println("--------"+arr[i]);
						i = i - 1;
						j = 10;
					}
					// System.out.println("lllllllllk" +i);
				}
		//System.out.println(arr[i]);	
		}
		for(int i=1;i<=5;i++)
			System.out.println(" "+arr[i]);
	}
}
