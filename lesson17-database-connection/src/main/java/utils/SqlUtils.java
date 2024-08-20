package utils;

public class SqlUtils {
	
	private SqlUtils() {
	}
	
	public static void close(AutoCloseable ... objectsNeedToBeClosed) {
		for (AutoCloseable objectNeedToBeClosed: objectsNeedToBeClosed) {
			try {
				objectNeedToBeClosed.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
