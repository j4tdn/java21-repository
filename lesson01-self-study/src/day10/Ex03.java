package day10;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng
 * số tiền họ đang có.
 * Luật chơi như sau:
 * Có 3 viên xúc xắc. Mõi viên xúc có 6 mặt có giá tị từ 1 đến 6.
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3
 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
 * 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 */
public class Ex03 {

	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000;
		Scanner sc = new Scanner(System.in);

		//Locale lc = new Locale("vi", "VN");
		//NumberFormat numf = NumberFormat.getInstance(lc);
		//NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		
		Locale lc = new Locale("en", "US");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		int luaChon	;
		do {
			System.out.println("---MỜI BẠN LỰA CHỌN---");
			System.out.println("Chọn (1) để tiếp tục chơi");
			System.out.println("Chọn phím bất kỳ để tiếp thoát");
			luaChon = sc.nextInt();

			if (luaChon == 1) {
				System.out.println("Bắt đầu chơi:");

				// đặt cược
				System.out.println("***Tai Khoan cua ban: " + numf.format(taiKhoanNguoiChoi));
				System.out.println("Bạn muốn đặt cược bao nhiêu:");
				double datCuoc = 0;
				do {
					System.out.println("Đặt cược (0 < số tiền cược <= " + numf.format(taiKhoanNguoiChoi));
					datCuoc = sc.nextDouble();
				} while (datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

				// Chọn tài xỉu
				int luaChonTaiXiu = 0;
				do {
					System.out.println("Chọn: 1 <=> XỈU hoặc 2<=> TÀI");
					luaChonTaiXiu = sc.nextInt();
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

				// Tung xúc xắc
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();

				int giaTri1 = xucXac1.nextInt(6) + 1;
				int giaTri2 = xucXac2.nextInt(6) + 1;
				int giaTri3 = xucXac3.nextInt(6) + 1;
				int tong = giaTri1 + giaTri2 + giaTri3;

				// Tính toán kết quả
				System.out.println("Kết quả " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
				if (tong == 3 || tong == 18) {
					taiKhoanNguoiChoi -= datCuoc;
					System.out.println("Tổng là: " + tong + " => Nhà cái ăn hết, bạn đã thua!");
					System.out.println("Tài khoản của bạn là:" + numf.format(taiKhoanNguoiChoi));
				} else if (tong > 3 && tong <= 10) {
					System.out.println("Tổng là:" + tong + " => XỈU");
					if (luaChonTaiXiu == 1) {
						System.out.println("Bạn đã thắng cược");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("Tài Khoản bạn là: " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println("Bạn đã thua cược");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("Tài Khoản bạn là: " + numf.format(taiKhoanNguoiChoi));
					}
				} else {
					System.out.println("Tổng là " + tong + " => TÀI");
					if (luaChonTaiXiu == 2) {
						System.out.println("Bạn đã thắng cược");
						taiKhoanNguoiChoi += datCuoc;
						System.out.println("Tài Khoản bạn là: " + numf.format(taiKhoanNguoiChoi));
					} else {
						System.out.println("Bạn đã thua cược");
						taiKhoanNguoiChoi -= datCuoc;
						System.out.println("Tài Khoản bạn là: " + numf.format(taiKhoanNguoiChoi));
					}
				}
			}
			System.out.println("Bạn đã thoát");
		} while (luaChon == 1);

		// Chọn tài xỉu

		// Tung xúc xắc

		// Tính toán kết quả

		//
	}
}
