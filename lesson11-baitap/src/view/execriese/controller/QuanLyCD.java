package view.execriese.controller;

import view.execriese.bean.CD;
import view.execriese.store.Store;

public class QuanLyCD {
	public static void main(String[] args) {

		Store cuaHangCD = new Store();

		cuaHangCD.themCD(new CD(1, "Pop", "Taylor Swift", 12, 15.99));
		cuaHangCD.themCD(new CD(2, "Rock", "Linkin Park", 10, 19.99));
		cuaHangCD.themCD(new CD(3, "R&B", "Beyoncé", 15, 22.50));

		System.out.println("Số lượng CD trong cửa hàng: " + cuaHangCD.soLuongCD());
		System.out.println("Tổng giá thành của các CD: " + cuaHangCD.tongGiaThanh());

		System.out.println("\nDanh sách CD trước khi sắp xếp:");
		cuaHangCD.inDanhSachCD();

		cuaHangCD.sapXepGiamDanTheoGiaThanh();

		System.out.println("\nDanh sách CD sau khi sắp xếp giảm dần theo giá thành:");
		cuaHangCD.inDanhSachCD();

		cuaHangCD.sapXepTangDanTheoMaCD();

		System.out.println("\nDanh sách CD sau khi sắp xếp tăng dần theo mã CD:");
		cuaHangCD.inDanhSachCD();
	}

}
