package service;

import java.util.List;
import java.util.Objects;

import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	
	@Override
	public void save(ItemGroup group) {
		Objects.requireNonNull(group, "group must not be null !!!");
		itemGroupDao.save(group);
	}
	
	@Override
	public void update(ItemGroup group) {
		Objects.requireNonNull(group, "group must not be null !!!");
		itemGroupDao.update(group);
	}
	
	@Override
	public void merge(ItemGroup group) {
		Objects.requireNonNull(group, "group must not be null !!!");
		var groupId = group.getId();
		if (groupId == null || get(group.getId()) == null) {
			save(group);
		} else {
			update(group);
		}
	}
	
	@Override
	public void mergeP(ItemGroup group) {
		Objects.requireNonNull(group, "group must not be null !!!");
		itemGroupDao.mergeP(group);
	}
}
