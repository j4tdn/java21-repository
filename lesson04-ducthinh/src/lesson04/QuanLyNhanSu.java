package lesson04;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class QuanLyNhanSu {
    public static void main(String[] args) {
        GiamDoc giamDoc = new GiamDoc("Nguyen Van Hieu", LocalDate.of(1980, 1, 1), 2.0, 0.5);
        TruongPhong truongPhong1 = new TruongPhong("Tran Thi Ly", LocalDate.of(1985, 3, 15), 1.8, 0.3, "Phong A");
        TruongPhong truongPhong2 = new TruongPhong("Le Van Sang", LocalDate.of(1990, 5, 20), 1.7, 0.25, "Phong B");
        NhanVien nhanVien1 = new NhanVien("Hoang Van Hau", LocalDate.of(1995, 6, 10), 1.5, truongPhong1);
        NhanVien nhanVien2 = new NhanVien("Nguyen Thi Tham", LocalDate.of(1997, 9, 25), 1.4, truongPhong1);
        NhanVien nhanVien3 = new NhanVien("Tran Van Phuc", LocalDate.of(1999, 12, 12), 1.4, truongPhong1);
        NhanVien nhanVien4 = new NhanVien("Le Van Giang", LocalDate.of(1993, 3, 5), 1.6, truongPhong2);
        NhanVien nhanVien5 = new NhanVien("Pham Van Hoang", LocalDate.of(1994, 8, 8), 1.5, truongPhong2);
        NhanVien nhanVien6 = new NhanVien("Do Thi Yen", LocalDate.of(1996, 11, 17), 1.4, truongPhong2);

        List<NhanSu> nhanSuList = new ArrayList<>();
        nhanSuList.add(giamDoc);
        nhanSuList.add(truongPhong1);
        nhanSuList.add(truongPhong2);
        nhanSuList.add(nhanVien1);
        nhanSuList.add(nhanVien2);
        nhanSuList.add(nhanVien3);
        nhanSuList.add(nhanVien4);
        nhanSuList.add(nhanVien5);
        nhanSuList.add(nhanVien6);

        // Hiển thị thông tin nhân sự
        for (NhanSu nhanSu : nhanSuList) {
            if (nhanSu instanceof GiamDoc) {
                System.out.println("Giám đốc: " + nhanSu.hoTen + ", Ngày sinh: " + nhanSu.ngaySinh);
            } else if (nhanSu instanceof TruongPhong) {
                System.out.println("Trưởng phòng: " + nhanSu.hoTen + ", Ngày sinh: " + nhanSu.ngaySinh + ", Đơn vị: " + ((TruongPhong) nhanSu).tenDonVi);
            } else if (nhanSu instanceof NhanVien) {
                System.out.println("Nhân viên: " + nhanSu.hoTen + ", Ngày sinh: " + nhanSu.ngaySinh + ", Trưởng phòng: " + ((NhanVien) nhanSu).truongPhong.hoTen);
            }
        }

        // Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
        Map<TruongPhong, Integer> soLuongNhanVienTheoTruongPhong = new HashMap<>();
        for (NhanSu nhanSu : nhanSuList) {
            if (nhanSu instanceof NhanVien) {
                TruongPhong truongPhong = ((NhanVien) nhanSu).truongPhong;
                if (soLuongNhanVienTheoTruongPhong.containsKey(truongPhong)) {
                    soLuongNhanVienTheoTruongPhong.put(truongPhong, soLuongNhanVienTheoTruongPhong.get(truongPhong) + 1);
                } else {
                    soLuongNhanVienTheoTruongPhong.put(truongPhong, 1);
                }
            }
        }

        for (Map.Entry<TruongPhong, Integer> entry : soLuongNhanVienTheoTruongPhong.entrySet()) {
            System.out.println(entry.getKey().hoTen + " quản lý " + entry.getValue() + " nhân viên.");
        }

        // Tính và in ra mức lương của từng loại nhân sự
        for (NhanSu nhanSu : nhanSuList) {
            double luong = nhanSu.tinhLuong();
            if (nhanSu instanceof GiamDoc) {
                System.out.println("Giám đốc: " + nhanSu.hoTen + ", Lương: " + luong + " VND");
            } else if (nhanSu instanceof TruongPhong) {
                System.out.println("Trưởng phòng: " + nhanSu.hoTen + ", Lương: " + luong + " VND");
            } else if (nhanSu instanceof NhanVien) {
                System.out.println("Nhân viên: " + nhanSu.hoTen + ", Lương: " + luong + " VND");
            }
        }
    }
}