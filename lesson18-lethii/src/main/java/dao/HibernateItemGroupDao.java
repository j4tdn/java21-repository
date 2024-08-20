package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;

import dao.base.GenericDao;
import persistence.dto.ItemGroupDto;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao{
	private static final String Q_GET_ITEM_GROUP_DETAILS = ""
			+ "SELECT ig.ID " + ItemGroupDto.PROP_IG_ID + ",\n "
			+ "		  ig.NAME " + ItemGroupDto.PROP_IG_NAME + ", \n"
			+ "		  sum(itd.AMOUNT) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + "\n"
			+ "  FROM item it\n"
			+ "  JOIN item_group ig\n"
			+ "    ON ig.ID = it.ITEM_GROUP_ID\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON it.ID = itd.ITEM_ID\n"
			+ " GROUP BY ig.ID;";
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		NativeQuery<?> query = openSession()
				.createNativeQuery(Q_GET_ITEM_GROUP_DETAILS);
		query.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
			.addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
			.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, LongType.INSTANCE)
			.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		
		return (List<ItemGroupDto>)query.getResultList();
	}

}