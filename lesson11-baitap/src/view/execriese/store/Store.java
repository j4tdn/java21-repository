package view.execriese.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import view.execriese.bean.CD;

public class Store {
	private ArrayList<CD> danhSachCD = new ArrayList<>();

	public void themCD(CD cd) {
		for (CD existingCD : danhSachCD) {
			if (existingCD.getMaCD() == cd.getMaCD()) {
				System.out.println("Thêm không thành công. Mã CD đã tồn tại.");
				return;
			}
		}
		danhSachCD.add(cd);
		System.out.println("Thêm CD thành công.");
	}

	public int soLuongCD() {
		return danhSachCD.size();
	}

	public double tongGiaThanh() {
		double tong = 0;
		for (CD cd : danhSachCD) {
			tong += cd.getGia();
		}
		return tong;
	}

	public void sapXepGiamDanTheoGiaThanh() {
		Collections.sort(danhSachCD, Comparator.comparingDouble(CD::getGia).reversed());
	}

	public void sapXepTangDanTheoMaCD() {
		Collections.sort(danhSachCD, Comparator.comparingInt(CD::getMaCD));
	}

	public void inDanhSachCD() {
		for (CD cd : danhSachCD) {
			System.out.println(cd);
		}
	}
}
