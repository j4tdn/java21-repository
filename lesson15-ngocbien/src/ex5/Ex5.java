package ex5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {

	public static void main(String[] args) {
		File file = new File("data/input.txt");

		if (!file.exists()) {
			System.out.println(">>> File '" + file.getName() + "' is not existed yet");
			return;
		}

		try {
			List<String> lines = Files.readAllLines(file.toPath());
			List<Student> students = new ArrayList<>();

			for (String line : lines) {
				String[] elements = line.split(",");

				if (elements.length != 4) {
					System.out.println(line + "error");
				}

				int id = Integer.parseInt(elements[0].trim());
				String name = elements[1].trim();
				Double score = Double.parseDouble(elements[2].trim());
				String gender = elements[3].trim();
				students.add(new Student(id, name, score, gender));
			}
			
			// 1.
			System.out.println("1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần theo họ tên.");
			getSortStudent(students).forEach(System.out::println);
			
			// 2.
			System.out.println("\n2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8");
			getMoreThan8Students(students).forEach(System.out::println);
			
			// 3.
			System.out.println("\n3. Viết hàm tìm kiếm toàn bộ các sinh viên Nữ");
			getFemaleStudents(students).forEach(System.out::println);
			// 4.
			System.out.println("\n4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt");
			getStudentsAppearOnce(students);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static List<Student> getSortStudent(List<Student> students) {
		List<Student> result = students.stream()
										.sorted(Comparator.comparing(Student::getScore)
										.thenComparing(Student::getName))
										.toList();
		return result;
	}
	
	public static List<Student> getMoreThan8Students(List<Student> students) {
		List<Student> result = students.stream()
										.filter(student -> student.getScore() > 8.0)
										.toList();
		return result;
	}
	
	private static List<Student> getFemaleStudents(List<Student> students) {
		List<Student> result = students.stream()
										.filter(s -> s.getGender().equals("Nu"))
										.toList();
		return result;
	}
	
	private static void getStudentsAppearOnce(List<Student> students) {
		students.stream()
		.collect(Collectors.groupingBy(s -> s.getId(), Collectors.counting()))
		.entrySet()
		.stream()
		.filter((e) -> e.getValue() == 1)
		.forEach((e) -> {
			System.out.println(getStudentById(students, e.getKey()));
		});
	}
	
	public static Student getStudentById(List<Student> students, int id) {
		for(Student s : students) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}
	
}
