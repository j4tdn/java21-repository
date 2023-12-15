package view;

import util.ArrayUtil;

public class Ex02 {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {2, 0, 0},
                {3, 4, 5},
                {4, 7, 0}
        };

        int[][] arrr = ArrayUtil.matrix(arr);

        for (int i = 0; i < arrr.length; i++) {
            for (int j = 0; j < arrr[i].length; j++) {
                System.out.print(arrr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
