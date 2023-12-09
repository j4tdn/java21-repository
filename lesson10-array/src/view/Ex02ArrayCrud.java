package view;

public class Ex02ArrayCrud {
	public static void main(String[] args) {
		
		int[] numbers = {2, 9, 3, 17, 7};
		// create, read, update, delete
	}
	
	private static int[] add(int[] origin, int posToBeAdded, int newValue) {
		int[] target = new int [origin.length+1];
		
		for (int i = 0; i<origin.length; i++) {
			target[i] = origin[i];
		}
		
		for (int i = target.length-1; i > posToBeAdded; i--) {
			target[i] = target[i-1];
		}
		
		target[posToBeAdded] = newValue;
		return target;
	}
	
	
}
