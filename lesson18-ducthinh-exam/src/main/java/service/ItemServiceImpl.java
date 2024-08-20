package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.dto.ItemDto;
import persistence.entities.Item;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public List<Item> getAll() {
		
		return itemDao.getAll();
	}
	
	public List<ItemDto> getItemByCreatedTime(String createdTime) {
		return itemDao.getItemByCreatedTime(createdTime);
	}
}
