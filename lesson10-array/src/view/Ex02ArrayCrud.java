package view;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex02ArrayCrud {
	public static void main(String[] args) {
		int[] numbers = {2, 9, 3, 17, 7};
		int[] numAfterAdd = new int[6];
		numAfterAdd = add(numbers, 2, 10);
		ArrayUtils.generate("Array after add elements --> ", numAfterAdd);
		
		int[] removed = remove(numbers, 2);
		ArrayUtils.generate("Arrau after remove element --> ", removed);
	}
	
	public static int[] add(int[] origin, int posToBeAdded, int newValue) {
		int[] target = new int[origin.length + 1];
		
		for(int i = 0; i < target.length-1; i++) {
			target[i] = origin[i];
		}
		
		for(int i = target.length - 1; i > posToBeAdded; i--) {
			target[i] = target[i-1];
		}
		
		target[posToBeAdded] = newValue;
		return target;
	}
	
	private static int[] remove(int[] origin, int posToBeRemoved) {
		if(posToBeRemoved < 0 || posToBeRemoved >= origin.length) {
			System.out.println("Error >> Index Out Of Bound Exception");
			return origin;
		}
		int[] target = new int[origin.length];
		
		for(int i = 0; i < target.length-1; i++) {
			target[i] = origin[i];
		}
		
		for(int i = posToBeRemoved; i < target.length-1; i++) {
			target[i] = target[i+1];
		}
		
		return Arrays.copyOfRange(target, 0, target.length-1);
	}
}
