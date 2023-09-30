package bt4;
import java.time.LocalDate;

public class NhanSu {
	protected String hoTen;
	protected String ngaySinh;
	protected double heSoLuong;
	protected double heSoChucVu;

	public NhanSu(String hoTen, String ngaySinh, double heSoLuong, double heSoChucVu) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.heSoLuong = heSoLuong;
		this.heSoChucVu = heSoChucVu;
	}

	public double tinhLuong() {
		return (heSoLuong + heSoChucVu) * tinhHeSoLuongCoBan();
	}

	protected double tinhHeSoLuongCoBan() {
		return 0;
	}

	@Override
	public String toString() {
		return "Họ tên: " + hoTen + ", Ngày sinh: " + ngaySinh;
	}
}
