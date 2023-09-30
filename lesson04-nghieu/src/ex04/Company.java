package ex04;

public class Company {

	public static void main(String[] args) {
		GiamDoc gd1 = new GiamDoc("nguyen van", "12/02/2004", 2, 2); 
		
		TruongPhong tp1 = new TruongPhong("nguyen tan", "13/03/2004", 1, 3, "phong 1");
		TruongPhong tp2 = new TruongPhong("tran tu", "25/06/2000", 3, 2, "phong 2");
		
		NhanVien nv1 = new NhanVien("nv1", "11/09/2001", 1, "phong 1", "nguyen tan");
		NhanVien nv2 = new NhanVien("nv2", "12/03/2003", 1, "phong 2", "tran tu");
		NhanVien nv3 = new NhanVien("nv3", "13/01/2005", 1, "phong 2", "tran tu");
		NhanVien nv4 = new NhanVien("nv4", "14/07/2000", 1, "phong 1", "nguyen tan");
		NhanVien nv5 = new NhanVien("nv5", "15/05/2004", 1, "phong 2", "tran tu");
		NhanVien nv6 = new NhanVien("nv6", "16/06/2004", 1, "phong 1", "nguyen tan");
	}
}
