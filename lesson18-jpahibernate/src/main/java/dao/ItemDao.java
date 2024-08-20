package dao;

import java.util.List;

import persistence.entities.Item;

public interface ItemDao {
	
	/*
	 * Get all items
	 * @return list {link Item}
	 */
	List<Item> getAll();
	
}
