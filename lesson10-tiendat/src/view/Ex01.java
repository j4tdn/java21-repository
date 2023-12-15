package view;

import util.ArrayUtil;

import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args) {

        int[] arr = {4, -1, 100, 7, -1, 5, 5};
        int[] arrr = ArrayUtil.removeDuplicatesInt(arr);

        for (int value : arrr) {
            System.out.print(value + " ");
        }

        System.out.println();

        if (ArrayUtil.compareNumber(arr)) {
            System.out.println("Trước lớn hơn sau.");
        } else {
            System.out.println("Sau lớn hơn trước.");
        }

        ArrayUtil.sort(arrr, 3);
    }
}
