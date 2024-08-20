package service;

import java.util.List;

import persistence.entities.Item;

public interface ItemService {

	/**
	 * Get all items
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
	
}
