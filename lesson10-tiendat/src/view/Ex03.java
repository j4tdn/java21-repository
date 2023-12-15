package view;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = { new Item(1, "A", 25, 101), 
				         new Item(2, "B", 90, 102), 
				         new Item(3, "C", 88, 102),
				         new Item(4, "D", 40, 101), 
				         new Item(5, "E", 60, 102), 
				         new Item(6, "F", 18, 101) };

		// Mảng lưu trữ các mặt hàng có giá bán cao nhất của mỗi cửa hàng
		Item[] maxItems = new Item[1000]; // Số lượng cửa hàng tối đa

		for (Item item : items) {
			int storeId = item.storeId;

			// Nếu chưa có mặt hàng nào cho cửa hàng này hoặc giá bán cao hơn
			if (maxItems[storeId] == null || item.salesPrice > maxItems[storeId].salesPrice) {
				maxItems[storeId] = item;
			}
		}

		for (Item item : maxItems) {
			if (item != null) {
				System.out.println("Mặt hàng có giá bán cao nhất của cửa hàng " + item.storeId + ": " + item.name
						+ ", giá: " + item.salesPrice);
			}
		}
	}
}
