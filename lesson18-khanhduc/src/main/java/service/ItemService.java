package service;

import java.time.LocalDate;
import java.util.List;

import dto.ItemDetailDto;
import dto.OrderItemDto;

public interface ItemService {
	
	List<OrderItemDto> getAllItemToday(LocalDate date);
	
	List<String> getTop3SellingItemsByYear(int year);
	
	List<ItemDetailDto> getAllItemDetail();
}