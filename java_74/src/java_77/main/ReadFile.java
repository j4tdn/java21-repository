package java_77.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ReadFile {
	public static void main(String[] args) throws Exception {
		// write file
//		try {
//			File file = new File("D:\\workspace\\java21\\2.JAVA\\java_74\\src\\java_77\\main\\file.data");
//			OutputStream os = new FileOutputStream(file);
//			ObjectOutputStream oos = new ObjectOutputStream(os);
//			
//			Student s1 = new Student("D1", "Thinh", "math", 8.5);
//			oos.writeObject(s1);
//			
//			oos.flush();
//			oos.close();
//			System.out.println("Write file successfully");
//		} catch (Exception e) {
//			e.getStackTrace();
//		}
		
		try {
			File file = new File("D:\\workspace\\java21\\2.JAVA\\java_74\\src\\java_77\\main\\file.data");
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			Student sv1 = (Student) ois.readObject();
			System.out.println(sv1);
			
			ois.close();
			
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
}
