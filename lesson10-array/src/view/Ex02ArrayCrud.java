package view;

import java.util.Arrays;

import static utils.ArrayUtils.*;

public class Ex02ArrayCrud {

	public static void main(String[] args) {
		int[] numbers = { 2, 9, 3, 17 };

		// Create => add(int[] elements, int posToBeAdd, int newValue)
		int[] added = add(numbers, 2, 88);
		generate("1. Numbers after add", added);
		// Read = numbers[i]

		// Update = number[i] = ?

		// Delete => remove(int[] elements, int posToBeRemove)
		int[] removed = remove(numbers, 2);
		generate("1. Numbers after add", removed);

	}

	private static int[] add(int[] origin, int posToBeAdd, int newValue) {
		if (posToBeAdd < 0 || posToBeAdd >= origin.length) {
			System.out.println("ERROR >> Index Out Of Bound Exception");
			return origin;
		}

		int[] target = new int[origin.length + 1];

		copy(origin, target);

		for (int i = target.length - 1; i > posToBeAdd; i--) {
			target[i] = target[i - 1];
		}

		target[posToBeAdd] = newValue;

		return target;
	}

	private static int[] remove(int[] origin, int posToBeRemove) {
		if (posToBeRemove < 0 || posToBeRemove >= origin.length) {
			System.out.println("ERROR >> Index Out Of Bound Exception");
			return origin;
		}

		int[] target = new int[origin.length];
		
		//System.arraycopy(origin, 0, target, 0, origin.length);
		copy(origin, target);

		for (int i = posToBeRemove; i < target.length - 1; i++) {
			target[i] = target[i + 1];
		}

		return Arrays.copyOfRange(target, 0, target.length - 1);
	}
}
