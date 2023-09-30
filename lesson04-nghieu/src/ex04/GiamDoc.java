package ex04;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GiamDoc extends Member{

	private float heSoChucVu;
	
	public GiamDoc() {
	}

	

	public GiamDoc(String name, String dateOfBirth, float heSoLuong, float heSoChucVu) {
		super(name, dateOfBirth, heSoLuong);
		this.heSoChucVu = heSoChucVu;
	}



	public float getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(float heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	@Override
	public String toString() {
		return "GiamDoc [heSoChucVu=" + heSoChucVu + "]";
	}
}
