package utils;

public class SqlUtils {
	
	private SqlUtils() {
	}
	
	public static void close(AutoCloseable ...objectsNeedToBeClose) {
		for(AutoCloseable objectNeedToBeClosed : objectsNeedToBeClose) {
			try {
				objectNeedToBeClosed.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
