package Ex04;
import java.util.Arrays;
public class UniqueNumber {
	public static void main(String[] args) {
		int[] a = {3, 15, 21, 0, 15, 17, 21};
		
		int[] b = new int[a.length + 1];
		
		int count = 0;
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[i] == a[j]) {
					b[count] = a[i];
					count++;
				}
			}
		}
		
		System.out.println(Arrays.toString(b));
		
	}
}
