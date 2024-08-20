package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.entities.Item;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	@Override
	public List<Item> getItemByCreatedTime(LocalDate created_time) {
		return itemDao.getItemByCreatedTime(created_time);
	}

}
