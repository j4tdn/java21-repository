package view;

import java.util.List;

import entity.Item;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {

	private static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		selfGenerate("1.Get All Item", itemService.getAll());
	}
	
	public static void selfGenerate(String prefix, List<Item> elements) {
		System.out.println(prefix + " ---> {");
		elements.forEach(e -> {
			System.out.println(e);
			System.out.println("--> "+ e.getGroup() + " \n");
		});
		System.out.println("}\n");
	}
}
