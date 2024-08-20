package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DbConnection;

public class GenericDao {
	
	private SessionFactory sessionFactory;
	
	public GenericDao() {
		sessionFactory = DbConnection.getSessionFactory();
	}
	
	public Session openSession() {
		return sessionFactory.openSession();
	}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}