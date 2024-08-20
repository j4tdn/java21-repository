package connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import constant.Constant;

public class DbConnection {

	private static SessionFactory sessionFactory = null;

	private DbConnection() {
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure(Constant.HIBERNATE_CONFIGURATION_PATH).buildSessionFactory();
		}
		return sessionFactory;
	}
}
