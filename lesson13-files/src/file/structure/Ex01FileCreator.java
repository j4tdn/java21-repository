package file.structure;
import java.io.File;
import java.io.IOException;

import utils.FileUtils;
public class Ex01FileCreator {

	public static void main(String[] args) {
		// relative path: đường dẫn tương đối
		// -->
		
		// absolute path: đường dẫn tuyệt đối
		File file = new File("data/draft.txt"); 
		
		FileUtils.createNewFile("data/draft.txt");
		
		System.out.println("---finished---");
	}
}
