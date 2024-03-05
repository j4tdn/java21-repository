package file.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import bean.Dish;
import utils.FileUtils;

public class Ex01FileIs {

	public static void main(String[] args) {
		
		//List<Dish> --> serialize
		File f = new File("data/serialize.txt"); 
		
		if(!f.exists()) {
			System.out.println("File is not exists |||");
			return ;
		}
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			
			Object ob = ois.readObject();
			
			List<Dish> menu = (List<Dish>)ob;
			System.out.println("Dữ liệu từ file serialize.txt");
			System.out.println("============");
			menu.forEach(System.out::println);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(ois,fis);
		}
	}
}
