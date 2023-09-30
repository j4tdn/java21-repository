package Ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<SinhVien> sinhvien = new ArrayList<>();
		
		SinhVien sv1 = new SinhVien(001,"Lê Hoàng Vũ", 8.5, 7.5);
		sinhvien.add(sv1);
		SinhVien sv2 = new SinhVien(002,"Nguyễn Quang Tú", 9.5, 8.5);
		sinhvien.add(sv2);
		
		SinhVien sv3 = new SinhVien();
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập thông tin SV3:");
		System.out.print("Nhập MSVV:");
		sv3.setMaSinhVien(ip.nextInt());
		
		System.out.print("Nhập Họ và tên:");
		String hoten = ip.next();
		sv3.setHoTen(hoten);
		
		System.out.print("Nhập Điểm Lý thuyết:");
		sv3.setDiemLt(ip.nextDouble());
		
		System.out.print("Nhập Điểm Thực Hành:");
		sv3.setDiemTt(ip.nextDouble());
		
		sinhvien.add(sv3);
		 
		System.out.println("Thông tin tất cả sinh viên:");
		
		for (SinhVien sv : sinhvien) {
            System.out.println(sv);
        }
		
		System.out.println("Thông tin các sinh viên có điểm trung bình lớn hơn 8.5");
		for (SinhVien sv : sinhvien) {
			if (sv.diemTb()>8.5)
				System.out.println(sv);
		}
		System.out.println("Thông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành");
		for (SinhVien sv: sinhvien) {
			if (sv.getDiemLt()>sv.getDiemTt())
				System.out.println(sv);
		}
	}
}	
