package view.strategy.practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class sa {
	public static void main(String[] args) {
		int[] arr = {3, 15, 21, 0, 15, 17, 21};
		int[] result = swap(getUniqueNumbers(arr));
		for (int i=0; i< getUniqueNumbers(arr).length; i++) {
			System.out.println(result[i]+ "\t");
		}
	}
	
	static int[] getUniqueNumbers(int[] arr) {
		int[] lst = new int[arr.length];
		int j=0;
		for (int i=0; i<arr.length; i++) {
			if(checkIsOne(arr[i],arr)) {
				lst[j++] = arr[i];
			}
		}
		int[] finalResult = Arrays.copyOfRange(lst, 0, j);
		return finalResult;
	}
	
	static boolean checkIsOne(int num, int[] arr) {
		int dem =0;
		for (int i : arr) {
			if(i == num) {
				dem ++;
			}
		}
		if(dem ==1) return true;
		else return false;
	}
	
	static int[] swap(int[] arr) {
		int num = arr.length;
		for (int i = 0; i < (num - 1); i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		return arr;
	}
}
