package array;

import java.util.Arrays;

import datastructure.object.custom.Item;

public class Ex04FilterObject {
	
	public static void main(String[] args) {
		Item itemA = new Item(123, 'A', 230);
		Item itemB = new Item(234, 'B', 730);
		Item itemC = new Item(345, 'C', 100);
		
		Item[] items = {itemA, itemB, itemC};
		System.out.println(Arrays.toString(findPrice(items)));
	}
	
	//Tìm những mặt hàng có giá lớn hơn 200
	private static Item[] findPrice(Item[] items) {
		int count = 0;
		Item[] result = new Item[items.length];
		for (Item item: items) {
			if (item.price > 200) {
				result[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
