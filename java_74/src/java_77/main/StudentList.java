package java_77.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> students = new ArrayList<>();
	
	// 1. add student
	public void add(Student sv) {
		students.add(sv);
	}
	
	// 2. delete student
	public void delete(Student sv) {
		students.remove(sv);
	}
	
	// 3. write file
	public void writeStudentListToFile(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
	
	// 4. read fie
	public void readFileToStudentList(File file) {
	try {
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(is);
		Student sv = null;
		while(true) {
			Object oj = ois.readObject();
			if(oj == null) {
				break;
			}else {
				sv = (Student)oj;
				students.add(sv);
			}
		}
	} catch (Exception e) {
		e.getStackTrace();
	}
	}
}
