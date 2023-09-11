package baitap2;

import java.util.Random;

public class Ex10 {
	public static void main(String[] args) {
		
		boolean a[] = new boolean[11]; // a[i]=false với mọi i từ 20 -> 30
		Random rd = new Random();
		int index, count = 0;

		while (count != 5) {

			
			do {
				index = rd.nextInt(10);
			} while (a[index]);

		
			a[index] = true;
			System.out.print(index + 20 + " ");
			count++;
		}
	}
}

