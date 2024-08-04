package service;

import java.util.ArrayList;
import java.util.List;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	private ItemDao itemDao;
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroup> getAllWithItems() {
		List<ItemGroup> result = new ArrayList<ItemGroup>();
		List<Item> items = itemDao.getAll();
		
		for(Item item: items) {
			ItemGroup group = item.getGroup();
			ItemGroup existedGroup = get(result, group);
			if(existedGroup != null) {
				existedGroup.getItems().add(item);
			}else {
				group.getItems().add(item);
				result.add(group);
			}
		}
		return result;
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	
	private ItemGroup get(List<ItemGroup> groups, ItemGroup checkGroup) {
		return groups.stream().filter(group -> group.equals(checkGroup)).findFirst().orElse(null);
	}
	
}
