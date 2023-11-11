
package ex03;

public class Ex03 {
	
	public static void main(String[] args) {
		
		int[] arr = {8, 5, 9, 20};
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(countDivisors(arr[i]) > countDivisors(arr[j])) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	private static int countDivisors(int number) {
		int count = 0;
		for(int i = 1; i <= number; i++) {
            if(number%i == 0) {
                count++;
            }
        }
		return count;
	}
}
