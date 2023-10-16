package bai1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class mainn {
	public static int maxCheckArr(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static boolean check(int n) {
		if (1 <= n && n <= 3) {
			return true;
		}
		return false;
	}

	public static BigInteger bigIntger(int n) {
		BigInteger a = new BigInteger(String.valueOf(n));
		return a;
	}

	public static void count(int n,int[] arr, String[] s, int[] a) {
		if(s.length>n+1) {
			System.out.print("File khong hop le o dong nay: ");
			for(int i=0;i<s.length;i++) {
				System.out.print(Integer.parseInt(s[i]) + " ");
			}
			System.exit(0);
		}
		if (check(Integer.parseInt(s[0]))) {
			for (int i = 1; i < s.length; i++) {
				arr[Integer.parseInt(s[i])]++;
				if (Integer.parseInt(s[i]) > a[0])
					a[0] = Integer.parseInt(s[i]);
			}

		}

	}

	public static void main(String[] args) {
//	String[] missIT =
//	System.out.println(System.getProperty("user.dir"));
		int[] arr = new int[10000000];
		int[] a = new int[1];
		a[0] = 0;
		try {
			File file = new File("MissIT.txt");
			if (file.exists()) {
				System.out.println("Tệp đã tồn tại.");
			} else {
				boolean created = file.createNewFile();
				if (created) {
					System.out.println("Tệp đã được tạo thành công.");
				} else {
					System.out.println("Không thể tạo tệp.");
				}
//             FileOutputStream fos = new FileOutputStream(file);
//             String content = ".............";
//             fos.write(content.getBytes());
//             fos.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			File file = new File("MissIT.txt");

			FileInputStream fileInputStream = new FileInputStream(file);
			Scanner sc = new Scanner(file);
			StringBuilder stringBuilder = new StringBuilder();

			while (sc.hasNext()) {
				int n;
				String line = sc.nextLine();
				String[] s = line.split("\\s+");
				if (s.length == 1) {
					n = Integer.parseInt(s[0]);
				}
				// System.out.println("ngu");
				count(Integer.parseInt(s[0]), arr, s, a);
				// System.out.println(max);
				// System.out.println(s.length);
				stringBuilder.append(s);
			}
			// System.out.println("ngu");
			fileInputStream.close();
//			String result = stringBuilder.toString();
//			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int n = maxCheckArr(arr);
		// System.out.println(n);
		for (int i = 0; i <= a[0]; i++) {
			// System.out.print(arr[i] + " ");
			// System.out.println();
			if (arr[i] == n)
				System.out.print(i + " ");

		}
	}
}
