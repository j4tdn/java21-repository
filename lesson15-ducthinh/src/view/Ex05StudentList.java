package view;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator. *;
import java.util.List;
import java.util.stream.Collectors;

import bean.Student;
import static utils.CollectionUtils. *;

public class Ex05StudentList {
	public static void main(String[] args) {
		/*
		 * 
		 * 	102130174, Le Na, 7.8, Nu
			102130125, Hoang Nam, 8.2, Nam
			102130176, Van Cuong, 9.8, Nam
			102130177, Van Cong, 6.8, Nam
			102130178, Ngoc Nu, 9.1, Nu
			102130180, Hoang Nhung, 7.8, Nu
			===================================================================================================
		 * 	1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần theo họ tên.
			2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
			3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
			4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được phân biệt với nhau thông qua MSSV.
		
		 */
		
		// read file student.txt
		File file = new File("D:\\workspace\\java21\\2.JAVA\\lesson15-ducthinh\\src\\student.txt");
		// Student List
		List<Student> students = readFileToStudentList(file);
		generate("\\\\\\\\\\\\\\Student List////////////", students);
		// 1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần theo họ tên.
		List<Student> studentSortByScoreAndName = students.stream().sorted(comparing(Student::getScore)
																   .thenComparing(Student::getName)).toList();
		generate("1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần theo họ tên."
																						, studentSortByScoreAndName);
		// 2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
		List<Student> scoreOverEightStudentList = students.stream().filter(s -> s.getScore().compareTo(bd(8)) > 0).toList();
		generate("2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8", scoreOverEightStudentList);
		// 3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
		List<Student> femaleStudentList = students.stream().filter(s -> s.getSex().contains("Nu")).toList();
		generate("3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ", femaleStudentList);
		// 4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được phân biệt với nhau thông qua MSSV.
		 List<Student> uniqueStudents = students.stream()
                 .collect(Collectors.groupingBy(Student::getId, Collectors.counting()))
                 .entrySet()
                 .stream()
                 .filter(entry -> entry.getValue() == 1)
                 .map(entry -> students.stream().filter(student -> student.getId().equals(entry.getKey())).findFirst().get())
                 .collect(Collectors.toList());
		 generate("4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. "
		 		+ "Biết rằng 2 sinh viên được phân biệt với nhau thông qua MSSV.", uniqueStudents);
	}
	
	public static List<Student> readFileToStudentList(File file){
		List<Student> students = new ArrayList<>();
		if(!file.exists()) {
			System.out.println(">>> File '" + file.getName() + "' is not existed yet !!");		
		}
		try {
			List<String> lines = Files.readAllLines(file.toPath());
			for(String string : lines) {
				String[] tokens = string.split(",");
				if(tokens.length == 4) {
					String id = tokens[0];
					String name = tokens[1];
					BigDecimal score = bd(Double.parseDouble(tokens[2]));
					String sex = tokens[3];
					Student student = new Student(id, name, score, sex);
					students.add(student);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return students;
	}
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
