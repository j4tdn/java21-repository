package homework;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int a, b, c;

		while (true) {
			// Nhập giá trị cho a
			System.out.print("Nhập a = ");
			if (ip.hasNextInt()) {
				a = ip.nextInt();
				if (a >= 0 && a < 20) {
					break;
				} else {
					System.out.println("Lỗi: Vui lòng nhập lại giá trị a: ");
				}
			} else {
				System.out.println("Lỗi: Vui lòng chỉ nhập số nguyên.");
				ip.next(); // Đọc bỏ giá trị không hợp lệ
			}
		}

		while (true) {
			// Nhập giá trị cho b
			System.out.print("Nhập b = ");
			if (ip.hasNextInt()) {
				b = ip.nextInt();
				if (b >= 0 && b < 20) {
					break;
				} else {
					System.out.println("Lỗi: Vui lòng nhập lại giá trị b: ");
				}
			} else {
				System.out.println("Lỗi: Vui lòng chỉ nhập số nguyên.");
				ip.next(); // Đọc bỏ giá trị không hợp lệ
			}
		}

		while (true) {
			// Nhập giá trị cho c
			System.out.print("Nhập c = ");
			if (ip.hasNextInt()) {
				c = ip.nextInt();
				if (c >= 0 && c < 20) {
					break;
				} else {
					System.out.println("Lỗi: Vui lòng nhập lại giá trị c: ");
				}
			} else {
				System.out.println("Lỗi: Vui lòng chỉ nhập số nguyên.");
				ip.next(); // Đọc bỏ giá trị không hợp lệ
			}
		}

		// Tìm số lớn nhất và nhỏ nhất
		int max = Math.max(Math.max(a, b), c);
		int min = Math.min(Math.min(a, b), c);

		System.out.println("Số lớn nhất là: " + max);
		System.out.println("Số nhỏ nhất là: " + min);

		ip.close();
	}
}
