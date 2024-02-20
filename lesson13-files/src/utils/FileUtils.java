package utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class FileUtils {

	public FileUtils() {
	}
	
	public static void open(File f) {
		try {
			
			Desktop.getDesktop().open(f);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static File createNewFile(String path) {

		File f = new File(path);

		if (f.exists()) {
			System.out.println(">>> File '" + path + "is existed");
		}

		else {
			createNewDir(f.getParent());
			try {

				boolean isSuccess = f.createNewFile(); // tao file
				System.out.println("File '" + f.getName() + "' is created successful ? " + isSuccess);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return f;
	}

	public static File createNewDir(String path) {

		File root = new File(path);
		if (!root.exists()) {
			root.mkdirs(); // tao folder
		}
		return root;

	}

}
