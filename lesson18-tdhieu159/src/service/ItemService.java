package service;

import java.util.List;

import dto.ItemDto;
import persistence.item;

public interface ItemService {
	List<ItemDto> get();
	List<item> getAllItem();
	List<String> getNameItems();
}