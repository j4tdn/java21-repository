package exercises03;

import java.util.Scanner;

public class HorseSaddle {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số hàng (M): ");
	        int m = scanner.nextInt();

	        System.out.print("Nhập số cột (N): ");
	        int n = scanner.nextInt();

	        int[][] matrix = new int[m][n];

	        // Nhập dữ liệu cho ma trận
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print("Nhập phần tử tại vị trí [" + i + "][" + j + "]: ");
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        // Kiểm tra và in ra phần tử yên ngựa
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                int currentElement = matrix[i][j];
	                boolean isYenNgua = true;

	                // Kiểm tra hàng
	                for (int k = 0; k < n; k++) {
	                    if (matrix[i][k] < currentElement) {
	                        isYenNgua = false;
	                        break;
	                    }
	                }

	                // Kiểm tra cột
	                if (isYenNgua) {
	                    for (int k = 0; k < m; k++) {
	                        if (matrix[k][j] > currentElement) {
	                            isYenNgua = false;
	                            break;
	                        }
	                    }
	                }

	                // Nếu là phần tử yên ngựa, in ra
	                if (isYenNgua) {
	                    System.out.println("Phần tử yên ngựa tại vị trí [" + i + "][" + j + "]: " + currentElement);
	                }
	            }
	        }

	        scanner.close();
	    }
	}

