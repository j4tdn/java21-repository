package Ex04;

//c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban), trưởng phòng
public class NhanVien extends Person {
	private String donViPhongBan;
	private TruongPhong truongphong;
	public NhanVien(String hoTen, String ngaySinh, double heSoLuong, String donViPhongBan, TruongPhong truongphong) {
		super(hoTen, ngaySinh, heSoLuong);
		this.donViPhongBan = donViPhongBan;
		this.truongphong = truongphong;
	}
	public String getDonViPhongBan() {
		return donViPhongBan;
	}
	public void setDonViPhongBan(String donViPhongBan) {
		this.donViPhongBan = donViPhongBan;
	}
	public TruongPhong getTruongphong() {
		return truongphong;
	}
	public void setTruongphong(TruongPhong truongphong) {
		this.truongphong = truongphong;
	}
	@Override
	public String toString() {
		return "NhanVien " + super.toString()+ "donViPhongBan=" + donViPhongBan + ", truongphong=" + truongphong ;
	}
	
}
