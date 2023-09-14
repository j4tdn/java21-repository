package view;

import bean.Matrix;
import java.util.Scanner;
import utils.OrderUtils;

public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        System.out.print("Nhập số hàng của ma trận: ");
        rows = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cột của ma trận: ");
        columns = Integer.parseInt(sc.nextLine());
        
        Matrix matrix = new Matrix(rows, columns);
        
        matrix.enterData();
        matrix.displayMatrix();
        
        if (matrix.hasSaddlePoint()) {
            System.out.println("Ma trận chứa phần tử yên ngựa.");
        } else {
            System.out.println("Ma trận không chứa phần tử yên ngựa.");
        }
        sc.close();
    }
}
