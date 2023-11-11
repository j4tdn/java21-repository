package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        
        int[] mang1 = {2, 8, 9, 1, 6};
        int[] mang2 = {2, 1, 1, 8, 9};

        // goi phuong thuc va in ket qua
        List<Integer> ketQua = timSoPhanTuChung(mang1, mang2);
        for (int num : ketQua) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> timSoPhanTuChung(int[] mang1, int[] mang2) {
        Set<Integer> setMang1 = new HashSet<>();
        List<Integer> ketQua = new ArrayList<>();

        // them cac phan tu cua mang 1 vao set mang1
        for (int num : mang1) {
            setMang1.add(num);
        }

        // kiem tra cac phan tu cua mang 2 va them vao ket qua neu tim thay trong set mang 1 
        for (int num : mang2) {
            if (setMang1.contains(num)) {
                ketQua.add(num);
                setMang1.remove(num); 
            }
        }

        ketQua.sort(null);

        return ketQua;
    }
}