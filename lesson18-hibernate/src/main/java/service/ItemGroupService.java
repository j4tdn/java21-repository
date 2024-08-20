package service;

import java.util.List;

import dto.ItemGroupDto;
import entity.ItemGroup;

public interface ItemGroupService {
	
	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
	 * Get/count item groups with item amount.
	 * 
	 * @return list of {@link ItemGroupDto}
	 */
	List<ItemGroupDto> getItemGroupDetails();
	
	
	List<ItemGroupDto> countItemsByItemGroup();
	
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
	
}
