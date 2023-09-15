package lesson03_OOP;

public class Item {
	private String maThietBi;
	private String heDieuHanh;
	private String mauSac;
	private double gia;

	public Item() {
		
	}

	public Item(String maThietBi, String heDieuHanh, String mauSac, double gia) {
		super();
		this.maThietBi = maThietBi;
		this.heDieuHanh = heDieuHanh;
		this.mauSac = mauSac;
		this.gia = gia;
	}

	public String getMaThietBi() {
		return maThietBi;
	}

	public void setMaThietBi(String maThietBi) {
		this.maThietBi = maThietBi;
	}

	public String getHeDieuHanh() {
		return heDieuHanh;
	}

	public void setHeDieuHanh(String heDieuHanh) {
		this.heDieuHanh = heDieuHanh;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public  double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	@Override
	public String toString() {
		return "Item [maThietBi=" + maThietBi + ", heDieuHanh=" + heDieuHanh + ", mauSac=" + mauSac + ", gia=" + gia
				+ "]";
	}
	
}