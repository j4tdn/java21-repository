package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemDao {
	
	/**
	 * Get all items
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
	
	/**
	 * Get items with given sales date
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getItemsBySalesDate(LocalDate salesDate);
	
}