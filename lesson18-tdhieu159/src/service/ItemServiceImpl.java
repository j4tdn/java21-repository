package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import dto.ItemDto;
import persistence.item;

public class ItemServiceImpl implements ItemService{
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	public List<ItemDto> get() {
		// TODO Auto-generated method stub
		return itemDao.get();
	}

	@Override
	public List<item> getAllItem() {
		// TODO Auto-generated method stub
		return itemDao.getAllItem();
	}

	@Override
	public List<String> getNameItems() {
		// TODO Auto-generated method stub
		return itemDao.getNameItems();
	}
	
}