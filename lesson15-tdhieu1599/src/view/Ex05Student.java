package view;

import static java.util.Comparator.comparing;
import static utils.PrintUtils.print;
import static java.util.Comparator.reverseOrder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Student;

/**
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
		List<Student> students = readFile("student.txt", Student::new);
		print("1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu ĐTB bằng nhau sắp xếp giảm dần theo họ tên",
				method1(students));
		print("2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8", method2(students));
		print("3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ", method3(students));
		print("4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt", method4(students, Student::getId));
	}

	private static List<Student> method1(List<Student> students) {
		return students.stream().sorted(comparing(Student::getGpa).thenComparing(Student::getName, reverseOrder()))
				.collect(Collectors.toList());
	}

	private static List<Student> method2(List<Student> students) {
		return students.stream().filter(s -> s.getGpa() > 8d).collect(Collectors.toList());
	}

	private static List<Student> method3(List<Student> students) {
		return students.stream().filter(s -> "Nu".equals(s.getGender())).collect(Collectors.toList());
	}

	private static Set<Student> method4(List<Student> students, Function<Student, String> func) {
		Set<String> nonDupProps = new HashSet<>();
		return students.stream().filter(e -> nonDupProps.add(func.apply(e))).collect(Collectors.toSet());
	}

	private static <R> List<R> readFile(String path, Function<String, R> function) {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<R> result = new ArrayList<>();
		if (lines != null && !lines.isEmpty()) {
			for (String line : lines) {
				R converted = function.apply(line);
				result.add(converted);
			}
		}
		return result;
	}
}