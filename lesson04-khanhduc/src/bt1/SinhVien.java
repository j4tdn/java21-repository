package bt1;

public class SinhVien {
	private String id;
	private String name;
	private double diemLyThuyet;
	private double diemThucHanh;

	public SinhVien(String id, String name, double diemLyThuyet, double diemThucHanh) {
		super();
		this.id = id;
		this.name = name;
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
	}

	public SinhVien() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiemLyThuyet() {
		return diemLyThuyet;
	}

	public void setDiemLyThuyet(double diemLyThuyet) {
		this.diemLyThuyet = diemLyThuyet;
	}

	public double getDiemThucHanh() {
		return diemThucHanh;
	}

	public void setDiemThucHanh(double diemThucHanh) {
		this.diemThucHanh = diemThucHanh;
	}

	public double diemTrungBinh() {
		return (diemLyThuyet + diemThucHanh) / 2;
	}

	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", name=" + name + ", diemLyThuyet=" + diemLyThuyet + ", diemThucHanh="
				+ diemThucHanh + "]";
	}

}
