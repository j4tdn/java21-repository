package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import static constants.DbConstants.*;

public class DbConnection {

	private static Connection connection;
	private static Properties dbProps;
	
	static {
		dbProps = DbProvider.getProperties();
	}
	
	public static Connection getConnection() {
		
		if(connection == null) {
			
			try {
				connection = DriverManager.getConnection(
						dbProps.getProperty(DB_KEY_URL),
						dbProps.getProperty(DB_KEY_USER),
						dbProps.getProperty(DB_KEY_PASSWORD)
						);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return connection;
	}
	
}
