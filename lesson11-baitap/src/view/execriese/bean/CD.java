package view.execriese.bean;

public class CD {
	private Integer maCD;
	private String loaiCD;
	private String caSi;
	private Integer soBaiHat;
	private double gia;
	public CD() {
		
	}
	public CD(Integer maCD, String loaiCD, String caSi, Integer soBaiHat, double gia) {
		super();
		this.maCD = maCD;
		this.loaiCD = loaiCD;
		this.caSi = caSi;
		this.soBaiHat = soBaiHat;
		this.gia = gia;
	}
	public Integer getMaCD() {
		return maCD;
	}
	public void setMaCD(Integer maCD) {
		this.maCD = maCD;
	}
	public String getLoaiCD() {
		return loaiCD;
	}
	public void setLoaiCD(String loaiCD) {
		this.loaiCD = loaiCD;
	}
	public String getCaSi() {
		return caSi;
	}
	public void setCaSi(String caSi) {
		this.caSi = caSi;
	}
	public Integer getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(Integer soBaiHat) {
		this.soBaiHat = soBaiHat;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", loaiCD=" + loaiCD + ", caSi=" + caSi + ", soBaiHat=" + soBaiHat + ", gia=" + gia
				+ "]";
	}
}
