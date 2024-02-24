package ex05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ex05.bean.Student;

public class Ex05 {

	public static void main(String[] args) {
		
		ArrayList<Student> students = readStudentsFromFile("student.txt");
		sortByGradeAndName(students);
	}
	
	public static ArrayList<Student> readStudentsFromFile(String fileName){
		try {
            return (ArrayList<Student>) Files.lines(Paths.get(fileName))
                        .map(line -> line.split(", "))
                        .map(parts -> new Student(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]), parts[3]))
                        .collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println("Không thể đọc file " + fileName);
            return null;
        }
	}
	
	public static void sortByGradeAndName(List<Student> students) {
		students.sort(Comparator.comparingDouble(Student::getGrade).thenComparing(Student::getName));
		students.forEach(System.out::println);
	}
	
}
