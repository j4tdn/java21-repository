package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistance.dto.ItemGroupAmountDTO;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao {
	
	private static final String Q_GET_AMOUNT_BY_ITEM_GROUP = "SELECT itg.C02_ITEM_GROUP_ID " + ItemGroupAmountDTO.PROP_ID + ",\r\n"
			+ "	   itg.C02_ITEM_GROUP_NAME " +ItemGroupAmountDTO.PROP_ITEM_GROUP_NAME+ ",\r\n"
			+ "       SUM(itd.C12_AMOUNT) " +ItemGroupAmountDTO.PROP_AMOUNT+ "\r\n"
			+ "FROM t12_item_detail itd\r\n"
			+ "JOIN t01_item it ON itd.C12_ITEM_ID = it.C01_ITEM_ID\r\n"
			+ "JOIN t02_item_group itg ON itg.C02_ITEM_GROUP_ID = it.C01_ITEM_GROUP_ID\r\n"
			+ "GROUP BY  itg.C02_ITEM_GROUP_ID,\r\n"
			+ "		  itg.C02_ITEM_GROUP_NAME";
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupAmountDTO> getAmountByItemGroup() {
		return safeList(openSession().createNativeQuery(Q_GET_AMOUNT_BY_ITEM_GROUP)
				.addScalar(ItemGroupAmountDTO.PROP_ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupAmountDTO.PROP_ITEM_GROUP_NAME, StringType.INSTANCE)
				.addScalar(ItemGroupAmountDTO.PROP_AMOUNT, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupAmountDTO.class))
				.getResultList());
	}
}
