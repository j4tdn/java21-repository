package Ex04;

import java.time.LocalDate;

/*
 *  a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ.
    b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, hệ số chức vụ, tên đơn vị(phòng/ban)
    c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban), trưởng phòng
 */
public class Person {
	private String hoTen;
	private String ngaySinh;
	private double heSoLuong;
	public Person() {
	}
	
	public Person(String hoTen, String ngaySinh, double heSoLuong) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.heSoLuong = heSoLuong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	@Override
	public String toString() {
		return " hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", heSoLuong=" + heSoLuong ;
	}
	
	
	
}
