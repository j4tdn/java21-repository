package utils;

public class FileUtils {
	
	public static void close(AutoCloseable... autoCloseables ) {
		for(AutoCloseable autoCloseable : autoCloseables) {
			if(autoCloseable != null) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
