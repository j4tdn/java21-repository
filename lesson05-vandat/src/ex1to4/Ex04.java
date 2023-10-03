package ex1to4;

public class Ex04 {

	public static void main(String[] args) {
		int[] a = {1, 5, 8, 9, 2, 5, 9};
		System.out.println("Tổng -> " + sum(a));
	}
	private static int sum(int[] a) {
		int sum = 0;
		int max = a[0];
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			max = a[i] > max ? a[i] : max;
			min = a[i] < min ? a[i] : min;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != max && a[i] != min) {
				int check = 0;
				for (int j = 0; j < i; j++) {
					if (a[i] == a[j]) {
						check++;
					}
				}
				if (check == 0) 
					sum += a[i];
			}
		}
		
		return sum;
	}
}
