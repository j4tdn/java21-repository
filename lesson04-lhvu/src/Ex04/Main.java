package Ex04;
/*
 * Bài 4: Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây.
a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ.
b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, hệ số chức vụ, tên đơn vị(phòng/ban)
c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban), trưởng phòng

Chương trình thực hiện các công việc sau đây.

Tạo dữ liệu gồm 1 Giám đốc, 2 Trưởng phòng, 6 Nhân viên
Viết hàm:
o Hiển thị thông tin các nhân sự có trong công ty
o Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
o Tính và in ra mức lương của từng loại nhân sự , biết rằng :
Nhân viên: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 1250000
Trưởng phòng: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 2200000
Giám đốc: Lương = (hệ số lương + hệ số chức vụ(nếu có)) * 3000000
 */
public class Main {

	public static void main(String[] args) {
		GiamDoc gd = new GiamDoc("Nguyễn Văn A","12/09/1985",4.6d, 3.2d);
		TruongPhong tp1 = new TruongPhong("Nguyễn Văn B", "24/12/1990", 4.3d, 3.1d, "Phòng 1");
		TruongPhong tp2 = new TruongPhong("Nguyễn Văn C", "30/08/1990", 4.3d, 3.1d, "Phòng 2");
		NhanVien nv1 = new NhanVien("Lê Chí Tài", "14/05/1995", 3.8d, "Phòng 1", tp1);
		NhanVien nv2 = new NhanVien("Trần Văn Khải", "12/08/1995", 3.8d, "Phòng 1", tp1);
		NhanVien nv3 = new NhanVien("Nguyễn Tiến Duật", "21/12/1998", 3.8d, "Phòng 1", tp1);
		NhanVien nv4 = new NhanVien("Đoàn Thùy Trang", "23/10/1997", 3.8d, "Phòng 2", tp2);
		NhanVien nv5 = new NhanVien("Vương Anh Dũng", "30/02/1996", 3.8d, "Phòng 2", tp2);
		NhanVien nv6 = new NhanVien("Cao Bá Đạt", "22/02/1999", 3.8d, "Phòng 2", tp2);
		
		Person[] person = {gd, tp1, tp2, nv1, nv2, nv3, nv4, nv5, nv6
		};
		System.out.println("Thông tin nhân viên:");
		for (Person ps: person) {
			System.out.println(ps);
		}
			
	}
}
