package bt1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
		SinhVien sv1 = new SinhVien("01", "duc", 8.5, 9);
		SinhVien sv2 = new SinhVien("02", "Dung", 7.5, 8);
		SinhVien sv3 = new SinhVien();
		System.out.println("Enter id: ");
		sv3.setId(sc.nextLine());
		System.out.println("Enter name: ");
		sv3.setName(sc.nextLine());
		System.out.println("Enter diemLyThuyet: ");
		sv3.setDiemLyThuyet(sc.nextDouble());
		System.out.println("Enter diemThucHanh: ");
		sv3.setDiemThucHanh(sc.nextDouble());
		danhSachSinhVien.add(sv1);
		danhSachSinhVien.add(sv2);
		danhSachSinhVien.add(sv3);
		System.out.println("Thong Tin Sinh Vien: ");
		for (SinhVien sv : danhSachSinhVien) {
			System.out.println(sv);
			System.out.println("---------------------------------");
		}
		double diemCanTim = 8.5;
		System.out.println("Sinh vien co diem trung binh lon hon 8.5 la: ");
		for (SinhVien sv : danhSachSinhVien) {
			if (sv.diemTrungBinh() > diemCanTim) {
				System.out.println(sv);
				System.out.println("-----------------------------");
			}
		}
	}
}
