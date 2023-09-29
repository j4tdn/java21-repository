package lesson04;

import java.time.LocalDate;

class TruongPhong extends NhanSu {
    String tenDonVi;

    public TruongPhong(String hoTen, LocalDate ngaySinh, double heSoLuong, double heSoChucVu, String tenDonVi) {
        super(hoTen, ngaySinh, heSoLuong, heSoChucVu);
        this.tenDonVi = tenDonVi;
    }

    @Override
    public double tinhLuong() {
        return (heSoLuong + heSoChucVu) * 2200000;
    }
}
