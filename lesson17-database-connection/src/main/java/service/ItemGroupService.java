package service;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupService {
	
	/**
	 * Test jdbc transaction management
	 */
	void updateNGroups();
	
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
	 * Get item group with given id
	 * 
	 * @param id 
	 * @return {@link ItemGroup}
	 */
	ItemGroup get(int id);
	
	/**
	 * Get item group with given name
	 * 
	 * @param name 
	 * @return {@link ItemGroup}
	 */
	ItemGroup get(String name);
	
	/**
	 * Add new item group
	 * 
	 * @param itemGroup {@link ItemGroup}
	 */
	void save(ItemGroup itemGroup);
	
	void save(List<ItemGroup> groups);
	
	/**
	 * 
	 * @param itemGroup
	 */
	void update(ItemGroup itemGroup);
	
	void merge(ItemGroup itemGroup);
	
	void mergeP(ItemGroup itemGroup);
}
