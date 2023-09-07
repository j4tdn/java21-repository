package array;

public class Ex01Array {
	public static void main(String[] args) {
		int a[][] = new int[4][2];
		for(int i = 1; i < 4; i++) {
			for (int k = 1; k < 2;k++) {
				a[i][k]=i;
			}
			
		}
		System.out.println(a[3][0]);
	}
}
