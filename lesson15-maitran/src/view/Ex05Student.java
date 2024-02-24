package view;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Student;

/*
 Bài 5: Cho danh sách sinh viên được input từ file student.txt. Viết chương trình
a. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu ĐTB bằng nhau sắp xếp giảm
dần theo họ tên.
b. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
c. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ

d. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được
phân biệt với nhau thông qua MSSV
 */
public class Ex05Student {

	public static void main(String[] args) {
		Path path = Paths.get("student.txt");
		List<String> lines = new ArrayList<>();
		try {
			lines = Files.readAllLines(path);
//			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<Student> students = new ArrayList<>();
		for (String item : lines) {
			String[] out = item.split(",");
			Student s = new Student(out[0], out[1], Double.parseDouble(out[2]), out[3]);
			students.add(s);
		}
		System.out.println("--------------------------------------");
		System.out.println("\nList of students in ascending order by GPA\n" + sortedByAvr(students));
		System.out.println("\nList of students with GPA > 8\n" + sortedByAvrLargerThan8(students));
		System.out.println("\nList of FEMALE students\n" + findFeMaleStudent(students));
		System.out.println("\nList of UNIQUE students\n" + findUniqueStudent(students));
	}

	private static List<Student> sortedByAvr(List<Student> students) {
		return students.stream().sorted(
				Comparator.comparing(Student::getMark).thenComparing(Student::getName, Comparator.reverseOrder()))
				.collect(Collectors.toList());
	}

	private static List<Student> sortedByAvrLargerThan8(List<Student> students) {
		return students.stream().filter(student -> student.getMark() > 8).collect(Collectors.toList());
	}

	private static List<Student> findFeMaleStudent(List<Student> students) {
		return students.stream().filter(student -> student.getSex().contains("Nu")).collect(Collectors.toList());
	}

	private static List<Student> findUniqueStudent(List<Student> students) {
		Map<String, Long> studentCountMap = students.stream()
				.collect(Collectors.groupingBy(Student::getId, Collectors.counting()));

		return students.stream().filter(student -> studentCountMap.get(student.getId()) == 1)
				.collect(Collectors.toList());
	}

}