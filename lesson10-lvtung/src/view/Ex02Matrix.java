package view;

import model.DataModel;

public class Ex02Matrix {

	public static void main(String[] args) {
		int[][] matrix = DataModel.matrix();
		
		System.out.println("--INPUT--");
		printMatrix(matrix);
		
		convertZeroMatrix(matrix);
	
		System.out.println("\n--OUTPUT--");
		printMatrix(matrix);
	}
	
	private static void convertZeroMatrix(int[][] matrix) {
        int zeroRowIndex = -1;
        int zeroColIndex = -1;

        // Tìm vị trí của phần tử có giá trị bằng 0
        outerLoop:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRowIndex = i;
                    zeroColIndex = j;
                    break outerLoop;
                }
            }
        }

        // Nếu tìm thấy phần tử 0, chuyển tất cả hàng và cột của nó về giá trị 0
        if (zeroRowIndex != -1 && zeroColIndex != -1) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (i == zeroRowIndex || j == zeroColIndex) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }

	private static void printMatrix(int[][] matrix) {
		for (int rowI = 0; rowI < matrix.length; rowI++) {
			for (int colI = 0; colI < matrix[rowI].length; colI++) {
				System.out.print(matrix[rowI][colI] + " ");
			}
			System.out.println();
		}
	}
}
