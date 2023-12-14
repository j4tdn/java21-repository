package homework;


	public class Ex02Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        System.out.println("Ma trận trước khi chuyển đổi:");
        printMatrix(matrix);

        transformMatrix(matrix);

        System.out.println("\nMa trận sau khi chuyển đổi:");
        printMatrix(matrix);
    }

    // Hàm chuyển đổi ma trận
    public static void transformMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Tìm phần tử có giá trị bằng 0
        int zeroRow = -1;
        int zeroCol = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow = i;
                    zeroCol = j;
                    break;
                }
            }
            if (zeroRow != -1) {
                break;
            }
        }

        // Chuyển tất cả các hàng và cột của phần tử có giá trị bằng 0 về 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == zeroRow || j == zeroCol) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Hàm in ma trận
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
