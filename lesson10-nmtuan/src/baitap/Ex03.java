package baitap;

public class Ex03 {
	static int arrayLength = 5;

	public static void main(String[] args) {
		// tạo mảng int 2 chiều 5 nhân 5:
		int[][] numbers = { 
				{ 1, 5, 1, 7, 0 }, 
				{ 2, 0, 7, 7, 0 },
				{ 9, 7, 1, 3, 1 }, 
				{ 4, 4, 9, 2, 5 },
				{ 0, 5, 0, 1, 2 } 
		};
		
		show(numbers);
		System.out.println("========");
		changeToZero(numbers);
		show(numbers);
	}

	private static void show(int[][] numbers) {
		for (int i = 0; i < arrayLength; i++) {
			for (int j = 0; j < arrayLength; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void changeToZero(int[][] numbers) {
		int[] zeroRows = new int[arrayLength];
		int[] zeroColumns = new int[arrayLength];
		int zeroRowIndex = 0;
		int zeroColumnIndex = 0;

		// xét phần tử a[i][j] == 0 thì thêm i, j vào 2 mảng zeroRows, zeroColumns
		for (int i = 0; i < arrayLength; i++) {
			for (int j = 0; j < arrayLength; j++) {
				if (numbers[i][j] == 0) {
					if (!isContain(i, zeroRows)) {
						zeroRows[zeroRowIndex++] = i;
					}

					if (!isContain(j, zeroColumns)) {
						zeroColumns[zeroColumnIndex++] = j;
					}
				}
			}
		}

		// chuyển tất cả phần tử thuộc các row và column có trong 2 mảng zeroRows,
		// zeroColumns về 0
		for (int indexRow : zeroRows) {
			for (int index = 0; index < arrayLength; index++) {
				numbers[indexRow][index] = 0;
			}
		}
		for (int indexColumn : zeroColumns) {
			for (int index = 0; index < arrayLength; index++) {
				numbers[index][indexColumn] = 0;
			}
		}
	}

	private static boolean isContain(int number, int[] numbers) {
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] == number) {
				return true;
			}
		}
		return false;
	}
}