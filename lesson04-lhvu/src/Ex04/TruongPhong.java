package Ex04;

//Trưởng phòng: họ tên, ngày sinh, hệ số lương, hệ số chức vụ, tên đơn vị(phòng/ban)
public class TruongPhong extends Person {

	private double heSoChucVu;
	
	private String donViPhongBan;
	public TruongPhong() {
	}
	public TruongPhong(String hoTen, String ngaySinh, double heSoLuong, double heSoChucVu, String donViPhongBan) {
		super(hoTen,ngaySinh, heSoLuong );
		this.heSoChucVu = heSoChucVu;
		this.donViPhongBan = donViPhongBan;
	}
	public double getHeSoChucVu() {
		return heSoChucVu;
	}
	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}
	public String getDonViPhongBan() {
		return donViPhongBan;
	}
	public void setDonViPhongBan(String donViPhongBan) {
		this.donViPhongBan = donViPhongBan;
	}
	@Override
	public String toString() {
		return "TruongPhong"+ super.toString()+ "heSoChucVu=" + heSoChucVu + ", donViPhongBan=" + donViPhongBan + "]";
	}
	
}
