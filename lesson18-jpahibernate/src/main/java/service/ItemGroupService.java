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
	 * Get/count item groups with item amount.
	 * 
	 * @return list of {@link ItemGroupDto}
	 */
	List<ItemGroupDto> getItemGroupDetails();
	
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
