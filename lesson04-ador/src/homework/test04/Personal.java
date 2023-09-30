package homework.test04;

import java.math.BigDecimal;

public abstract class Personal implements Statistics {
	private String chucVu;
	private String emplName;
	private String emplBrithday;
	private BigDecimal heSoLuong;
	private BigDecimal heSoChucVu;
	
	public Personal() {
	}

	public Personal(String chucVu, String emplName, String emplBrithday, BigDecimal heSoLuong, BigDecimal heSoChucVu) {
		this.chucVu = chucVu;
		this.emplName = emplName;
		this.emplBrithday = emplBrithday;
		this.heSoLuong = heSoLuong;
		this.heSoChucVu = heSoChucVu;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getEmplName() {
		return emplName;
	}

	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}

	public String getEmplBrithday() {
		return emplBrithday;
	}

	public void setEmplBrithday(String emplBrithday) {
		this.emplBrithday = emplBrithday;
	}

	public BigDecimal getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(BigDecimal heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public BigDecimal getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(BigDecimal heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	@Override
	public String toString() {
		return "Personal [chucVu=" + chucVu + ", emplName=" + emplName + ", emplBrithday=" + emplBrithday
				+ ", heSoLuong=" + heSoLuong + ", heSoChucVu=" + heSoChucVu + "]";
	}
	
	
}
