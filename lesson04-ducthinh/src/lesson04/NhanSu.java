package lesson04;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class NhanSu {
    String hoTen;
    LocalDate ngaySinh;
    double heSoLuong;
    double heSoChucVu;

    public NhanSu(String hoTen, LocalDate ngaySinh, double heSoLuong, double heSoChucVu) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.heSoLuong = heSoLuong;
        this.heSoChucVu = heSoChucVu;
    }

    public double tinhLuong() {
        return (heSoLuong + heSoChucVu) * 1250000;
    }
}