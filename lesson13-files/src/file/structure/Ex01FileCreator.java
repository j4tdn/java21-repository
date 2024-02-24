package file.structure;

import utils.FileUtils;

public class Ex01FileCreator {
	public static void main(String[] args) {
		// relative path: đường dẫn tương đối
		// absolute path: đường dẫn tuyệt đối 
		
		FileUtils.createNewFile("wdata/winvetory.txt");
		
		
		System.out.println("...Finished...");
	}

}
