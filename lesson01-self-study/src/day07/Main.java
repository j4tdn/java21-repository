package day07;

public class Main {

	public static void main(String[] args) {
		HangSanXuat hsx1 = new HangSanXuat("BMW", "Germany");
		HangSanXuat hsx2 = new HangSanXuat("Boeing", "USA");
		HangSanXuat hsx3 = new HangSanXuat("ConBo", "VN");
		
		PhuongTienDiChuyen p1 = new MayBay(hsx2, "xang");
		PhuongTienDiChuyen p2 = new XeOto(hsx1, "xang");
		PhuongTienDiChuyen p3 = new XeDap(hsx3);
		
		System.out.println("lay hang san xuat");
		System.out.println("p1: " +p1.layTenHangSanXuat());
		
		System.out.println("bat dau: ");
		p2.batDau();
		
		System.out.println("lay van toc: ");
		System.out.println("p1: " + p1.layVantoc());
		System.out.println("p2: " + p1.layVantoc());
		System.out.println("p3: " + p1.layVantoc());
	}
}
