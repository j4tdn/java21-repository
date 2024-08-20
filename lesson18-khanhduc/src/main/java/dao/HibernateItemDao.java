package dao;

import static constant.QueryConstants.GET_ALL_ITEM_BY_TODAY;
import static constant.QueryConstants.GET_ALL_ITEM_DETAIL;
import static constant.QueryConstants.GET_TOP3_SELLING_ITEM_BY_YEAR;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.BigDecimalType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateType;
import org.hibernate.type.StringType;

import dto.ItemDetailDto;
import dto.ItemDto;
import dto.OrderItemDto;
import utils.GenericDao;

public class HibernateItemDao extends GenericDao implements ItemDao {
	
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderItemDto> getAllItemToday(LocalDate date) {
	    List<Object[]> results = openSession().createNativeQuery(GET_ALL_ITEM_BY_TODAY)
	            .addScalar(OrderItemDto.PROP_ITEM_ID, IntegerType.INSTANCE)
	            .addScalar(OrderItemDto.PROP_ITEM_NAME, StringType.INSTANCE)
	            .addScalar(OrderItemDto.PROP_ORDER_TIME, LocalDateType.INSTANCE)
	            .setParameter("date", date)
	            .getResultList();
	    
	    List<OrderItemDto> items = new ArrayList<>();
	    for (Object[] result : results) {
	        OrderItemDto dto = new OrderItemDto();
	        dto.setId((Integer) result[0]);
	        dto.setName((String) result[1]);
	        dto.setDate((LocalDate) result[2]);
	        items.add(dto);
	    }
	    
	    return items;
	}

	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemDetailDto> getAllItemDetail() {
		return openSession().createNativeQuery(GET_ALL_ITEM_DETAIL)
				.addScalar(ItemDetailDto.PROP_ITEM_ID, IntegerType.INSTANCE)
				.addScalar(ItemDetailDto.PROP_ITEM_NAME, StringType.INSTANCE)
				.addScalar(ItemDetailDto.PROP_BY_PRICE, BigDecimalType.INSTANCE)
				.addScalar(ItemDetailDto.PROP_COLOR, StringType.INSTANCE)
				.addScalar(ItemDetailDto.PROP_SALES_PRICE, BigDecimalType.INSTANCE)
				.addScalar(ItemDetailDto.PROP_ITEM_GROUP_ID, IntegerType.INSTANCE)
				.addScalar(ItemDetailDto.PROP_ITEM_GROUP_NAME, StringType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemDetailDto.class))
				.getResultList();
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public List<String> getTop3SellingItemsByYear(int year) {
	    return openSession()
	    		.createNativeQuery(GET_TOP3_SELLING_ITEM_BY_YEAR)
	            .addScalar(ItemDto.PROP_NAME, StringType.INSTANCE)
	            .setParameter("year", year)
	            .getResultList();
	}
}