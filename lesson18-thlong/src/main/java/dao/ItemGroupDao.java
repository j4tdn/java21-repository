package dao;

import java.util.List;

import persistance.dto.ItemGroupAmountDTO;

public interface ItemGroupDao {
	List<ItemGroupAmountDTO> getAmountByItemGroup();
}	
