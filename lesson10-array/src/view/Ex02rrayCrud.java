package view;

import utils.ArrayUtils;

class Ex02rrayCrud {
	public static void main(String[] args) {
		int array[] = {2,9,3,17,7};
		
		ArrayUtils.generate("1.Number after add", add(array, 2, 88));
		ArrayUtils.generate("2. Remove" , remove(array, 3));
	}
	
	private static int[] add( int[] origin , int posToBeAdded, int newValue) {
		int[] target = new int[origin.length+1];
		for(int i=0;i<origin.length;i++) {
			target[i]= origin[i];
		}
		for(int i= target.length-1;i>posToBeAdded;i--) {
			target[i] = target[i-1];
		}
		target[posToBeAdded]= newValue;
		return target;
	}
	
	private static int[] remove(int[] origin, int posToBeRemove) {
		if(posToBeRemove<0 || posToBeRemove>= origin.length) {
			System.out.println("ERROR >> Index out Of Bound Exception");
			return origin;
		}
		int[] target = new int[origin.length-1];
		for(int i=0;i<origin.length-1;i++) {
			if(i>=posToBeRemove) target[i]= origin[i+1];
			else target[i]= origin[i];
		}
		return target;
	}
	
}
