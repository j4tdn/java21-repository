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
	// Khi nào đề yêu cầu có param là ngày tháng năm thì nên truyền tham số là LocalDate e hi
	// Ko nên truyền String vì có thể sai format
	List<ItemDto> getItemByCreatedTime(String createdTime);
}
