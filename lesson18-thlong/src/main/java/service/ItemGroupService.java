package service;

import java.util.List;

import persistance.dto.ItemGroupAmountDTO;

public interface ItemGroupService {
	List<ItemGroupAmountDTO> getAmountByItemGroup();
}
