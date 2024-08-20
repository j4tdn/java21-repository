package dao;

import java.util.List;

import persistence.entity.ItemGroup;

public interface ItemGroupDao {
	
	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
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
