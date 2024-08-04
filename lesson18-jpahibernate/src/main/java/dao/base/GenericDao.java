package dao.base;

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

}
