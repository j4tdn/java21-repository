package bt4;
import java.time.LocalDate;

public class TruongPhong extends NhanSu {
	private String donVi;

	public TruongPhong(String hoTen, String ngaySinh, double heSoLuong, double heSoChucVu, String donVi) {
		super(hoTen, ngaySinh, heSoLuong, heSoChucVu);
		this.donVi = donVi;
	}

	protected double tinhHeSoLuongCoBan() {
		return 2200000;
	}

	@Override
	public String toString() {
		return super.toString() + ", Chức vụ: Trưởng phòng, Đơn vị: " + donVi;
	}
}
