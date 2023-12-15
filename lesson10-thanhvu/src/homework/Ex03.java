package homework;

import bean.Item;

public class Ex03 {
	
	public static void main(String[] args) {
		Item[] items = { new Item(1, "A", 25, 101), 
				         new Item(2, "B", 90, 102), 
				         new Item(3, "C", 88, 102),
				         new Item(4, "D", 40, 101), 
				         new Item(5, "E", 60, 102), 
				         new Item(6, "F", 18, 101) };

		Item[] maxItems = new Item[1000];

		for (Item item : items) {
			int storeId = item.getStoreId();

			if (maxItems[storeId] == null || item.getSalesPrice() > maxItems[storeId].getSalesPrice()) {
				maxItems[storeId] = item;
			}
		}

		for (Item item : maxItems) {
			if (item != null) {
				System.out.println("Mặt hàng có giá bán cao nhất của cửa hàng " + item.getStoreId() + ": " + item.getName()
						+ ", giá: " + item.getSalesPrice());
			}
		}
	}
}
