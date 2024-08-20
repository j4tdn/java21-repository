package connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import common.L18Contants;

public class DbConnection {
private static SessionFactory sessionFactory = null;
	
	private DbConnection() {
	}
	
	public synchronized static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure(L18Contants.HIBERNATE_CONFIGURATION_PATH).buildSessionFactory();
		}
		return sessionFactory;
	}
}
