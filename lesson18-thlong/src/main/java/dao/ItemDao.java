package dao;

import java.util.List;

import persistance.dto.ItemDTO;
import persistance.dto.ItemOrderDTO;

public interface ItemDao {
	List<ItemOrderDTO> getItemSoldByDate (String date);
	
	List<String> getItemSaleTopThreeByYear (Integer year);
	
	List<ItemDTO> getItem ();
}
