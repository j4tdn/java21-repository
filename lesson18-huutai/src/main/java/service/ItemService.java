package service;

import java.time.LocalDate;
import java.util.List;

import persistence.entities.Item;

public interface ItemService {

	List<Item> getItemByCreatedTime(LocalDate created_time);
	
}
