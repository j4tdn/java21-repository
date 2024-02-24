package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Student;
import utils.ExamUtils;

public class Ex05StudentManagement {
	
	public static void main(String[] args) {
        List<Student> students = ExamUtils.readStudentsFromFile("student.txt");
        if (students != null) {
        	System.out.println("a. Sắp xếp danh sách sinh viên");
            sortStudents(students);
            students.forEach(System.out::println);
            
            System.out.println();
            
            System.out.println("b. Tìm kiếm sinh viên có ĐTB > 8");
            List<Student> studentsWithGPAOver8 = findStudentsWithGPAOver(students, 8);
            studentsWithGPAOver8.forEach(System.out::println);
            System.out.println();
            
            System.out.println("c. Tìm kiếm sinh viên NỮ");
            List<Student> femaleStudents = findFemaleStudents(students);
            femaleStudents.forEach(System.out::println);
            System.out.println();
            
            System.out.println("d. Tìm kiếm sinh viên chỉ xuất hiện một lần");
            List<Student> uniqueStudents = findUniqueStudents(students);
            uniqueStudents.forEach(System.out::println);
        }
    }

    private static void sortStudents(List<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getDiemTB() != s2.getDiemTB()) {
                    return Double.compare(s1.getDiemTB(), s2.getDiemTB());
                } else {
                    return s2.getHoTen().compareTo(s1.getHoTen());
                }
            }
        });
    }

    private static List<Student> findStudentsWithGPAOver(List<Student> students, double threshold) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getDiemTB() > threshold) {
                result.add(student);
            }
        }
        return result;
    }

    private static List<Student> findFemaleStudents(List<Student> students) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGioiTinh().equalsIgnoreCase("Nu")) {
                result.add(student);
            }
        }
        return result;
    }

    private static List<Student> findUniqueStudents(List<Student> students) {
        List<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < students.size(); j++) {
                if (i != j && students.get(i).getMssv().equals(students.get(j).getMssv())) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result.add(students.get(i));
            }
        }
        return result;
    }
}
