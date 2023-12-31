
public class Ex02Execrcises {
	public static void main(String[] args) {
		int[] [] matrix = new int[] [] {
			{1,2,3,4},
			{5,6,7,8},
			{1,9,0,9},
			{2,9,6,5},
			{1,2,4,5}
		};
		convertMatrix(matrix);
		printMatrix(matrix);
	}
	public static void convertMatrix(int[] [] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		 // Tìm phần tử có giá trị bằng 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            	
                if (matrix[i][j] == 0) {   // Chuyển hết hàng i về giá trị 0
                    for (int k = 0; k < cols; k++) {
                        matrix[i][k] = 0;  // truy cập phần tử hàng i tại cột k
                    }
         
                    for (int k = 0; k < rows; k++) { // Chuyển hết cột j về giá trị 0
                        matrix[k][j] = 0; // truy cập phần tử hàng k tại cột j
                    }
                    
                    return;   // Dừng vòng lặp khi đã tìm thấy phần tử 0
                }
            }
        }
    }

   
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
	}

