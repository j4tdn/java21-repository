package file.structure;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	
	public static void main(String[] args) {
		
		// relative path: đường dẫn tương đối
		// --> data/draft.txt --> .../lesson13-files/data/draft.txt
		
		
		// absolute path: đường dẫn tuyệt đối
		// C:/hello/data/draft.txt
		FileUtils.createNewFile("wdata.winventory.txt");
		
		
		System.out.println("... Finished ...");
	}
}
