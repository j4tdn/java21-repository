package service;

import java.util.List;
import java.util.Objects;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistance.dto.ItemOrderDTO;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public List<ItemOrderDTO> getItemSoldByDate(String date) {
		Objects.requireNonNull(date, "Date can be not null");
		return itemDao.getItemSoldByDate(date);
	}
	
	@Override
	public List<String> getItemSaleTopThreeByYear(Integer year) {
		return itemDao.getItemSaleTopThreeByYear(year);
	}
}
