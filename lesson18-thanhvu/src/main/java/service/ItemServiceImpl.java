package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.dto.ItemDto;
import persistence.dto.ItemGroupDto;
import persistence.dto.ItemStatisticDto;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public List<ItemDto> getItemsBySalesDate(LocalDate salesDate) {
		return itemDao.getItemsBySalesDate(salesDate);
	}
	
	@Override
	public List<ItemStatisticDto> getItemsInWarehouse() {
		return itemDao.getItemsInWarehouse();
	}
	
	@Override
	public List<String> getTop3ItemSaleByYear(int year) {
		return itemDao.getTop3ItemSaleByYear(year);
	}
	
	@Override
	public List<ItemGroupDto> getItemsOfItemGroup() {
		return itemDao.getItemsOfItemGroup();
	}
	
}