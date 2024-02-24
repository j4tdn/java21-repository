package bean;

public class Student {
		
	private String mssv;
	private String hoTen;
	private double diemTB;
	private String gioiTinh;

	public Student(String mssv, String hoTen, double diemTB, String gioiTinh) {
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
		this.gioiTinh = gioiTinh;
	}

	public String getMssv() {
		return mssv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public double getDiemTB() {
		return diemTB;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	@Override
	public String toString() {
		return mssv + ", " + hoTen + ", " + diemTB + ", " + gioiTinh;
	}
}