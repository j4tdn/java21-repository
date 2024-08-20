package dao;

import java.util.List;

import dto.ItemGroupDto;
import entity.ItemGroup;

public interface ItemGroupDao {
	
	void save(ItemGroup group);
	
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
	 * 
	 * @return
	 */
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