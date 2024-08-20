package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;

import dao.base.GenericDao;
import persistence.dto.ItemGroupDto;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao {

	private static final String COUNT_AMOUNT_OF_ITEMS = ""
			+ "WITH CTE AS (\n"
			+ "	SELECT t1.C01_ITEM_GROUP_ID idc , t12.C12_AMOUNT amount\n"
			+ "    FROM t12_item_detail t12\n"
			+ "    JOIN t01_item t1\n"
			+ "    ON t12.C12_ITEM_ID = t1.C01_ITEM_ID\n"
			+ "    GROUP BY t1.C01_ITEM_ID\n"
			+ ")\n"
			+ "SELECT t2.C02_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "	   t2.C02_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME + ",\n"
			+ "       CTE.amount " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + "\n"
			+ "  FROM t02_item_group t2\n"
			+ "  JOIN CTE\n"
			+ "  ON CTE.idc = t2.C02_ITEM_GROUP_ID"
			+ "  GROUP BY t2.C02_ITEM_GROUP_ID";
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> countAmountOfItems() {
		return safeList(openSession().createNativeQuery(COUNT_AMOUNT_OF_ITEMS)
				.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE) // getInt(PROP_ID)
				.addScalar(ItemGroupDto.PROP_NAME, org.hibernate.type.StringType.INSTANCE) // getString(PROP_NAME)
				.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class)) // set(PROP_ID) = getInt(PROP_ID) ...
				.getResultList());
	}

}
