package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	
	/*
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
	 * Get/count item groups with item amount
	 * 
	 * @return list of {@link ItemGroupDto}
	 */
	List<ItemGroupDto> getItemGroupDetails();
	
	/**
	 * Get all item groups with items
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAllWithItems();
	
	/**
	 * get item group with given id
	 * 
	 * @param id
	 * @return
	 */
	ItemGroup get(int id);
	
	/**
	 * get item group with given name
	 * 
	 * @param name
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
	 * @param group list of {@link ItemGroup}
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
