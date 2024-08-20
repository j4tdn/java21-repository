package service;

import java.util.List;

import persistence.dto.ItemDto;
import persistence.entities.Item;

public interface ItemService {
	
	List<ItemDto> getItemByCreateTime(String date);
	
	List<Item> getItem();
}