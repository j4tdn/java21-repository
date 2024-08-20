package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import dto.ItemgroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	@Override
	public List<ItemgroupDto> getItemGroupInventory() {
		return itemGroupDao.getItemGroupInventory();
	}
}