package Student;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;

public class Ex05 {
	public static void main(String[] args) {
		List<Student> students = inputStudents();

		System.out.println("Tìm kiếm danh sách sinh viên có ĐTB > 8:");
		findStudentsWithCondition(student -> student.getScore() > 8, students);
		System.out.println("\nTìm kiếm toàn bộ các sinh viên NỮ");
		findStudentsWithCondition(student -> "Nu".equals(student.getSex()), students);
		System.out.println("\nTìm kiếm sinh viên chỉ xuất hiện một lần");
		findNonDuplicateStudents(students);
		System.out.println("\nSắp xếp sinh viên tăng dần theo giới tính, nếu 2 SV cùng giới tính thì giảm dần theo ĐTB");
		sortStudentsBySexAndScore(students);
	}

	private static void findNonDuplicateStudents(List<Student> students) {
		List<Student> result = new ArrayList<>();
		for (int i = 0; i < students.size(); i++) {
			if (!isRepeated(students, i)) {
				result.add(students.get(i));
			}
		}
		
		result.forEach(System.out::println);
	}

	private static boolean isRepeated(List<Student> students, int index) {
		Student student = students.get(index);
		for (int i = 0; i < students.size(); i++) {
			if (i == index) {
				continue;
			}

			if (students.get(i).getId().equals(student.getId())) {
				return true;
			}
		}
		return false;
	}

	private static void sortStudentsBySexAndScore(List<Student> students) {
		students.stream().sorted(comparing(Student::getSex).thenComparing(Student::getScore))
				.forEach(System.out::println);
	}

	private static void findStudentsWithCondition(Predicate<Student> pre, List<Student> students) {
		students.stream().filter(student -> pre.test(student)).forEach(System.out::println);
	}

	private static List<Student> inputStudents() {
		List<Student> result = new ArrayList<>();
		try {
			result = Files.lines(Paths.get("student.txt")).map(string -> {
				String[] arr = string.split(",\\s");
				if (arr.length == 4) {
					double score = Double.parseDouble(arr[2]);
					return new Student(arr[0], arr[1], score, arr[3]);
				} else {
					return null;
				}
			}).filter(element -> element != null).collect(Collectors.toList());
		} catch (Exception e) {
			System.out.println("Đã có lỗi xảy ra!");
			e.printStackTrace();
		}
		return result;
	}
}