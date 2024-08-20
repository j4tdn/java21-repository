package service;

import java.util.List;
import java.util.Objects;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		return itemGroupDao.getItemGroupDetails();
	}
	
	@Override
	public ItemGroup get(Integer id) {
		Objects.requireNonNull(id);
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name);
		return itemGroupDao.get(name);
	}
	
	
	
}