package ex01;

public class Ex01 {
	public static void main(String[] args) {
		
		int[] arr1 = {2, 8, 9, 1, 6};
		int[] arr2 = {2, 1, 1, 8, 9};
		int[] result = new int[arr1.length];
		
		int count = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				if(arr1[i] == arr2[j]) {
					result[count] = arr1[i];
					count++;
					break;
				}
			}
		}
		
		for(int i = 0; i < count; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
