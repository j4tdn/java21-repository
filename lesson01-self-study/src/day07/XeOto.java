package day07;

public class XeOto extends PhuongTienDiChuyen{

	private String loaiNhienLieu;

	public XeOto(HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super("Oto", hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}
	
	@Override
	public double layVantoc() {
		return 60;
	}
	
}
