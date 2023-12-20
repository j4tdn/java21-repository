package view;

import java.util.Arrays;
import static utils.ArrayUtils.*;

public class Ex02ArrayCrud {

	public static void main(String[] args) {
		
		int[] numbers = {2, 9, 3, 17, 7};
		generate("0. Numbers", numbers);
		
		// Create => add(int[] elements, int posToBeAdded, int newValue)
		//        => add(numbers, 2, 88) --> {2, 9, 88, 3, 17, 7}
		int[] added = add(numbers, 4, 88);
		generate("1. Numbers after added", added);
		
		// Read   => numbers[i]
		
		// Update => numbers[i] = ?
		
		// Delete => remove(int[] elements, int posToBeRemoved)
		//        => remove(numbers, 3) --> {2, 9, 3, 7};
		
		int[] removed = remove(numbers, 3);
		generate("2. Numbers after removed", removed);
	}
	
	private static int[] add(int[] origin, int posToBeAdded, int newValue) {
		if (posToBeAdded < 0 || posToBeAdded >= origin.length) {
			System.out.println("ERROR >> Index Out Of Bound Exception");
			return origin;
		}
		
		int[] target = new int[origin.length+1];
		
		copy(origin, target);
		
		for (int i = target.length-1; i > posToBeAdded; i--) {
			target[i] = target[i-1];
		}
		
		target[posToBeAdded] = newValue;
		
		return target;
		
	}
	
	private static int[] remove(int[] origin, int posToBeRemoved) {
		if (posToBeRemoved < 0 || posToBeRemoved >= origin.length) {
			System.out.println("ERROR >> Index Out Of Bound Exception");
			return origin;
		}
		int[] target = new int[origin.length];
		
		//copy(origin, target);
		System.arraycopy(origin, 0, target, 0, origin.length);
		
		for (int i = posToBeRemoved; i < target.length - 1; i++) {
			target[i] = target[i+1];
		}
		return Arrays.copyOfRange(target, 0,  target.length - 1);
	}
}
