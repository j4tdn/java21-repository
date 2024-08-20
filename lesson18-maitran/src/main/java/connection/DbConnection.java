package connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DbConnection {
	
	private DbConnection() {
	}
	
	public static final String HIBERNATE_CONFIGURATION_PATH = "hibernate.cfg.xml";
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure(HIBERNATE_CONFIGURATION_PATH).buildSessionFactory();
		}
		return sessionFactory;
	}
	
}