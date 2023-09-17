package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		/*
		 	c1: KH1, Adam, 123, New York
			c2: KH2, Kate, 823, Cali

			i1: SS10+, Android, Black, 620
			i2: SS20U, Android, Green, 840
			i3: IP4, IOS, White, 280
			i4: IP12, IOS, Black, 880
			i5: WP8, Window, Blue, 560
			
			Order1: c1, {id1(i1, 3), id2(i4, 1), id3(i2, 1)}, date_time
			Order2: c2, {id1(i3, 2), id2(i5, 1)}, date_time
			Order3: c2, {id1(i4, 1)}, date_time
		 */
		
		Customer c1 = new Customer("KH1", "Adam", "123", "New York");
		Customer c2 = new Customer("KH2", "Kate", "823", "Cali");
		
		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SS20U+", "Android", "Green", 840);
		Item i3 = new Item("IP4", "IOS", "White", 280);
		Item i4 = new Item("IP12", "IOS", "Black", 880);
		Item i5 = new Item("WP8+", "Window", "Blue", 560);
		
		Order o1 = new Order(c1, new ItemDetails[] {
				new ItemDetails(i1, 3),
				new ItemDetails(i4, 5),
				new ItemDetails(i2, 1)
		}, LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		
		Order o2 = new Order(c2, new ItemDetails[] {
				new ItemDetails(i3, 2),
				new ItemDetails(i5, 1),
		}, LocalDateTime.of(2021, 5, 7, 20, 10, 12));
		
		Order o3 = new Order(c2, new ItemDetails[] {
				new ItemDetails(i4, 1)
		}, LocalDateTime.of(2021, 5, 8, 9, 28, 32));
		
		
		
		System.out.println("Order 1: " + OrderUtils.export(o1));
		System.out.println("Order 2: " + OrderUtils.export(o2));
		System.out.println("Order 3: " + OrderUtils.export(o3));
				
		// Write method export in Another class: export (order)
	}
}
