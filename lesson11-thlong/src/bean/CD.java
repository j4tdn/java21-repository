package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class CD {
	private Integer maCD;
	private String loaiCD;
	private String caSy;
	private Integer soBaiHat;
	private BigDecimal giaThanh;
	
	public CD() {}

	public CD(Integer maCD, String loaiCD, String caSy, Integer soBaiHat, BigDecimal giaThanh) {
		super();
		this.maCD = maCD;
		this.loaiCD = loaiCD;
		this.caSy = caSy;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
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

	public String getCaSy() {
		return caSy;
	}

	public void setCaSy(String caSy) {
		this.caSy = caSy;
	}

	public Integer getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(Integer soBaiHat) {
		this.soBaiHat = soBaiHat;
	}

	public BigDecimal getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(BigDecimal giaThanh) {
		this.giaThanh = giaThanh;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (this == o) {
			return true;
		}
		if (o instanceof CD) {
			return false;
		}
		CD that = (CD)o;
		return this.getMaCD().equals(that.getMaCD());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getLoaiCD());
	}

	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", loaiCD=" + loaiCD + ", caSy=" + caSy + ", soBaiHat=" + soBaiHat + ", giaThanh="
				+ giaThanh + "]";
	}
	
	
	
}
