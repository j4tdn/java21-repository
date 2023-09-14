package ex02;

public class Vehicle {

	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double triGia;

	public Vehicle() {

	}

	public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	@Override
	public String toString() {
		return "Vehicle [tenChuXe=" + tenChuXe + ", loaiXe=" + loaiXe + ", dungTich=" + dungTich + ", triGia=" + triGia
				+ "]";
	}
}
