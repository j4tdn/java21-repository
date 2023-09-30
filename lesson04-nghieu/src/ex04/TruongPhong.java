package ex04;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TruongPhong extends Member{

	private float heSoChucVu;
	private String donVi;
	
	public TruongPhong() {
	}

	

	public TruongPhong(String name, String dateOfBirth, float heSoLuong, float heSoChucVu, String donVi) {
		super(name, dateOfBirth, heSoLuong);
		this.heSoChucVu = heSoChucVu;
		this.donVi = donVi;
		
	}



	public float getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(float heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	public String getDonVi() {
		return donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	@Override
	public String toString() {
		return "TruongPhong [heSoChucVu=" + heSoChucVu + ", donVi=" + donVi + "]";
	}
	
}
