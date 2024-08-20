package dao;

import java.util.List;

import persistence.dto.ItemDto;
import persistence.entities.Item;

public interface ItemDao {
	List<Item> getItem();
	
	List<ItemDto> getItemByCreateTime(String date);

}