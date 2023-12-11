package view;

public class Ex02Demo {
	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };

		int row = -1, col = -1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					row = i;
					col = j;
					break;
				}
			}
		}
		
		for(int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
		
		for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
