package homework.bai04;

import java.util.Scanner;

public class App04 {

	private static final Scanner sc = new Scanner(System.in);

	// Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước
	// số nguyên tố.
	// Ví dụ như các số 75 và 15 là nguyên tố tương đương vì cùng có các ước nguyên
	// tố là 3 và 5.
	public static void main(String[] args) {
		int n = enterNumber("Enter n: ");
		int m = enterNumber("Enter m: ");

		System.out.println("Các ước nguyên tố của " + n + " là: " + primeDivisor(n));
		System.out.println("Các ước nguyên tố của " + m + " là: " + primeDivisor(m));
		if (primeDivisor(n).equals(primeDivisor(m))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	// liệt kê các ước nguyên tố
	private static String primeDivisor(int n) {
		String primeDivisor = "";
		for (int i = 2; i <= n / 2; i++) {
			if (isPrime(i) && n % i == 0) {
				primeDivisor = primeDivisor + String.valueOf(i) + " ";
			}
		}
		return primeDivisor.strip();
	}

	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

//	private static boolean areEquivalentPrimes(long N, long M) {
//		Set<Integer> primeFactorsN = primeFactors(N);
//		Set<Integer> primeFactorsM = primeFactors(M);
//
//		// Kiểm tra xem tất cả các ước số nguyên tố của M có trong tập hợp của N hay
//		// không
//		return primeFactorsN.containsAll(primeFactorsM);
//	}
//
//	private static Set<Integer> primeFactors(long n) {
//		Set<Integer> factors = new HashSet<>();
//		for (int i = 2; i <= n; i++) {
//			while (n % i == 0) {
//				factors.add(i);
//				n /= i;
//			}
//		}
//		return factors;
//	}

	private static int enterNumber(String text) {
		int num = 0;
		do {
			try {
				System.out.print(text);
				num = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				System.err.println("Đầu vào phải là số nguyên dương. Vui lòng thử lại!");
			}
		} while (true);

		return num;
	}
}
