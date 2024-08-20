package service;

import java.util.List;

import persistance.dto.ItemOrderDTO;

public interface ItemService {
	List<ItemOrderDTO> getItemSoldByDate (String date);
	
	List<String> getItemSaleTopThreeByYear (Integer year);
	
}
