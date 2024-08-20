package dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import dao.base.GenericDao;
import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public class HibernateItemGroupDao extends GenericDao implements ItemGroupDao {

	// NativeQuery       ==> Native SQL
	// ==> Sử dụng cú pháp SQL quen thuộc đã học trong từng ngôn ngữ

	// Query, TypedQuery ==> JPQL/HQL
	// Yêu cầu: Phải/Chỉ dùng được/với EntityClass/Attribute name thay vì table/column name
	//        : Chỉ hoạt động với Entity, Table nào dc mapping rồi mới dc sử dụng
	// Thuận lợi: Hoạt động tốt khi dự án 1 lúc tương tác với nhiều loại database
	// Hạn chế: Ko phải 100% các tính năng trong từng hệ quản trị sẽ dc mapping vào JPQL/HQL
	
	// NamedNativeQuery  ==> Native SQL via Name/Key
	// NamedQuery        ==> JPQL/HQL via Name/Key
	// ==> Khai báo câu truy vấn có "NAME" đại diện cho câu truy vấn đó
	//     Thay vì thực gọi câu truy vấn trực tiếp giờ gọi "NAME"
	// Yêu cầu: Phải khai báo NAME tại Entity
	//        : Entity nào chưa những câu truy vấn riêng ở đó, giảm tải cho DAO
	
	// CirteriaQuery     ==> Java
	
	private static final String GET_ALL_ITEM_GROUP = ""
			+ "SELECT * FROM t02_item_group";
	
	/*
	--> Native
	private static final String GET_ALL_ITEM_GROUP = ""
			+ "SELECT * FROM t02_item_group";
	*/
	
	/*
	--> JPQL/HQL
	private static final String GET_ALL_ITEM_GROUP = ""
			+ "SELECT igp FROM ItemGroup igp";
	*/
	
	/*
	--> Native
	public List<ItemGroup> getAll() {
		return openSession()
					.createNativeQuery(GET_ALL_ITEM_GROUP, getEntityClass())
					.getResultList();
	}
	*/
	
	/*
	--> JPQL/HQL
	public List<ItemGroup> getAll() {
		return openSession()
					.createQuery(GET_ALL_ITEM_GROUP, getEntityClass())
					.getResultList();
	}
	*/
	
	/*
	--> NamedQuery
	public List<ItemGroup> getAll() {
		return openSession()
					.createNamedQuery(ItemGroup.GET_ALL_ITEM_GROUP, ItemGroup.class)
					.getResultList();
	}
	*/
	
	private static final String GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT *\n"
			+ "  FROM t02_item_group\n"
			+ " WHERE C02_ITEM_GROUP_NAME = :pname";
	
	private static final String GET_ITEM_GROUP_DETAILS = ""
			+ "SELECT t2.C02_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "       t2.C02_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME + ",\n"
			+ "       sum(t12.C12_AMOUNT) " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + ",\n"
			+ "       GROUP_CONCAT(concat(t1.C01_ITEM_NAME,'-',t6.C06_SIZE_NAME,'-',t12.C12_AMOUNT)) " + ItemGroupDto.PROP_ITEM_DETAILS + "\n"
			+ "  FROM t02_item_group t2\n"
			+ "  JOIN t01_item t1 ON t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID\n"
			+ "  JOIN t12_item_detail t12 ON t12.C12_ITEM_ID = t1.C01_ITEM_ID\n"
			+ "  JOIN t06_size t6 ON t12.C12_SIZE_ID = t6.C06_SIZE_ID\n"
			+ "  GROUP BY t2.C02_ITEM_GROUP_ID,\n"
			+ "           t2.C02_ITEM_GROUP_NAME";
	
	public List<ItemGroup> getAll() {
		return getElementsWithTransaction(GET_ALL_ITEM_GROUP, getEntityClass());
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		return safeList(openSession().createNativeQuery(GET_ITEM_GROUP_DETAILS)
					.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE) // getInt(PROP_ID)
					.addScalar(ItemGroupDto.PROP_NAME, StringType.INSTANCE) // getString(PROP_NAME)
					.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, IntegerType.INSTANCE)
					.addScalar(ItemGroupDto.PROP_ITEM_DETAILS, StringType.INSTANCE)
					.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class)) // set(PROP_ID) = getInt(PROP_ID) ...
					.getResultList());
	}
	
//	@Override
//	public List<ItemGroupDto> getItemGroupDetails() {
//		List<ItemGroupDto> result = new ArrayList<>();
//		
//		// List<Object[]>
//		// Mỗi dòng lấy về từ câu truy vấn sẽ là Object[]
//		List<Object[]> rawList = (List<Object[]>)getElementsWithTransaction(GET_ITEM_GROUP_DETAILS);
//		
//		for (var rawObject: rawList) {
//			ItemGroupDto groupDto = new ItemGroupDto(
//					(Integer)(rawObject[0]),
//					(String)(rawObject[1]), 
//					Integer.parseInt(String.valueOf(rawObject[2])),
//					(String)(rawObject[3])
//			);
//			result.add(groupDto);
//		}
//		
//		return result;
//	}
	
	@Override
	public ItemGroup get(Integer id) {
		return openSession().get(getEntityClass(), id);
	}
	
	@Override
	public ItemGroup get(String name) {
		return openSession().createNativeQuery(GET_ITEM_GROUP_BY_NAME, getEntityClass())
				.setParameter("pname", name, StringType.INSTANCE)
				.uniqueResult();
		
		/*
		 + getSingleResult
		 Exception in thread "main" javax.persistence.NoResultException: No entity found for query
		   at org.hibernate.query.internal.AbstractProducedQuery.getSingleResult(AbstractProducedQuery.java:1667)
		 
		 + uniqueResult
		 Return null if entity not found  
		 
		 
		 */
	}
	
	private Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}

}