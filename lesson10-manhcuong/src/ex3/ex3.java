package ex3;

import java.util.HashMap;
import java.util.Map;

class Item {
    int itemId;
    String name;
    int salesPrice;
    int storeId;

    public Item(int itemId, String name, int salesPrice, int storeId) {
        this.itemId = itemId;
        this.name = name;
        this.salesPrice = salesPrice;
        this.storeId = storeId;
    }
}

	public class ex3 {
		public static void main(String[] args) {
	        Item[] items = {
	            new Item(1, "A", 25, 101),
	            new Item(2, "B", 90, 102),
	            new Item(3, "C", 88, 102),
	            new Item(4, "D", 40, 101),
	            new Item(5, "E", 60, 102),
	            new Item(6, "F", 18, 101)
	        };

	        Map<Integer, Item> maxPriceItems = new HashMap<>();

	        for (Item item : items) {
	            if (!maxPriceItems.containsKey(item.storeId) || maxPriceItems.get(item.storeId).salesPrice < item.salesPrice) {
	                maxPriceItems.put(item.storeId, item);
	            }
	        }

	        for (Item item : maxPriceItems.values()) {
	            System.out.println("Mặt hàng có giá bán cao nhất tại cửa hàng " + item.storeId + " là: " + item.name + " với giá " + item.salesPrice);
	        }
	    }
	}
	