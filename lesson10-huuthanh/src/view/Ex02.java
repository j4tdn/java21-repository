package view;

import java.util.Arrays;
import static Util.ArrayUtil.*;
public class Ex02 {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{2,0,0},
				{3,4,5},
				{4,7,0}
		};
		int[][] arrr = matrix(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
