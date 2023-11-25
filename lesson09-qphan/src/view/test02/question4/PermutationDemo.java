package view.test02.question4;

public class PermutationDemo {

	// Driver code
	public static void main(String args[]) {
		String a[] = { "a", "b", "c" };
		heapPermutation(a, a.length, a.length);
	}

	// Generating permutation using Heap Algorithm
	static void heapPermutation(String a[], int size, int n) {
		// if size becomes 1 then prints the obtained
		// permutation
		if (size == 1)
			printArr(a, n);
		
		// size = 3
		// n = 3
		// i = 0, a[0] = a --> heapPermutation(a, 2, 3);
		// i = 0, a[0] = a --> heapPermutation(a, 1, 3);
		// i = 0, a[0] = a --> heapPermutation(a, 0, 3);
		for (int i = 0; i < size; i++) {
			heapPermutation(a, size - 1, n);

			// if size is odd, swap 0th i.e (first) and
			// (size-1)th i.e (last) element
			if (size % 2 == 1) {
				String temp = a[0];
				a[0] = a[size - 1];
				a[size - 1] = temp;
			}

			// If size is even, swap ith
			// and (size-1)th i.e last element
			else {
				String temp = a[i];
				a[i] = a[size - 1];
				a[size - 1] = temp;
			}
		}
	}

	static void printArr(String a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
