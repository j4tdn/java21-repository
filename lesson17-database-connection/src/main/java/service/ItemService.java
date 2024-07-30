package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemService {

	/**
	 * Get all items
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
	
	/**
	 * Get items with given sales date
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getItemsBySaleDate(LocalDate salesDate);
}
