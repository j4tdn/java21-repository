package dao.base;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connection.DbConnection;

public class GenericDao {
		
	private SessionFactory sessionFactory;
	
	public GenericDao() {
		sessionFactory = DbConnection.getSessionFactory();
	}
	
	protected Session openSession() {
		return sessionFactory.openSession();
	}
	
	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	protected <T> List<T> getElementsWithTransaction(String sql, Class<T> entityClass) {
		List<T> elements = new ArrayList<>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction(); // open transaction
		try {
			elements = session.createNativeQuery(sql, entityClass).getResultList();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return elements;
	}
	
	protected List<?> getElementsWithTransaction(String sql) {
		List<?> elements = new ArrayList<>();
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction(); // open transaction
		try {
			elements = session.createNativeQuery(sql).getResultList();
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
		return elements;
	}
	
	@SuppressWarnings("unchecked")
	protected <T> List<T> safeList(List<?> rawList) {
		return (List<T>)rawList;
	}
}
