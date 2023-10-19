package java_71;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuongVaoFile {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\workspace\\java21\\2.JAVA\\java_71\\file.data");
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			Doctor doctor = new Doctor("Doc 1", "Nguyen Van A", "or", 2);
			oos.writeObject(doctor);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
