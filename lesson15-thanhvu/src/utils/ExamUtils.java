package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.Student;

public class ExamUtils {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static List<Student> readStudentsFromFile(String filename) {
        List<Student> students = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(", ");
                if (parts.length == 4) {
                    String mssv = parts[0];
                    String hoTen = parts[1];
                    double diemTB = Double.parseDouble(parts[2]);
                    String gioiTinh = parts[3];
                    Student student = new Student(mssv, hoTen, diemTB, gioiTinh);
                    students.add(student);
                }
            }
            scanner.close();
            return students;
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy tệp " + filename);
            e.printStackTrace();
            return null;
        }
    }
	
	public static int inputInt() {
		while(true) {
			try {
				int result = Integer.parseInt(ip.nextLine());
				
				if (result < 0) {
					throw new NumberFormatException();
				}
				
				return result;
			} catch (NumberFormatException e) {
				System.out.println("Phải nhập số !!!");
			}
		}
	}

}
