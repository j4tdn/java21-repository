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
		List<Item> items = itemDao.getAll();

		for (Item item : items) {
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
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}

	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "Item group must be not null");
		return itemGroupDao.get(name);
	}

	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "Item group must be not null");
		itemGroupDao.save(itemGroup);
	}

	@Override
	public void save(List<ItemGroup> groups) {
		if (groups == null || groups.isEmpty()) {
			return;
		}
		itemGroupDao.save(groups);
	}

	@Override
	public void update(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "Item group must be not null");
		itemGroupDao.update(itemGroup);
	}

	@Override
	public void merge(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "Item group must be not null");
		var groupId = itemGroup.getId();
		if (groupId == null || get(itemGroup.getId()) == null) {
			save(itemGroup);
		} else {
			update(itemGroup);
		}
	}

	@Override
	public void mergeP(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "Item group must be not null");
		itemGroupDao.mergeP(itemGroup);
	}

	private ItemGroup get(List<ItemGroup> groups, ItemGroup checkGroup) {
		return groups.stream().filter(group -> group.equals(checkGroup)).findFirst().orElse(null);
	}

}
