package connection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import constants.DbConstants;

public class DbProvider {

	private DbProvider() {
	}
	
	public static Properties getProperties() {
		Properties props = new Properties();
		
		try {
			InputStream is = DbProvider.class.getClassLoader()
											 .getResourceAsStream(DbConstants.DB_CONFIG_PROPERTIES_PATH);
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
	
}
