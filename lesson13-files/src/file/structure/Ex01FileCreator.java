package file.structure;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreator {

	public static void main(String[] args) {
		// relative path: đường dẫn tương đối
		// --> data/draft.txt --> .../lesson13-files/data/draft.txt
		
		// absolute path: đường dẫn tuyệt đối
		// C:/hello/data/draft.txt
		File file = new File("data/draft.txt");
		
		if(!file.exists()) {
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("File '" + file.getName() + "' i created successful ?" + isSuccess);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("...Finshed...");
	}
	
}
