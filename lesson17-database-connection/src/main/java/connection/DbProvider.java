package connection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import constants.DbConstants;

public class DbProvider {
	
	private DbProvider() {
		
	}
	
	public static Properties getProperities() {
		Properties props = new Properties();
		
		FileReader fr;
		try {
			// Đọc từ đường dẫn tuyệt đối của dự án
			// fr = new FileReader(new File(DbConstants.DB_CONFIG_PROPERITIES_PATH));
			
			// moved file vào target(run)
			// đọc từ target --> DbProvider.class.getClassLoader()
			InputStream is = DbProvider.class.getClassLoader()
					.getResourceAsStream(DbConstants.DB_CONFIG_PROPERITIES_PATH);
			
			props.load(is);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return props;
		
	}

}
