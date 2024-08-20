package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.HibernateItemDao;
import dao.ItemDao;
import dto.ItemDetailDto;
import dto.OrderItemDto;
import entity.Item;

public class ItemServiceImpl implements ItemService{
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public List<OrderItemDto> getAllItemToday(LocalDate date) {
		Objects.requireNonNull(date, "Date can not be null");
		return itemDao.getAllItemToday(date);
	}

	@Override
	public List<String> getTop3SellingItemsByYear(int year) {
		Objects.requireNonNull(year, "Year can not be null");
		return itemDao.getTop3SellingItemsByYear(year);
	}
	
	@Override
	public List<ItemDetailDto> getAllItemDetail() {
		return itemDao.getAllItemDetail();
	}
}