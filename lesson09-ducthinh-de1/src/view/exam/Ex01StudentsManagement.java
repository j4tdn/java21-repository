package view.exam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01StudentsManagement {
	public static void main(String[] args) {
		Student[] students = {
				new Student(102, "Nam", Grade.C),
				new Student(103, "Bảo", Grade.F),
				new Student(104, "Hoàng", Grade.D),
				new Student(105, "Nguyên", Grade.B),
				new Student(107, "Vũ", Grade.F),
				new Student(109, "Lan", Grade.A),
				new Student(202, "Đạt", Grade.C),
				new Student(103, "Bảo", Grade.F),
				new Student(107, "Vũ", Grade.C),
				new Student(104, "Hoàng", Grade.B)	
		};
		
		List<Student> studentsGradeA = findStudentGradeA(students);
		System.out.println("List student reached grade A");
		displayList(studentsGradeA);
		List<Student> studentsStudiedAgain = findStudentStudentAgain(students);
		System.out.println("List student studied data structure subject again");
		displayList(studentsStudiedAgain);
	}
	// display function
	public static void displayList(List<Student> studentsGradeA) {
		for(Student student : studentsGradeA) {
			System.out.println(student.getId() + "-->" + student.getFullname());
		}
	}
	// find student reach grade A function
	public static List<Student> findStudentGradeA(Student[] students){
		List<Student> result = new ArrayList<>();
		for (Student student:students) {
			if(student.getGrade()==Grade.A) {
				result.add(student);
			}
		}
		return result;
	}
	// find student studied data structure again
	public static List<Student> findStudentStudentAgain(Student[] students){
		List<Student> studentsStudyAgain = new ArrayList<>();
		Set<Integer> studentsStudyNor = new HashSet<>();
		for (Student student:students) {
			if(studentsStudyNor.contains(student.getId())) {
				studentsStudyAgain.add(student);
			}else {
				studentsStudyNor.add(student.getId());
			}
		}
		return studentsStudyAgain;
	}
}
