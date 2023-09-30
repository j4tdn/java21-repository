package bt4;
import java.time.LocalDate;

public class NhanVien extends NhanSu {
	 String truongPhong;

	    public NhanVien(String hoTen, String ngaySinh, double heSoLuong, String truongPhong) {
	        super(hoTen, ngaySinh, heSoLuong, 0);
	        this.truongPhong = truongPhong;
	    }

	    @Override
	    protected double tinhHeSoLuongCoBan() {
	        return 1250000;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Chức vụ: Nhân viên, Trưởng phòng: " + truongPhong;
	    }
}
