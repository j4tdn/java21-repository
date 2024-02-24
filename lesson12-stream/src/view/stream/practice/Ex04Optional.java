package view.stream.practice;

import java.util.Optional;

import bean.Item;

public class Ex04Optional {

	public static void main(String[] args) {
		
		Optional<Item> optItem = Optional.ofNullable(getItem());	
		
		if(optItem.isPresent()) {
			Item item = optItem.get();
			item.setId(20);
			System.out.println("item1 --> " + item);
		}
		
		optItem.ifPresent(item -> {
			item.setId(20);
		    System.out.println("item2 --> " + item);
		});
		
		Item item = optItem.orElse(new Item());
		item.setId(20);
	    System.out.println("item3 --> " + item);
	    
		System.out.println("Finished");
		
	}
	
	private static Item getItem() {
		// return null / non-null --> logic
		return null;
	}
}
