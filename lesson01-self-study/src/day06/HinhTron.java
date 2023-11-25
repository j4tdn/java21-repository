package day06;

public class HinhTron extends Hinh {

	private int r;
	
	
	public HinhTron(ToaDo toaDo, int r) {
		super(toaDo);
		this.r = r;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		double dienTich = Math.PI*r*r;
		return dienTich;
	}

	
	
}
