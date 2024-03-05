package file.serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Dish;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileOs {

	public static void main(String[] args)  {
		
		File f = FileUtils.createNewFile("data/serialize.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		//Thực hiện ghi file
		try {
			 fos = new FileOutputStream(f);
			 oos = new ObjectOutputStream(fos);
			
			List<Dish> menu = DataModel.mockDishes();
			
			// ghi file
			oos.writeObject(menu);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			FileUtils.close(oos,fos);
		}
		
		// open file
		FileUtils.open(f);
		
	}
	
}
