package dao;

import java.util.List;

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
	
	// ok
	private static final String GET_ITEM_GROUP_DETAILS = ""
			+"select t2.C02_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "	   t2.C02_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME + ",\n"
			+ "       sum(t12.C12_AMOUNT) "+ ItemGroupDto.PROP_AMOUNT_OF_ITEMS +"\n"
			+ "from t01_item t1 \n"
			+ "join t02_item_group t2 on t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID\r\n"
			+ "join t12_item_detail t12 on t1.C01_ITEM_ID = t12.C12_ITEM_ID\r\n"
			+ "group by t2.C02_ITEM_GROUP_NAME";
	private static final String GET_ALL_ITEM_GROUP = ""
			+ "SELECT * FROM t02_item_group";
	
	
	// Hình như e hiểu sai đề rồi
	// Bảng thống kê nào là lưu data theo kiểu date_from đến date_util e ko thể so sánh như này được
	// 1 là dùng data từ bảng order, 2 là nếu dùng trong này thì phải YEAR(t9.C09_DATE_FROM) <= :year <= YEAR(t9.C09_DATE_UNTIL)
	private static final String GET_ITEM_GROUP_TOP3_BY_YEAR = ""
			+ "select t2.C02_ITEM_GROUP_ID " + ItemGroupDto.PROP_ID + ",\n"
			+ "		t2.C02_ITEM_GROUP_NAME " + ItemGroupDto.PROP_NAME + ",\n"
			+ "        t9.C09_SALES_AMOUNT " + ItemGroupDto.PROP_AMOUNT_OF_ITEMS + "\n"
			+ "from t01_item t1\r\n"
			+ "join t02_item_group t2 on t1.C01_ITEM_GROUP_ID = t2.C02_ITEM_GROUP_ID\r\n"
			+ "join t09_item_statistic t9 on t9.C09_ITEM_ID = t1.C01_ITEM_ID\r\n"
			+ "where YEAR(t9.C09_DATE_UNTIL) = :year "
			+ "ORDER BY t9.C09_SALES_AMOUNT DESC "
			+ "LIMIT 3";
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
	
	public List<ItemGroup> getAll() {
		return getElementsWithTransaction(GET_ALL_ITEM_GROUP, getEntityClass());
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		return openSession().createNativeQuery(GET_ITEM_GROUP_DETAILS)
							.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE)
							.addScalar(ItemGroupDto.PROP_NAME, StringType.INSTANCE)
							.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, IntegerType.INSTANCE)
							.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class))
							.getResultList();
	}
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
	
	
	@Override
	public List<ItemGroupDto> getItemGroupTop3ByYear(int year) {
		return openSession().createNativeQuery(GET_ITEM_GROUP_TOP3_BY_YEAR)
				.setParameter("year", year)
				.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_NAME, StringType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_AMOUNT_OF_ITEMS, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class))
				.getResultList();
	}
	private Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}
	
	

}
