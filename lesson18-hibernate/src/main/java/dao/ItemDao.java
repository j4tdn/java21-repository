package dao;

import java.util.List;

import entity.Item;

public interface ItemDao {
	/**
	 * Get all items
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();

}
