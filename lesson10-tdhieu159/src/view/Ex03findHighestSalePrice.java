package view;


import bean.Item;

public class Ex03findHighestSalePrice {
	public static void main(String[] args) {
		Item[] items = getItem();
		System.out.println("Mặt Hàng có giá bán cao nhất: " + getHighestPriceItem(items, HighestPrice(items)));
	}
	
	private static Item[] getItem() {
		Item i1 = new Item(1, "A", 25, 101);
		Item i2 = new Item(2, "B", 90, 102);
		Item i3 = new Item(3, "C", 88, 102);
		Item i4 = new Item(4, "D", 40, 101);
		Item i5 = new Item(5, "E", 60, 102);
		Item i6 = new Item(6, "F", 18, 101);
		return new Item[] {i1, i2, i3, i4, i5, i6};
	}
	
	private static double HighestPrice(Item[] items) {
		double highestPrice = Double.MIN_VALUE;
		for (Item item: items) {
			if (item.getSalePrice() > highestPrice) {
				highestPrice = item.getSalePrice();
			}
		}
		return highestPrice;
	}
	
	private static Item getHighestPriceItem(Item[] items, double highestPrice) {
		Item HighestPriceItem = items[0];
		for (int i = 0; i < items.length; i++) {
			if (items[i].getSalePrice() == highestPrice) {
				HighestPriceItem = items[i];
			}
		}
		return HighestPriceItem;
	}
	
	
	
	
}
