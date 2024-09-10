package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import dao.base.GenericDao;
import persistence.dto.ItemDto;
import persistence.entities.Item;

public class HibernateItemDao extends GenericDao implements ItemDao {
	
	private static final String Q_Get_All = ""
			+ "SELECT * FROM t01_item";
	
	// Tên biến tất cả nên upper case nếu là final còn nếu để như e thì dùng camel case và ko có _
	// Logic sai, bán theo ngày khác với bán từ ngày nào ...
	// Phải get data từ table item, order và các table trung gian ...
	private static final String Get_Item_By_Created_Time = ""
			+ "select t1.C01_ITEM_ID"+ ItemDto.ITEM_ID +",\n"
			+ "		t1.C01_ITEM_NAME"+ ItemDto.ITEM_NAME +",\n"
			+ "        t9.C09_DATE_FROM"+ ItemDto.CREATED_TIME +"\n"
			+ "from t01_item t1 \r\n"
			+ "join t09_item_statistic t9 on t1.C01_ITEM_ID = t9.C09_ITEM_ID\r\n"
			+ "where t9.C09_DATE_FROM = :createTime ";
	@Override
	public List<Item> getAll() {
		return getElementsWithTransaction(Q_Get_All, Item.class);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ItemDto> getItemByCreatedTime(String createdTime) {
		return openSession().createNativeQuery(Get_Item_By_Created_Time)
							.setParameter("createTime", createdTime)
							.addScalar(ItemDto.ITEM_ID, IntegerType.INSTANCE)
							.addScalar(ItemDto.ITEM_NAME, StringType.INSTANCE)
							.addScalar(ItemDto.CREATED_TIME, StringType.INSTANCE)
							.setResultTransformer(Transformers.aliasToBean(ItemDto.class))
							.getResultList();
	}
	
}
