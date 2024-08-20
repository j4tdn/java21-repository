package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
	
	@SuppressWarnings("unchecked")
	protected <T> List<T> safeList(List<?> rawList) {
		return (List<T>)rawList;
	}
}
