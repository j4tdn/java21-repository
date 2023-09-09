package controlling;

import java.sql.SQLOutput;
import java.util.Random;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Ex01IfElse {
	public static void main(String[] args) {

// Random 1 số nguyên ngỗng nhiên từ 5 đến 20
		Random rd = new Random();
		int number = rd.nextInt(5, 20);

//Kiểm tra số nguyên đó có phải số chẵn không
		// if(number % 2 == 0) {
		if (isEven(number)) {
			System.out.println("Random number is an even number" + number);
		}
		System.out.println("Line 17- Finished");
		String password = "LeKhanhDuc";
		if (password.length() >= 10) {
			System.out.println("Đức Đẹp Trai");
		} else {
			System.out.println("Đức");
		}
		// Nhập vào điểm trung bình của học sinh
		// yêu cầu [0,10]
		// Nếu điểm mà
		// +[0, 5] : yếu
		// +[5, 6.5] : trung bình
		// +[6.5, 8] : khá
		// +[8, 10] : giỏi
		float diemHs = rd.nextFloat(11f);
		System.out.println("diemHs" + diemHs);
		if (diemHs > 10) {
			diemHs = 10;
		}
		if (diemHs < 5) {
			System.out.println("Học Sinh Yếu");

		} else if (diemHs < 6.5) {
			System.out.println("Học Sinh Trung Bình");
		} else if (diemHs < 8) {
			System.out.println("Học Sinh Khá");
		} else {
			System.out.println("Học Sinh Giỏi");

		}
		
		//VD: Tìm max của 2 số nguyên a, b
		int a = 10;
		int b = 5;
		int max = a > b ? a : b;
		//Chỉ dùng toán tử 3 ngôi khi biểu thức có 1 dòng code
		System.out.println("max--->"+max);

	}

	private static boolean isEven(int number) {

		return number % 2 == 0;
	}
}
