package lesson04;

import java.time.LocalDate;

class NhanVien extends NhanSu {
    TruongPhong truongPhong;

    public NhanVien(String hoTen, LocalDate ngaySinh, double heSoLuong, TruongPhong truongPhong) {
        super(hoTen, ngaySinh, heSoLuong, 0);
        this.truongPhong = truongPhong;
    }
}