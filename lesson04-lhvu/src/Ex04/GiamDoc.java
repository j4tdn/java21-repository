package Ex04;

import java.time.LocalDate;

/*
 *  a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ.
    b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, hệ số chức vụ, tên đơn vị(phòng/ban)
    c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban), trưởng phòng
 */
public class GiamDoc extends Person {
	private double heSoChucVu;
	public GiamDoc() {
	}
	/**
	 * @param d
	 * @param person
	 */
	public GiamDoc( String hoTen, String ngaySinh, double heSoLuong, double heSoChucVu) {
		super(hoTen, ngaySinh, heSoLuong);
		this.heSoChucVu = heSoChucVu;
		
	}
	public double getHeSoChucVu() {
		return heSoChucVu;
	}
	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}
	@Override
	public String toString() {
		return "GiamDoc" + super.toString()+"heSoChucVu=" + heSoChucVu;
	}
	
	 
	
}
