package service;

import java.time.LocalDate;
import java.util.List;

import persistence.entities.Item;

public interface ItemService {

	// Tên biến trong Java ko đặt _ e nha
	// createdTime
	List<Item> getItemByCreatedTime(LocalDate created_time);
	
}
