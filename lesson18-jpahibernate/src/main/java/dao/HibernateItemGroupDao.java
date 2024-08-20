package dao;

import java.util.List;

import org.hibernate.type.StringType;

import dao.base.GenericDao;
import persistence.entity.ItemGroup;

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
		
		public List<ItemGroup> getAll() {
			return getElementsWithTransaction(GET_ALL_ITEM_GROUP, getEntityClass());
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
		
		private Class<ItemGroup> getEntityClass() {
			return ItemGroup.class;
		}
}
