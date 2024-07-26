package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {

	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
	 * Get all item groups with items.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAllWithItems();
	
	/**
	 * Get/count item groups with item amount.
	 * 
	 * @return list of {@link ItemGroupDto}
	 */
	List<ItemGroupDto> getItemGroupDetails();
	
	/**
	 * Get item group with given id
	 * 
	 * @param id id
	 * @return {@link ItemGroup}
	 */
	ItemGroup get(int id);
	
	/**
	 * Get item group with given name
	 * 
	 * @param name name
	 * @return {@link ItemGroup}
	 */
	ItemGroup get(String name);
	
	/**
	 * Add new item group
	 * 
	 * @param group {@link ItemGroup}
	 */
	void save(ItemGroup group);
	
	/**
	 * Add new item groups
	 * 
	 * @param groups list of {@link ItemGroup}
	 */
	void save(List<ItemGroup> groups);
	
	/**
	 * Update item group
	 * 
	 * @param group {@link ItemGroup}
	 */
	void update(ItemGroup group);
	
	/**
	 * Merge item group
	 * 
	 * @param group {@link ItemGroup}
	 */
	void merge(ItemGroup group);
	
	/**
	 * Merge item group with procedure
	 * 
	 * @param group {@link ItemGroup}
	 */
	void mergeP(ItemGroup group);
	
}
