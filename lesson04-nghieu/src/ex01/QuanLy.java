package ex01;

import java.util.Scanner;

public class QuanLy {
	
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(101, "nguyen hieu", 10, 9);
		SinhVien sv2 = new SinhVien(102, "ngoc nu", 8, 7);
		SinhVien sv3 = new SinhVien();
		
		input(sv3);
		
		
		SinhVien[] sv = {sv1, sv2, sv3};
		System.out.println("\nTHÔNG TIN SINH VIÊN CÓ ĐIỂM TRUNG BÌNH LỚN HƠN 8.5: ");
		goodPoint(sv);
		
		System.out.println("\nTHÔNG TIN SINH VIÊN CÓ ĐIỂM LÝ THUYẾT LỚN HƠN ĐIỂM THỰC HÀNH: ");
		theoPara(sv);
	}
	
	private static void input(SinhVien sv) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("MSV: ");
		sv.setId(inp.nextInt());
		inp.nextLine();
		System.out.println("Tên: ");
		sv.setName(inp.nextLine());
		System.out.println("Điểm lý thuyết: ");
		sv.setTheoPoint(inp.nextFloat());
		System.out.println("Điểm thực hành: ");
		sv.setPraPoint(inp.nextFloat());
	}
	
	private static void goodPoint(SinhVien[] sv) {
		for(SinhVien svs : sv) {
			float dtb = svs.avg(svs.getTheoPoint(), svs.getPraPoint());
			if(dtb > 8.5) {
				System.out.println(svs);
			}
		}
	}
	
	private static void theoPara(SinhVien[] sv) {
		for(SinhVien svs : sv) {
			if( svs.getTheoPoint()> svs.getPraPoint()) {
				System.out.println(svs);
			}
		}
	}
}
