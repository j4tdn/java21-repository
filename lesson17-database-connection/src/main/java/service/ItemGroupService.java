package service;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupService {
	
	/**
	 * Get all item groups.
	 * @return list {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
}
