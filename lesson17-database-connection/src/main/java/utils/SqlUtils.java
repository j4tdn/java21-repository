package utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Objects;

import org.apache.commons.codec.digest.DigestUtils;

public class SqlUtils {
	
	private SqlUtils() {
		
	}
	
	public static void rollback(Connection connection) {
		try {
			connection.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(AutoCloseable ... objectsNeedToBeClosed) {
		for (AutoCloseable objectNeedToBeClosed : objectsNeedToBeClosed) {
			try {
				objectNeedToBeClosed.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String md5(String password) {
		Objects.requireNonNull(password);
		return DigestUtils.md5Hex(password);
	}
}
