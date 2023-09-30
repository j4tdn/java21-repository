package lesson04;

import java.time.LocalDate;

class GiamDoc extends NhanSu {
    public GiamDoc(String hoTen, LocalDate ngaySinh, double heSoLuong, double heSoChucVu) {
        super(hoTen, ngaySinh, heSoLuong, heSoChucVu);
    }

    @Override
    public double tinhLuong() {
        return (heSoLuong + heSoChucVu) * 3000000;
    }
}