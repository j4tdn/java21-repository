package connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import common.BaitapConstants;

public class DbConnection {

	private static SessionFactory sessionFactory = null;
	
	public DbConnection() {
	}
	
	public synchronized static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure(BaitapConstants.HIBERNATE_CONFIGURATION_PATH).buildSessionFactory();
		}
		return sessionFactory;
	}
	
}
