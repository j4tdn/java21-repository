package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	private ItemDao itemDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public void updateNGroups() {
		itemGroupDao.updateNGroups();
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroup> getAllWithItems() {
		List<ItemGroup> result = new ArrayList<>();
		
		List<Item> items = itemDao.getAll(); // item(itemGroup)
		
		for (Item item: items) {
			ItemGroup group = item.getGroup();
			
			ItemGroup existedGroup = get(result, group);
			if (existedGroup != null) {
				existedGroup.getItems().add(item);
			} else {
				group.getItems().add(item);
				result.add(group);
			}
		}
		
		return result;
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		return itemGroupDao.getItemGroupDetails();
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "name must not be null !!!");
		return itemGroupDao.get(name);
	}
	
	@Override
	public void save(ItemGroup group) {
		Objects.requireNonNull(group, "group must not be null !!!");
		itemGroupDao.save(group);
	}
	
	@Override
	public void save(List<ItemGroup> groups) {
		if (groups == null || groups.isEmpty()) {
			return;
		}
		itemGroupDao.save(groups);
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
	
	private ItemGroup get(List<ItemGroup> groups, ItemGroup checkGroup) {
		return groups.stream().filter(group -> group.equals(checkGroup)).findFirst().orElse(null);
	}
}
