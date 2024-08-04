package service;

import java.util.List;

import persistence.entities.ItemGroup;

public interface ItemGroupService {

	
	/**
	 * Get all item groups.
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
}
