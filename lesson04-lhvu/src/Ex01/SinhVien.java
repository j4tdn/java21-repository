package Ex01;

//Bài 1: Viết chương trình OOP quản lý sinh viên đơn giản: Nhập xuất thông tin, tính điểm TB.
//Tạo lớp Sinh viên như sau:
/*Attribute:
Mã sinh viên: số nguyên
Họ tên: chuỗi ký tự
Điểm lý thuyết: số thực
Điểm thực hành: số thực

Constructor:

Constructor mặc định.
Constructor đầy đủ tham số.

Method:

Các phương thức getter và setter cho mỗi thuộc tính.
Tính điểm trung bình: (Lý thuyết + Thực hành) / 2
Phương thức toString để diễn tả thông tin của đối tượng ở dạng chuỗi.

Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3, trong đó:
1. sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số).
2. sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số).

3. sv3 tạo bằng constructor mặc định. Tạo hàm nhập các thông tin cho sv3 từ bàn phím
sau đó dùng setter để gán các thuộc tính tương ứng.
---- Đưa danh sách 3 sinh viên sv1, sv2, sv3 vào mảng một chiều ----
4. Viết hàm tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
5. Viết hàm tìm thông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành
 * 
 */
public class SinhVien {
	private int maSinhVien;
	private String hoTen;
	private double diemLt;
	private double diemTt;
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}

	public SinhVien(int maSinhVien, String hoTen, double diemLt, double diemTt) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemLt = diemLt;
		this.diemTt = diemTt;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getDiemLt() {
		return diemLt;
	}

	public void setDiemLt(double diemLt) {
		this.diemLt = diemLt;
	}

	public double getDiemTt() {
		return diemTt;
	}

	public void setDiemTt(double diemTt) {
		this.diemTt = diemTt;
	}
	
	public double diemTb () {
		return (diemLt+diemTt)/2;
	}

	@Override
	public String toString() {
		return " Mã sinh viên=" + maSinhVien + ", Họ và Tên=" + hoTen + ", Điểm Lý Thuyết=" + diemLt + ", Điểm Thực Hành" + diemTt;
	}

	
	

}
























