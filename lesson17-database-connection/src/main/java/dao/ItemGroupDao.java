package dao;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupDao {
	
	/**
	 * Get all item groups.
	 * @return list {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	ItemGroup get(int id);

}
