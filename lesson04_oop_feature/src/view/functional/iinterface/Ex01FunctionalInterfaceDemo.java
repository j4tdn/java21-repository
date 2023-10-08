package view.functional.iinterface;

public class Ex01FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Đếm số lượng các phần tử chẵn
		System.out.println("Tong so chan : " + countIf(numbers, number -> number % 2 == 0));
		// Đếm số lượng các phần tử lẻ
		System.out.println("Tong so le : " + countIf(numbers, number -> number % 2 != 0));
		// Đếm số lượng các phần tử là bội của 3
		
		// Đếm số lượng các phần tử là bội của 5
		
		// --> Công thức chung(strategy) : boolean test(int number)
		
		// Tạo ra 1 functional interface với tên bất kì
		// Chứa hàm trừu tượng tên bất kì nhưng phải có công thức như strategy
		
		// strategy pattern
		// Viết ra 1 hàm truyền vào strategy là 1 hàm biết được số lượng tham số và KDL trả về
		// Khi nào ai gọi hàm này thì sẽ truyền nội dung strategy vào
	}
	
	public static int countIf(int[] numbers, IntTest intTest) {
		int count = 0;
		for (int number : numbers) {
			if(intTest.test(number)) {
				count++;
			}
		}
		return count;
	}
}
