package view;

import untils.ArrayUtils;
// xem laij EX02
public class Ex02ArrayCrud {
	public static void main(String[] args) {
		
		int [] numbers = {2, 9, 3, 17, 7};
		
		//create => add( int[] elements, int posToBeAdded, int  newValue
		//	     => add (numbers, 2, 88) --> {2, 9, 88, 3, 17, 7}
		int []added =  add(numbers, 0, 88);
		ArrayUtils.generate("1.Number after add", added);
		add(numbers, 2, 88);
		//read = number [i]
		
		//Update => number[i] =?
		
		
	
		//Delete ==> remove(int[] elements, int pos toBeRemoved)
			   //==> remove(number, 3) -->{2, 9, 3, 7}
	
	}
	
	private static int[] add( int[] origin, int posToBeAdded, int  newValue) {
		//B1: Create a new targer array
		if( posToBeAdded< 0 || posToBeAdded >= origin.length) {
			System.out.println("Error >> Index out of bound exception");
			return origin;
		}
			int[] target = new int[origin.length+1];
			for (int i = 0; i< origin.length; i++) {
				target[i] = origin[i];
			}
			
			for (int i = target.length-1; i > posToBeAdded; i--) {
				target[i] = target[i-1];
			}
			target[posToBeAdded] = newValue;
			return target;
		//
	}
	
	
	private static int[] remove( int[] elements, int postoBeRemoved) {
		return null;
		
	}
	
}
