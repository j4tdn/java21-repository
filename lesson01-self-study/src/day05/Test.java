package day05;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 05, 2022);
		Ngay ngay2 = new Ngay(31, 01, 2025);
		Ngay ngay3 = new Ngay(16, 02, 2030);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hang A", "Viet Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hang B", "My");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Hang C", "Ba Lan");
		
		BoPhim boPhim1 = new BoPhim("Bo Gia", 2022, hangSanXuat1, 65000, ngay1);
		BoPhim boPhim2 = new BoPhim("Running Man", 2021, hangSanXuat2, 75000, ngay1);
		BoPhim boPhim3 = new BoPhim("Kham pha the gioi", 2025, hangSanXuat3, 90000, ngay1);
	
		System.out.println("SS gia 1 re hon 2:" + boPhim1.kiemTraGiaVeReHon(boPhim2));
		
		System.out.println("ten hang san xuat BP 3:" + boPhim3.layTenHangSanXuat());
		
		System.out.println("BP1 giam 10%: " +boPhim1.giaSauKhuyenMai(10));
	}
	
	
}
