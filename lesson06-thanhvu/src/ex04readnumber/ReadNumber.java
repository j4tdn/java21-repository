package ex04readnumber;

public class ReadNumber {

	public static String readNumber(int n) {
		String[] hangdonvi = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
		String[] hangchuc = { "", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi",
				"tám mươi", "chín mươi" };
		String[] hangtram = { "", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm", "bảy trăm",
				"tám trăm", "chín trăm" };
		String result = "";
		int donvi = n % 10;
		int chuc = (n / 10) % 10;
		int tram = n / 100;

		if (n == 0) {
			result = "không";
		}

		if (tram >= 0) {
			result += hangtram[tram] + " ";
		}
		if (chuc > 0) {
			result += hangchuc[chuc] + " ";
		}
		if (donvi >= 0) {
			if(chuc == 0 && tram != 0 && donvi!=0) {
				result += "linh " ;
			}
			result += hangdonvi[donvi] + " ";
		}
		return result;
	}

	public static void main(String[] args) {
		int[] numbers = { 6, 5, 25, 101, 321, 820, 219, 102, 21, 48, 229};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " --> " + readNumber(numbers[i]));
		}

	}
}
