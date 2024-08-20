package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistance.dto.ItemGroupAmountDTO;

public class ItemGroupServiceImpl implements ItemGroupService {
	
private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	@Override
		public List<ItemGroupAmountDTO> getAmountByItemGroup() {
			return itemGroupDao.getAmountByItemGroup();
		}
}
