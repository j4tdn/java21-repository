package connection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import constants.DbContants;

public class DbProvider {

	private DbProvider() {
	}

	public static Properties getProperties() {
		Properties props = new Properties();

		try {
			// Đọc từ đường dẫn tuyệt đối của dự án
			// FileReader fr = new FileReader(new File(DbContants.DB_CONFIG_PROPERTIES_PATH));
			
			// moved file vào target(run)
			InputStream is = DbProvider.class.getClassLoader()
					.getResourceAsStream(DbContants.DB_CONFIG_PROPERTIES_PATH);
			
			props.load(is);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
}
