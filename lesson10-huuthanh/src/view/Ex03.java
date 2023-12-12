package view;

import java.util.HashMap;

public class Ex03 {
    public static void main(String[] args) {
        Item[] items = {
            new Item(1, "A", 25, 101),
            new Item(2, "B", 90, 102),
            new Item(3, "C", 88, 102),
            new Item(4, "D", 40, 101),
            new Item(5, "E", 60, 102),
            new Item(6, "F", 18, 101)
        };

        
        HashMap<Integer, Item> max = new HashMap<>();

        for (Item item : items) {
            if (!max.containsKey(item.storeId) ||
                item.salesPrice > max.get(item.storeId).salesPrice) {
            	max.put(item.storeId, item);
            }
        }

        for (Item item : max.values()) {
            System.out.println("Mặt hàng có giá bán cao nhất của cửa hàng " + item.storeId + ": " + item.name + ", giá: " + item.salesPrice);
        }
    }
}