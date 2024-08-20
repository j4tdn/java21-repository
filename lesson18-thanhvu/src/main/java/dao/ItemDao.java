package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.dto.ItemDto;
import persistence.dto.ItemGroupDto;
import persistence.dto.ItemStatisticDto;

public interface ItemDao {

	/**
	 * Get items by date
	 * 
	 * @return list of {@link ItemDto}
	 */
	List<ItemDto> getItemsBySalesDate(LocalDate salesDate);
	
	
	/**
	 * Get items in warehouse
	 * 
	 * @return list of {@link ItemStatisticDto}
	 */
	List<ItemStatisticDto> getItemsInWarehouse();
	
	/**
	 * Get top 3 item sale with year
	 * 
	 * @return list of item name
	 */
	List<String> getTop3ItemSaleByYear(int year);
	
	
	/**
	 * Get items of items group
	 * 
	 * @return list of {@link ItemGroupDto}
	 */
	List<ItemGroupDto> getItemsOfItemGroup();

}