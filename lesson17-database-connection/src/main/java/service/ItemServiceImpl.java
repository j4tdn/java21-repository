package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}
	
	@Override
	public List<Item> getItemsBySalesDate(LocalDate salesDate) {
		Objects.requireNonNull(salesDate);
		return itemDao.getItemsBySalesDate(salesDate);
	}
	
}