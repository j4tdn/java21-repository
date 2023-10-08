package lesson01;

import java.util.Scanner;

public class FindMinFract {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		double num = inputDouble();
		System.out.println(getMinFract(num));
	}
	
	// Hàm nhập một số thực
	public static double inputDouble() {
		int count = 1;
		double num = 0.0;
		while(count<=3){
			try {
				System.out.println("Nhập N : ");
				num = Double.parseDouble(ip.nextLine());
				if(Math.floor(num) == Math.ceil(num)) {
					System.out.println("Số được nhập vào phải có phần thập phân khác 0, vui lòng nhập lại");
				}else {
					return num;
				}
			}catch (Exception e) {
				System.out.println("Số được nhập vào không hợp lệ, vui lòng nhập lại");
			}
			System.out.println("Nhập lại lần thứ "+count+"(bạn có 3 lần nhập lại)");
			count++;
			
		}
		return num;
	}
	
	public static String getMinFract(double input) {
	    int mauSo = 1;
	    while(Math.floor(input) != input) {
	    	input *= 10;
	    	mauSo *= 10;
	    }
	    int gcd = findGCD((int) input, mauSo);
	    input = input / gcd;
	    mauSo = mauSo / gcd;
	    return "Phân số tối giản của số vừa " + (int)input +"/" + mauSo;
	}
	
	public static int findGCD(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return findGCD(b, a % b);
		}
		
	}

}
