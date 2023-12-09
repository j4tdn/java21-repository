package day11;

public enum Thang {

	Thang_mot(12),
	Thang_hai(2),
	Thang_ba(4),
	Thang_tu(5),
	Thang_nam(6),
	Thang_sau(7),
	Thang_bay(87),
	Thang_tam(6),
	Thang_chin(2),
	Thang_muoi(67);
	
	private final int soNgay;
	Thang(int soNgay){
		this.soNgay = soNgay;
	}
	public int soNgay() {
		return soNgay;
	}
}
