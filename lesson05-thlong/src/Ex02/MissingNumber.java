package Ex02;

public class MissingNumber {
	public static void main(String[] args) {
		int[] numbers = {3, 7, 9, 2, 1, 4, 5, 8, 10};
		
		int temp = numbers[0];
        for (int i = 0 ; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        
		System.out.println(getMissingNumber(numbers));
		
	}
	
	public static int getMissingNumber (int[] numbers) {
		int count = 1;
		for (int number : numbers) {
			if (number == count) {
				count += 1;
				continue;
			} else {
				return number-1;
			}
	}
		return 0;
	}
}
	
	


