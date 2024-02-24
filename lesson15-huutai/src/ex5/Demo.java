package ex5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		List<String> lines = readFile("student.txt");
		
		// 1.
		List<Student> students = map(lines, Student::transfer);
		List<Student> sorted = students.stream()
			.sorted(Comparator.comparing(Student::getGPA).thenComparing(Student::getName))
			.collect(Collectors.toList());
		
		generate("1. Sắp xếp sinh viên tăng dần theo GPA và Name", sorted);
		
		generate("2. Danh sách các sinh viên có GPA > 8", getStudentsByGPA(students));
		
		generate("3. Danh sách toàn bộ sinh viên nữ", getStudentsByGener(students));
		
		generate("4. Danh sách sinh viên chỉ xuất hiện 1 lần", getStudentsByAppearsOnce(students));
	}
	
	private static List<Student> getStudentsByAppearsOnce(List<Student> students) {
		return students.stream()
                .collect(Collectors.groupingBy(Student::getId))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() == 1)
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.toList());
				
	}
	
	private static List<Student> getStudentsByGener(List<Student> students) {
		return students.stream()
				.filter(s -> "Nu".equals(s.getGender().toString()))
				.collect(Collectors.toList());
	}
	
	private static List<Student> getStudentsByGPA(List<Student> students) {
		return students.stream()
				.filter(s -> s.getGPA() > 8)
				.collect(Collectors.toList());
	}
	
	private static <T, R> List<R> map(List<T> source, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		source.forEach(element -> {
			R r = function.apply(element);
			result.add(r);
		});
		return result;
	}
	
	private static List<String> readFile(String pathFile) {
		Path path = Paths.get(pathFile);
		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return List.of();
	}
	
	public static <E> void generate(String prefix, Collection<E> collection) {
		System.out.println(prefix + " --> ");
		for (E e: collection) {
			System.out.println("+ " + e);
		}
		System.out.println();
	}
}
