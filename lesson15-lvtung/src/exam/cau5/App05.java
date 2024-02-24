package exam.cau5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Student;

public class App05 {

	public static void main(String[] args) {

		List<Student> studentList = readStudentFile("student.txt");

		// 1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. 
		// Nếu DTB bằng nhau sắp xếp tăng dần theo họ tên.
		Collections.sort(studentList, Comparator.comparing(Student::getMediumScore)
												.thenComparing(Student::getName));
		System.out.println("1. Danh sách sinh viên sắp xếp theo ĐTB và họ tên:");
		printStudentList(studentList);
		
		// 2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
		System.out.println("\n2. Danh sách sinh viên có ĐTB > 8:");
        List<Student> highScoreStudents = findStudentsWithHighScore(studentList, 8.0);
        printStudentList(highScoreStudents);
        
		// 3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
        System.out.println("\n3. Danh sách sinh viên NỮ:");
        List<Student> femaleStudents = findFemaleStudents(studentList);
        printStudentList(femaleStudents);
        
		// 4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. 
		// Biết rằng 2 sinh viên được phân biệt với nhau thông qua MSSV
        System.out.println("\n4. Sinh viên chỉ xuất hiện một lần:");
        List<Student> uniqueStudents = findUniqueStudents(studentList);
        printStudentList(uniqueStudents);
	}

	private static List<Student> readStudentFile(String filename) {
		List<Student> studentList = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(", ");
				String mssv = parts[0];
				String hoTen = parts[1];
				double diemTB = Double.parseDouble(parts[2]);
				String gioiTinh = parts[3];

				Student student = new Student(mssv, hoTen, diemTB, gioiTinh);
				studentList.add(student);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return studentList;
	}

	private static void printStudentList(List<Student> students) {
		for (Student student : students) {
			System.out.println(student.getId() + ", " + student.getName() + ", " + student.getMediumScore() + ", "
					+ student.getGender());
		}
	}
	
	private static List<Student> findStudentsWithHighScore(List<Student> students, double threshold) {
        List<Student> highScoreStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getMediumScore() > threshold) {
                highScoreStudents.add(student);
            }
        }
        return highScoreStudents;
    }

    private static List<Student> findFemaleStudents(List<Student> students) {
        List<Student> femaleStudents = new ArrayList<>();
        for (Student student : students) {
            if ("Nu".equalsIgnoreCase(student.getGender())) {
                femaleStudents.add(student);
            }
        }
        return femaleStudents;
    }

    private static List<Student> findUniqueStudents(List<Student> students) {
        Map<String, Integer> studentCountMap = new HashMap<>();
        for (Student student : students) {
            String mssv = student.getId();
            studentCountMap.put(mssv, studentCountMap.getOrDefault(mssv, 0) + 1);
        }

        List<Student> uniqueStudents = new ArrayList<>();
        for (Student student : students) {
            if (studentCountMap.get(student.getId()) == 1) {
                uniqueStudents.add(student);
            }
        }

        return uniqueStudents;
    }

}
