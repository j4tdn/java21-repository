package view.stream.pratice;

import java.util.Optional;

import bean.Item;

public class Ex04Optional {

	public static void main(String[] args) {
		
		Optional<Item> optItem = Optional.ofNullable(getItem());
		if(optItem.isPresent()) {
			Item item = optItem.get();
			item.setId(20);
			System.out.println("Item -->:" +item);
		}
		optItem.ifPresent(item ->{
			item.setId(20);
			System.out.println("Item2 -->:" +item);
			
		});
		Item item = optItem.orElse(new Item());
		item.setId(20);
		System.out.println("Item3 -->:" +item);
		
	}
	
	private static Item getItem() {
		//return null/ non null --> logic
		return null;
	}
}
