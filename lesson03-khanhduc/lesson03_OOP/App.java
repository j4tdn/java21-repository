package lesson03_OOP;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "Kate", "243", "California");
		
		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("IP4", "IOS", "Black", 840);
		Item i3 = new Item("IP8", "IOS", "RED", 940);
		Item i4 = new Item("WP8", "WindowPhone", "Blue", 540);
		Item i5 = new Item("IP15", "IOS", "Black", 1240);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1, 4),
				new ItemDetail(i2, 2),
				new ItemDetail(i3, 3),
		}, LocalDateTime.of(2023, 9, 14, 23, 54, 34));

	Order o2 = new Order(c2, new ItemDetail[] {
			new ItemDetail(i4, 4),
			new ItemDetail(i5, 2),
	}, LocalDateTime.of(2023, 9, 14, 24, 02, 45));
	
	System.out.println("Tong tien Order 1 = "+ o1.export());
}
	
	
}
