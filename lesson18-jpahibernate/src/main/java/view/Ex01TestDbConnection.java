package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DbConnection;

public class Ex01TestDbConnection {
	
	public static void main(String[] args) {
		SessionFactory sessionFactory = DbConnection.getSessionFactory();
		System.out.println("sessionFactory --> " + sessionFactory);
		
		Session session = sessionFactory.openSession();
		System.out.println("session --> " + session);
	}
}
