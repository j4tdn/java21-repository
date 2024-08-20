package service;

import java.util.List;

import persistence.dto.ItemDto;
import persistence.entities.Item;

public interface ItemService {
	/*
	 * Get all items
	 * @return list {link Item}
	 */
	List<Item> getAll();
	
	/*
	 * Get all items by created time
	 * @return list {link ItemDto}
	 */
	List<ItemDto> getItemByCreatedTime(String createdTime);
}
