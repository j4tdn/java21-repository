package dao;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupDao {
	
	/**
	 * Get all item groups
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
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
