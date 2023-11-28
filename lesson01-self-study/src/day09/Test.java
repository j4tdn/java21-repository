package day09;

public class Test {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "TITV A", "Lop 1", 9);
		SinhVien sv2 = new SinhVien(150, "TITV C", "Lop 2", 8);
		
		System.out.println(sv1.compareTo(sv2));
	}
}
