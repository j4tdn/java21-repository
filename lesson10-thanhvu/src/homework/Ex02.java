package homework;

public class Ex02 {
	
	public static void main(String[] args) {
		int[][] arr = {
                {1, 2, 3},
                {2, 0, 0},
                {3, 4, 5},
                {4, 7, 0}
        };

		int row = arr.length;
		int col = arr[0].length;

		boolean[] zeroRow = new boolean[row];
		boolean[] zeroCol = new boolean[col];

		// Xác định các hàng và cột chứa giá trị 0
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == 0) {
					zeroRow[i] = true;
					zeroCol[j] = true;
				}
			}
		}

		// Chuyển đổi các hàng và cột có chứa giá trị 0 thành 0
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (zeroRow[i] || zeroCol[j]) {
					arr[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}
}
