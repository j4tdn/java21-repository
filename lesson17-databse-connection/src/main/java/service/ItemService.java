package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemService {
	/*
	 * Get all items
	 * 
	 * @return list of {@Item link}
	 */
	List<Item> getAll();
	
	/*
	 * Get item with given sales day
	 * 
	 * @return list of {@Item link}
	 */
	List<Item> getItemsBySalesDate(LocalDate salesDate);
}
