package test05;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test05 {
	public static void main(String[] args) {
		File file = new File("src/test05/student.txt");

		if(!file.exists()) {
			System.out.println("File '" + file.getName() + "' not exited not yet");
			return;
		}
		try {
			List<String> readData = Files.readAllLines(file.toPath());
			// read file --> List<String>
			readData.forEach(System.out::println);
			String[][] studens = readData.stream()
					.map(e -> e.split(", "))
					.toArray(String[][]::new);
			
			Student[] getStudents = getStudent(studens);
			sortByPoint(getStudents);
			System.out.println(Arrays.toString(getStudents));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static Student[] getStudent(String[][] students) {
		Student[] getStudents = new Student[students.length];
		for(int i = 0; i < students.length; i++) {
			getStudents[i] =  new Student();
			getStudents[i].setId(students[i][0]);
			getStudents[i].setName(students[i][1]);
			getStudents[i].setPoint(Double.parseDouble(students[i][2]));
			getStudents[i].setGender(students[i][3]);
		}
		return getStudents;
	}
	private static void sortByPoint(Student[] students) {
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student st1, Student st2) {
				if (st1 == null) {
					return 1;
				}
				// i1 != null
				if (st2 == null) {
					return -1;
				}
				
				return st1.getPoint().compareTo(st2.getPoint());
			}
		});
	}
}
