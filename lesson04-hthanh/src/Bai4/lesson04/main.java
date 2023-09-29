package Bai4.lesson04;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class NhanSu {
	protected String hoTen;
	protected String ngaySinh;
	protected BigDecimal heSoLuong;
	protected BigDecimal heSoChucVu;

	public NhanSu(String hoTen, String ngaySinh, BigDecimal heSoLuong, BigDecimal heSoChucVu) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.heSoLuong = heSoLuong;
		this.heSoChucVu = heSoChucVu;
	}
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}

	public BigDecimal tinhLuong() {
		return (heSoLuong.add(heSoChucVu) ).multiply(bd(1250000)) ;
	}

	public String loaiNhanSu() {
		return "Nhân viên";
	}

	@Override
	public String toString() {
		return "Họ tên: " + hoTen + "\nNgày sinh: " + ngaySinh + "\nLương: " + tinhLuong() + "\n";
	}
}

class GiamDoc extends NhanSu {
	public GiamDoc(String hoTen, String ngaySinh, BigDecimal heSoLuong, BigDecimal heSoChucVu) {
		super(hoTen, ngaySinh, heSoLuong, heSoChucVu);
	}

	@Override
	public String loaiNhanSu() {
		return "Giám đốc";
	}
}

class TruongPhong extends NhanSu {
	private String tenDonVi;

	public TruongPhong(String hoTen, String ngaySinh, BigDecimal heSoLuong, BigDecimal heSoChucVu, String tenDonVi) {
		super(hoTen, ngaySinh, heSoLuong, heSoChucVu);
		this.tenDonVi = tenDonVi;
	}

	public String getTenDonVi() {
		return tenDonVi;
	}

	@Override
	public String loaiNhanSu() {
		return "Trưởng phòng";
	}
}

public class main {
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
	public static void main(String[] args) {
		GiamDoc giamDoc = new GiamDoc("Nguyễn Văn A", "01/01/1970", bd(2.0), bd(1.2));
		TruongPhong truongPhong1 = new TruongPhong("Trần Thị B", "15/05/1980", bd(1.5), bd(1.1), "Phòng A");
		TruongPhong truongPhong2 = new TruongPhong("Lê Văn C", "20/02/1975", bd(1.6), bd(1.2), "Phòng B");
		List<NhanSu> nhanSuList = new ArrayList<>();
		nhanSuList.add(giamDoc);
		nhanSuList.add(truongPhong1);
		nhanSuList.add(truongPhong2);

		for (int i = 1; i <= 6; i++) {
			NhanSu nhanVien = new NhanSu("Nhân viên " + i, "01/01/1990", bd(1.0), bd(0.0));
			nhanSuList.add(nhanVien);
		}

		System.out.println("Thông tin các nhân sự trong công ty:");
		for (NhanSu nhanSu : nhanSuList) {
			System.out.println("Loại: " + nhanSu.loaiNhanSu());
			System.out.println(nhanSu);
		}

		Map<String, Integer> truongPhongStats = new HashMap<>();
		for (NhanSu nhanSu : nhanSuList) {
			if (nhanSu instanceof TruongPhong) {
				TruongPhong truongPhong = (TruongPhong) nhanSu;
				String tenDonVi = truongPhong.getTenDonVi();
				truongPhongStats.put(tenDonVi, truongPhongStats.getOrDefault(tenDonVi, 0) + 1);
			}
		}

		System.out.println("\nThống kê số lượng nhân viên được quản lý bởi từng trưởng phòng:");
		for (String tenDonVi : truongPhongStats.keySet()) {
			int soLuongNhanVien = truongPhongStats.get(tenDonVi);
			System.out.println("Trưởng phòng " + tenDonVi + ": " + soLuongNhanVien + " nhân viên");
		}

		System.out.println("\nMức lương của từng loại nhân sự:");
		for (NhanSu nhanSu : nhanSuList) {
			System.out.println(nhanSu.loaiNhanSu() + " " + nhanSu.hoTen + ": " + nhanSu.tinhLuong());
		}
	}

	
}
