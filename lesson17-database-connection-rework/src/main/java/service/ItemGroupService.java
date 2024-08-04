package service;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupService {
	
	/**
	 * Get all item groups
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
	 * Get all item groups with items
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAllWithItems();
	
	/**
	 * Get all item groups with items
	 * 
	 * @return list of {@link ItemGroup}
	 */
	ItemGroup get(int id);
}
