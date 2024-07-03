package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import static constants.DbConstants.*;

public class DbConnection {
	
	private static Connection connection;
	private static Properties dbProps;
	
	static {
		dbProps = DbProvider.getProperties();
	}
	
	private DbConnection() {
	}
	
	public static Connection getConnection() {
		if(connection == null) {
			try {
				connection = DriverManager.getConnection(
						dbProps.getProperty(DB_KEY_URL), 
						dbProps.getProperty(DB_KEY_USER), 
						dbProps.getProperty(DB_KEY_PASSWORD));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
