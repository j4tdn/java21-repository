package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DbConnection;

public class Ex01TestDbConnection {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = DbConnection.getSessionFactory();
		System.out.println("sessionFactory --> " + sessionFactory);
		
		// openSession() dùng cho đa luồng
		// add/delete/remove: require transaction
		// get : optional
		Session session = sessionFactory.openSession();
		Session session2 = sessionFactory.openSession();
		System.out.println("session --> " + session);
		System.out.println("session2 --> " + session2);
		
		System.out.println("================================");
		
		// getCurrentSesssion --> single thread
		// add/delete/update: require transaction
		// get: require
		Session session3 = sessionFactory.getCurrentSession();
		Session session4 = sessionFactory.getCurrentSession();
		System.out.println("session3 --> " + session3);
		System.out.println("session4 --> " + session4);
	}
	
}
