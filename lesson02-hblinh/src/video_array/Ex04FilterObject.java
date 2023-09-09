package video_array;

import java.util.Arrays;

public class Ex04FilterObject {
	public static void main(String[] args) {
		Item itemA = new Item(123, "Aa", 720);
		Item itemB = new Item(234, "Bb", 260);
		Item itemC = new Item(456, "Cc", 100);
		Item[] items = { itemA, itemB, itemC};
		System.out.println(Arrays.toString(getPrice(items)));
		
	}
	private static String[] getPrice(Item[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for(Item element: elements) {
				if(element.price > 200) {
					result[count]= element.name;
				}
				count++;
			}
		return Arrays.copyOfRange(result, 0, count-1);
	}
}
