package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex01 {
	static Integer[] array1 = {1,3,5,8,5,4,5};
	static Integer[] array2 = {9,4,5,7,8,3};
	static ArrayList<Integer> arrListNumber1 = new ArrayList<>();
	static ArrayList<Integer> arrListNumber2 = new ArrayList<>();
	static Integer[] resultArray = new Integer[array1.length];
	
	public static void main(String[] args) {
		int count = 0;
		Collections.addAll(arrListNumber1, array1);
		Collections.addAll(arrListNumber2, array2);
		fillArrayNum1();
		fillArrayNum2();
		for(int i = 0; i< arrListNumber1.size();i++) {
			for(int k = 0; k< arrListNumber2.size(); k++)
			if(arrListNumber1.get(i)==arrListNumber2.get(k)) {
				resultArray[count] = arrListNumber1.get(i);
				count++;
			}
			
		}
		System.out.println(" Mảng chung là: "+Arrays.toString(resultArray) );
	}
	private static void fillArrayNum1() {
		int number;
		ArrayList<Integer> arrTemp = new ArrayList<>();
	    for (int i = 0; i < arrListNumber1.size(); i++) {
	        if (!arrTemp.contains(arrListNumber1.get(i))) {
	            arrTemp.add(arrListNumber1.get(i));
	        }
	    }
	    arrListNumber1.clear();
	    arrListNumber1.addAll(arrTemp);     
	}
	private static void fillArrayNum2() {
		int number;
		ArrayList<Integer> arrTemp = new ArrayList<>();
	    for (int i = 0; i < arrListNumber2.size(); i++) {
	        if (!arrTemp.contains(arrListNumber2.get(i))) {
	            arrTemp.add(arrListNumber2.get(i));
	        }
	    }
	    arrListNumber2.clear();
	    arrListNumber2.addAll(arrTemp);     
	}
}
