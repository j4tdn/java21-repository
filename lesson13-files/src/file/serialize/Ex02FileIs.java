package file.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import bean.Dish;

public class Ex02FileIs {
	
	public static void main(String[] args) {
		
		// List<Dish> --> serialized
		File file = new File("data/serialize.txt");
		
		if (!file.exists()) {
			System.out.println("File is not existed !!!");
			return ;
		}
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Object object = ois.readObject();
			
			@SuppressWarnings("unchecked")
			List<Dish> menu = (List<Dish>) object;
			
			System.out.println("Dữ liệu từ file serialized.txt");
			System.out.println("=================================");
			menu.forEach(System.out::println);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
