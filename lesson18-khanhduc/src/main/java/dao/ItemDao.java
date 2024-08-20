package dao;

import java.time.LocalDate;
import java.util.List;

import dto.ItemDetailDto;
import dto.OrderItemDto;

public interface ItemDao {
	
	List<OrderItemDto> getAllItemToday(LocalDate date);
	
	List<String> getTop3SellingItemsByYear(int year);
	
	List<ItemDetailDto> getAllItemDetail();
}