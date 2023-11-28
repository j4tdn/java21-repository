package day09;

public class SinhVien implements Comparable<SinhVien> {

	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;
	
	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	public String getName() {
		String s = this.getHoVaTen().trim();
		if(s.indexOf(" ")>=0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}else {
			return s;
		}
	}
	
	@Override
	public int compareTo(SinhVien o) {
		String thisName = this.getName();
		String oName = o.getName();
		return thisName.compareTo(oName);
	}
	
}
