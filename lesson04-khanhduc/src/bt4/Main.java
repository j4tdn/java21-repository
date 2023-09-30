package bt4;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
	 public static void main(String[] args) {
	        ArrayList<NhanSu> danhSachNhanSu = new ArrayList<>();
	        // Tạo dữ liệu gồm 1 Giám đốc, 2 Trưởng phòng, 6 Nhân viên
	        danhSachNhanSu.add(new GiamDoc("Nguyen Van A", "01/01/1970", 1.5, 0.5));
	        danhSachNhanSu.add(new TruongPhong("Tran Thi B", "15/05/1980", 1.2, 0.3, "Phòng A"));
	        danhSachNhanSu.add(new TruongPhong("Le Van C", "20/03/1982", 1.3, 0.4, "Phòng B"));
	        danhSachNhanSu.add(new NhanVien("Pham Van D", "10/06/1990", 1.0, "Tran Thi B"));
	        danhSachNhanSu.add(new NhanVien("Hoang Thi E", "05/08/1995", 1.1, "Tran Thi B"));
	        danhSachNhanSu.add(new NhanVien("Nguyen Van F", "12/12/1988", 1.0, "Le Van C"));
	        danhSachNhanSu.add(new NhanVien("Tran Van G", "02/04/1992", 1.1, "Le Van C"));
	        danhSachNhanSu.add(new NhanVien("Le Van H", "08/07/1993", 1.0, "Le Van C"));
	        danhSachNhanSu.add(new NhanVien("Nguyen Van I", "25/09/1994", 1.1, "Tran Thi B"));

	        System.out.println("Thông tin các nhân sự trong công ty:");
	        for (NhanSu ns : danhSachNhanSu) {
	            System.out.println(ns);
	        }

	        System.out.println("\nThống kê số lượng nhân viên được quản lý bởi từng trưởng phòng:");
	        ArrayList<String> danhSachTruongPhong = new ArrayList<>();
	        for (NhanSu ns : danhSachNhanSu) {
	            if (ns instanceof TruongPhong) {
	                TruongPhong truongPhong = (TruongPhong) ns;
	                String tenTruongPhong = truongPhong.hoTen;
	                danhSachTruongPhong.add(tenTruongPhong);
	            }
	        }
	        for (String truongPhong : danhSachTruongPhong) {
	            int soLuongNhanVien = demSoLuongNhanVien(danhSachNhanSu, truongPhong);
	            System.out.println("Trưởng phòng: " + truongPhong + ", Số lượng nhân viên: " + soLuongNhanVien);
	        }

	        System.out.println("\nMức lương của từng loại nhân sự:");
	        for (NhanSu ns : danhSachNhanSu) {
	            double luong = ns.tinhLuong();
	            System.out.println(ns.hoTen + ": " + luong + " VNĐ");
	        }
	    }

	    public static int demSoLuongNhanVien(ArrayList<NhanSu> danhSachNhanSu, String tenTruongPhong) {
	        int soLuong = 0;
	        for (NhanSu ns : danhSachNhanSu) {
	            if (ns instanceof NhanVien) {
	                NhanVien nhanVien = (NhanVien) ns;
	                if (nhanVien.truongPhong.equals(tenTruongPhong)) {
	                    soLuong++;
	                }
	            }
	        }
	        return soLuong;
	    }

}
