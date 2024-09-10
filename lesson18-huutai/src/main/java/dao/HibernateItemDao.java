package dao;

import java.time.LocalDate;
import java.util.List;

import dao.base.GenericDao;
import persistence.entities.Item;
import utils.DateUtils;

public class HibernateItemDao extends GenericDao implements ItemDao {

	// logic sai
	// item sẽ được bán theo đơn hàng nên điều kiện e phải lấy từ table order hoặc item_staticstis mới đúng nha
	private static final String GET_ITEMS_BY_CREATED_TIME = ""
			+ "SELECT * FROM t01_item\n"
			+ "WHERE cast(C01_ITEM_CREATED_TIME AS DATE) = :time"
			+ "ORDER BY C01_ITEM_ID ASC";
			
	
	@Override
	public List<Item> getItemByCreatedTime(LocalDate created_time) {
		return openSession().createNativeQuery(GET_ITEMS_BY_CREATED_TIME, Item.class)
				// e có thể dung trực tiếp LocalDate rồi dùng LocalDateType.INSTANCE ko cần phải chuyển sang sql date
				.setParameter("time", DateUtils.toSqlDate(created_time))
				.getResultList();
	}

}
