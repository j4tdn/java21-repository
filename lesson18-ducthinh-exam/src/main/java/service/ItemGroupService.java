package service;

import java.util.List;

import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public interface ItemGroupService {
	
	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
	 * Get item group by given id
	 * 
	 * @return {@link ItemGroup}
	 */
	ItemGroup get(Integer id);
	
	/**
	 * Get item group by given name
	 * 
	 * @return {@link ItemGroup}
	 */
	ItemGroup get(String name);
	

	/**
	 * Get/count item groups with item amount.
	 * 
	 * @return list of {@link ItemGroupDto}
	 */
	// đề yêu cầu liệt kê mặt hàng tồn kho nên nếu được em nên
	// ghi tên hàm chi tiết ví dụ getExistingItems(...) còn phân loại theo group nên để trong ItemGroupService ok
	List<ItemGroupDto> getItemGroupDetails();
	
	/**
	 * Get/count item groups with top 3 about item amount.
	 * 
	 * @return list of {@link ItemGroupDto}
	 */
	// trong để a để là top 3 mặt hàng nhưng khi code không được để tên hàm như vậy --> hardcode
	// mà 3 đó là tham số truyền vào vs: getTopSalesItems(int year, int maxAmountOfItems)
	// kết quả đề yêu cầu trả về List<String> chứ ko phải dto
	List<ItemGroupDto> getItemGroupTop3ByYear(int year);
}
