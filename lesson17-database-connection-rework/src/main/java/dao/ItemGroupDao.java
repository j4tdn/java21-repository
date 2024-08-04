package dao;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupDao {
	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
	 * Get itemGroup by Id.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	ItemGroup get(int id);
	
	
}

