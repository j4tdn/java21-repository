package connection;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants.DbConstants;

public class DbProvider {

	private DbProvider() {
	}
	public static Properties getProperties() {
		Properties props = new Properties();
		
		try {
			FileReader fr = new FileReader(new File(DbConstants.DB_CONFIG_PROPERTIES_PATH));
			props.load(fr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
		
	}
	
}
