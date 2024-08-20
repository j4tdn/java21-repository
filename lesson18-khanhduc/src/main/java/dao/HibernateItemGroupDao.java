package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import dto.ItemgroupDto;
import utils.GenericDao;
import static constant.QueryConstants.*;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao {
		

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ItemgroupDto> getItemGroupInventory() {
		return openSession()
				.createNativeQuery(GET_ALL_ITEM_GROUP_INVENTORY)
				.addScalar(ItemgroupDto.PROP_ID)
				.addScalar(ItemgroupDto.PROP_NAME)
				.addScalar(ItemgroupDto.PROP_AMOUNT_OF_ITEMS)
				.setResultTransformer(Transformers.aliasToBean(ItemgroupDto.class))
				.getResultList();
	}
}