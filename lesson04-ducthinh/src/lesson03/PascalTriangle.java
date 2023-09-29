package lesson03;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5; // Số hàng của tam giác Pascal
        printPascalTriangle(n);
    }

    public static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int value = 1; // Phần tử đầu tiên của mỗi hàng luôn là 1
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println(); 
        }
    }
}

