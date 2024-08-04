package utils;

import java.util.Objects;

import org.apache.commons.codec.digest.DigestUtils;

public class SqlUtils {

	private SqlUtils() {
	}

	public static void close(AutoCloseable... objectsNeedToBeClosed) {
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