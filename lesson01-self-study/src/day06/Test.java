package day06;

public class Test {

	public static void main(String[] args) {
		ToaDo toaDo1 = new ToaDo(1, 1);
		ToaDo toaDo2 = new ToaDo(2, 2);
		ToaDo toaDo3 = new ToaDo(3, 3);
		
		Hinh hinh1 = new Diem(toaDo1);
		Hinh hinh2 = new HinhTron(toaDo2, 10);
		Hinh hinh3 = new HinhChuNhat(toaDo3, 2, 3);
		
		System.out.println("dien tich diem: " + hinh1.tinhDienTich());
		System.out.println("dien tich hinh tron: " + hinh2.tinhDienTich());
		System.out.println("dien tich hinh tron: " + hinh3.tinhDienTich());
	}
}
