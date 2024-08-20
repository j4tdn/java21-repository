package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.ItemGroupDAO;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDAO;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDAO itemGroupDAO;
	private ItemDao itemDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDAO = new JdbcItemGroupDAO();
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public void updateNGroups() {
		itemGroupDAO.updateNGroups();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDAO.getAll();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		return itemGroupDAO.getItemGroupDetails();
	}
	
	@Override
	public List<ItemGroup> getAllWithItems() {
		List<ItemGroup> result = new ArrayList<>();
		List<Item> items = itemDao.getAll();
		
		for(Item item : items) {
			ItemGroup group = item.getItemGroup();
			
			ItemGroup existedGroup = get(result, group);
			if(existedGroup != null) {
				existedGroup.getItems().add(item);
			} else {
				group.getItems().add(item);
				result.add(group);
			}
		}
		
		return result;
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDAO.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "group must be not null !!!");
		return itemGroupDAO.get(name);
	}

	@Override
	public void save(ItemGroup group) {
		Objects.requireNonNull(group, "group must be not null !!!");
		itemGroupDAO.save(group);
	}
	
	@Override
	public void save(List<ItemGroup> groups) {
		if(groups == null || groups.isEmpty()) {
			return;
		}
		itemGroupDAO.save(groups);
	}

	@Override
	public void update(ItemGroup group) {
		Objects.requireNonNull(group, "group must be not null !!!");
		itemGroupDAO.update(group);
	}
	
	@Override
	public void merge(ItemGroup group) {
		Objects.requireNonNull(group, "group must be not null !!!");
		if(group.getId() == null || get(group.getId()) == null) {
			save(group);
		} else {
			update(group);
		}
	}
	
	@Override
	public void mergeP(ItemGroup group) {
		Objects.requireNonNull(group, "group must be not null !!!");
		itemGroupDAO.mergeP(group);
	}
	
	private ItemGroup get(List<ItemGroup> groups, ItemGroup checkGroup) {
		return groups.stream().filter(group -> group.equals(checkGroup)).findFirst().orElse(null);
	}

}
