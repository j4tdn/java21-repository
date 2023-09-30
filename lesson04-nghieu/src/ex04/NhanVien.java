package ex04;

import java.math.BigDecimal;
import java.time.LocalDate;

public class NhanVien extends Member{

	private String tenDV;
	private String truongPh;
	
	public NhanVien() {
	}

	public NhanVien(String name, String dateOfBirth, float heSoLuong, String tenDV, String truongPh) {
		super(name, dateOfBirth, heSoLuong);
		this.tenDV = tenDV;
		this.truongPh = truongPh;
	}

	public String getTenDV() {
		return tenDV;
	}

	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}

	public String getTruongPh() {
		return truongPh;
	}

	public void setTruongPh(String truongPh) {
		this.truongPh = truongPh;
	}

	@Override
	public String toString() {
		return "NhanVien [tenDV=" + tenDV + ", truongPh=" + truongPh + "]";
	}
}
