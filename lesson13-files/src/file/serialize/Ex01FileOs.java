package file.serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Dish;
import model.Datamodel;
import utils.FileUtils;

public class Ex01FileOs {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		File file = FileUtils.createNewFile("data/serialize.txt");
		
		// Thực hiện ghi file
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			List<Dish> menu = Datamodel.getDishes();
			
			// ghi file
			oos.writeObject(menu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			FileUtils.close(oos, fos);
		}
		
		// open file
		FileUtils.open(file);
	}
}
