package lesson06_baitap;

public class bai4 {

	public static void main(String[] args) {
		Exception exception = new Exception();
		int[] numbers = { 6, 5, 25, 101, 203, 1820, 219 ,1, 10,100,200 ,20,456,229,14,24,320,310};
		for (int number : numbers) {
			System.out.println(number + " => " + exception.readNumber(number));
		}
	}
}