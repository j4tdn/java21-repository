package service;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupService {

	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
	 * Get item group with given id
	 * 
	 * @param id id
	 * @return {@link ItemGroup}
	 */
	ItemGroup get(int id);
	
	/**
	 * Add new item group
	 * 
	 * @param group {@link ItemGroup}
	 */
	void save(ItemGroup group);
	
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
