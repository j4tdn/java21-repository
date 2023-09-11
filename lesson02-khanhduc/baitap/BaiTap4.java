package baitap;

import java.util.Random;
import java.util.Scanner;

public class BaiTap4 {
public static void main(String[] args) {
int[] number = new int[4];
Random rd = new Random();
for (int i = 0; i < 4; i++) {
    number[i] = rd.nextInt(11) + 10;
}
int tongGiaiThua = 0;
for (int i = 0; i < 4; i++) {
    tongGiaiThua += tinhGiaiThua(number[i]);
    System.out.println("Số thứ " + (i + 1) + " = " + number[i]);
}
System.out.println("Tổng giải thừa = " + tongGiaiThua);
}


public static int tinhGiaiThua(int a) {
	if (a <= 1) {
        return 1;
    } else {
        return a * tinhGiaiThua(a - 1);
    }

}
}
