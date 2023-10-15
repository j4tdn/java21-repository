package view.functional.interfacee;

public class Ex01functionInterfaceDemo {

	public static int countIf(int[] numbers, IntTest inttest) {
		int count =0;
		for (int number : numbers) {
			if(inttest.test(number)) count++;
		}
		return count;

	}
	//đếm sô chắn
	public static int countEven(int[] numbers) {
		System.out.println();
		return 0;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		
		
		//đếm sô lẻ
		
		//đếm sô chia hết cho 3
		
		//đếm sô chia hết cho 5
		
		
		}
	}
	

