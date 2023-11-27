package view;

import java.util.Arrays;
import static utils.ArrayUtils.*;

public class Ex02ArrayCRUD {

	public static void main(String[] args) {
		int[] numbers = { 2, 9, 3, 17, 7 };
		generate("0. Numbers", numbers);

		int[] newArrayAdded = add(numbers, 2, 10);
		generate("1. Numbers after added", newArrayAdded);

		int[] newArrayRemoved = remove(numbers, 2);
		generate("2. Numbers after removed", newArrayRemoved);
	}

	private static int[] add(int[] origin, int posToBeAdded, int newValue) {
		if (posToBeAdded < 0 || posToBeAdded >= origin.length) {
			System.out.println("ERROR >> Index Out Of Bound Exception");
			return origin;
		}

		int[] target = new int[origin.length + 1];

		copy(origin, target);

		for (int i = target.length - 1; i > posToBeAdded; i--) {
			target[i] = target[i - 1];
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

		// method copy
		System.arraycopy(origin, 0, target, 0, origin.length);

		for (int i = posToBeRemoved; i < target.length - 1; i++) {
			target[i] = target[i + 1];
		}

		return Arrays.copyOfRange(target, 0, target.length - 1);
	}
}
