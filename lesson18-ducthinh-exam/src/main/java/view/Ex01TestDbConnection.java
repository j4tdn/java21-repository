package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DbConnection;

public class Ex01TestDbConnection {
	
	// JPA
	// entityManager.unwrap(Session.class);
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = DbConnection.getSessionFactory();
		System.out.println("sessionFactory --> " + sessionFactory);
		
		// openSession --> multiple thread
		// add/delete/remove: require transaction
		// get: optional
		Session session1 = sessionFactory.openSession();
		Session session2 = sessionFactory.openSession();
		System.out.println("session1 --> " + session1);
		System.out.println("session2 --> " + session2);
		
		System.out.println("\n========================\n");
		
		// getCurrentSession --> single thread
		// add/delete/remove: require transaction
		// get: require
		Session session3 = sessionFactory.getCurrentSession();
		Session session4 = sessionFactory.getCurrentSession();
		System.out.println("session3 --> " + session3);
		System.out.println("session4 --> " + session4);
		
		
	}
}
