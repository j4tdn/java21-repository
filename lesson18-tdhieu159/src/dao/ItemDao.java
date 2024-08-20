package dao;

import java.util.List;

import dto.ItemDto;
import persistence.item;

public interface ItemDao {
	List<ItemDto> get();
	List<item> getAllItem();
	List<String> getNameItems();
}