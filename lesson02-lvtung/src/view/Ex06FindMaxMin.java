package view;

import java.util.Scanner;

// Viết chương trình tìm số nguyên lớn, nhỏ nhất trong 3 chữ số a,b,c
// Biết rằng a,b,c là số nguyên được nhập từ bàn phím và nhỏ hơn 20 [0, 20).

public class Ex06FindMaxMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = enterInteger("Nhập số nguyên trong khoảng [0, 20]: ", 0, 20, 5 );
		int b = enterInteger("Nhập số nguyên trong khoảng [0, 20]: ", 0, 20, 5 );
		int c = enterInteger("Nhập số nguyên trong khoảng [0, 20]: ", 0, 20, 5 );
		
		System.out.println("Số lớn nhất trong ba số trên là: " + findMax(a, b, c));
		System.out.println("Số nhỏ nhất trong ba số trên là: " + findMin(a, b, c));
		
		scanner.close();
	}
	
	public static int enterInteger(String prompt, int min, int max, int maximumNumber) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTries = 0;
		int n;
		
		while(numberOfTries < maximumNumber) {
			System.out.print(prompt);
			if (scanner.hasNextInt()) { //Phương thức này kiểm tra xem mã thông báo tiếp theo trong đầu vào của máy quét này có hiểu là một int sử dụng phương thức nextInt () hay không.
				n = scanner.nextInt();
				if (n >= min && n <= max) {
					scanner.close();
					return n;
				} else {
					System.out.println("n phải là số nguyên dương trong khoảng [" + min + " ," + max + "]. Hãy thử lại !");
				}
			} else {
				System.out.println("Vui lòng nhập một số nguyên !");
				scanner.next(); // Đọc bỏ dòng nhập không hợp lệ
			}
			numberOfTries++;
		}
		System.out.println("Bạn đã nhập sai quá " + maximumNumber + " lần. Kết thúc chương trình.");
		System.exit(0);
		scanner.close();
		return 0;
	}
	
	//hàm tìm max
	public static int findMax(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}
	
	// hàm tìm min
	public static int findMin(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
}
