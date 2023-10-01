package ex03;

public class Pascaltriangle {
	public static void main(String[] args) {
        int n = 5; 
        int[][] pascalTriangle = new int[n][n];
        for (int i = 0; i < n; i++) {
            pascalTriangle[i][0] = 1; 
            pascalTriangle[i][i] = 1; 
            
            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

