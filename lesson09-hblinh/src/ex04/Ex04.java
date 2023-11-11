package ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhập chuỗi: ");
		String str = sc.nextLine();
		char[] arrayString = str.toCharArray();
		Ex04 p = new Ex04();
		p.getPermutation(arrayString);
		
	}
	public void getPermutation(char[] arrayString){
		printPermutation(arrayString, 0, true);
	} 
	
	private void printPermutation(char[] arrayString, int start, boolean display){
		if(display){
			System.out.println("");
			for(int i = 0; i < arrayString.length; i++){
				System.out.print(arrayString[i]);
			}
		}
		
		for(int j = start; j < arrayString.length; j++){
			int temp = arrayString[start];
			arrayString[start] = arrayString[j];
			arrayString[j] = (char) temp;
			if(j == start){
				printPermutation(arrayString, start+1, false);
			}else{
				printPermutation(arrayString, start+1, true);
			}	 
			temp = arrayString[start];
			arrayString[start] = arrayString[j];
			arrayString[j] = (char) temp;
		}
	}
}
