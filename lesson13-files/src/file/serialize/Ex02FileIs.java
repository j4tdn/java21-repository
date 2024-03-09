package file.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import bean.Dish;
import utils.FileUtils;


public class Ex02FileIs {
	public static void main(String[] args) {
		
		// List<Dish> --> serialized
		File file = new File("data/serialize.txt");
		
		if(!file.exists()) {
			System.out.println("File is not existed !!!");
			return ;
		}
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis); 
			
			Object object = ois.readObject();
			@SuppressWarnings("unused")
			List<Dish> menu = (List<Dish>)object;
			
			menu.stream().forEach(t -> System.out.println(t));
			
			System.out.println("Dữ liệu từ file serialized.txt");
			System.out.println("==============================");
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
		} finally {
			FileUtils.close(ois, fis);
		}
		
		
		
	}
}
