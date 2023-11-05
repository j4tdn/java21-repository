package exercise;
import java.text.Normalizer;
import java.util.Scanner;

// Đã tham khảo

public class Ex03Demo {
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhập vào chuỗi Tiếng Việt có dấu: ");
        String chuoiViet = sc.nextLine();
        sc.close();
        String chuoiKhongDau = chuyenDoiChuoiKhongDau(chuoiViet);
        System.out.println("Chuỗi không dấu: " + chuoiKhongDau);
    }

    public static String chuyenDoiChuoiKhongDau(String chuoi) {
        String chuoiKhongDau = Normalizer.normalize(chuoi, Normalizer.Form.NFD);
        chuoiKhongDau = chuoiKhongDau.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        return chuoiKhongDau;
    }
}