package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupDao {
	
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
	 * Get count item groups with item amount
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroupDto> getItemGroupDetails();
	
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
	
	/**
	 * Add new item groups
	 * 
	 * @param group list of {@link ItemGroup}
	 */
	void save(List<ItemGroup> groups);
	
	void update(ItemGroup itemGroup);
	
	void mergeP(ItemGroup itemGroup);
	
}
