package day05;

public class App {

	public static void main(String[] args) {
		Date ngay1 = new Date(11, 11, 2021);
		Date ngay2 = new Date(22, 12, 2022);
		Date ngay3 = new Date(10, 10, 2020);
		
		
		TacGia tacGia1 = new TacGia("Nguyen Van A", ngay1);
		TacGia tacGia2 = new TacGia("Nguyen Van B", ngay2);
		TacGia tacGia3 = new TacGia("Nguyen Van C", ngay3);
		
		Sach sach1 = new Sach("sach1", 10000, 2022, tacGia1);
		Sach sach2 = new Sach("sach2", 20000, 2023, tacGia2);
		Sach sach3 = new Sach("sach3", 30000, 2024, tacGia3);
		
		sach1.inTenSach();
		System.out.println("ss nam xuat ban s1 vs s2:" + sach1.kiemTraCungNam(sach2));
		System.out.println("gia sach1 sau khi giam 10%: " + sach1.giaSauKhiGiam(10));
	}
}
