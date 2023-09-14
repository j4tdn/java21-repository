package bean;

import java.util.Scanner;

public class Matrix {

    private int rows;
    private int columns;
    private int[][] data;

    public Matrix() {
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void enterData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập phần tử tại [" + (i + 1) + "][" + (j + 1) + "]: ");
                data[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        sc.close();
    }

    public void displayMatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }

    public boolean hasSaddlePoint() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int currentElement = data[i][j];

                // Kiểm tra nếu phần tử hiện tại là phần tử nhỏ nhất trong hàng
                boolean isRowMin = true;
                for (int k = 0; k < columns; k++) {
                    if (data[i][k] < currentElement) {
                        isRowMin = false;
                        break;
                    }
                }
                // Kiểm tra nếu phần tử hiện tại là phần tử lớn nhất trong cột
                boolean isColumnMax = true;
                for (int k = 0; k < rows; k++) {
                    if (data[k][j] > currentElement) {
                        isColumnMax = false;
                        break;
                    }
                }

                // Nếu phần tử hiện tại là phần tử yên ngựa, trả về true
                if (isRowMin && isColumnMax) {
                    return true;
                }
            }
        }
        // Nếu không tìm thấy phần tử yên ngựa, trả về false
        return false;
    }
}
