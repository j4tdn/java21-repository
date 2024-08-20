package service;

import java.util.List;

import persistence.entity.Item;

public interface ItemService {
	
	/**
	 * Get all items
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();

}
