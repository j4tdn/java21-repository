package bt4;

public class GiamDoc extends NhanSu {
	public GiamDoc(String hoTen, String ngaySinh, double heSoLuong, double heSoChucVu) {
		super(hoTen, ngaySinh, heSoLuong, heSoChucVu);
	}

	@Override
	protected double tinhHeSoLuongCoBan() {
		return 3000000;
	}

	@Override
	public String toString() {
		return super.toString() + ", Chức vụ: Giám đốc";
	}
}
