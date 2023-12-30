package view.set;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

import bean.Item;


public class Ex02SetIdeaOfOverlapElements {
	public static void main(String[] args) {
		Set<Item> items = new LinkedHashSet<>();
		
		items.add(new Item(1, "Item 1", bd(1), 1, LocalDateTime.now()));
		items.add(new Item(2, "Item 1", bd(2), 1, LocalDateTime.now()));
		items.add(new Item(3, "Item 1", bd(3), 1, LocalDateTime.now()));
		
		// test overlap values
		items.add(new Item(2, "Item 1", bd(2), 1, LocalDateTime.now()));
		
		System.out.println("item: size " + items.size());
	}
	public static BigDecimal bd(Number number) {
		if (number == null) {
			return null;
		}
		return new BigDecimal(number.toString());
	}
	
}
