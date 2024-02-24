package bean;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManager {
    private List<Student> students;

    public StudentManager(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void sortStudentsByDiemTBAndHoTen() {
        Collections.sort(students);
    }

    public List<Student> findStudentsWithDiemTBGreaterThan8() {
        return students.stream()
                .filter(student -> student.getDiemTB() > 8)
                .collect(Collectors.toList());
    }

    public List<Student> findFemaleStudents() {
        return students.stream()
                .filter(student -> "Nu".equalsIgnoreCase(student.getGioiTinh()))
                .collect(Collectors.toList());
    }

    public List<Student> findUniqueStudents() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getMssv, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> students.stream().filter(student -> student.getMssv().equals(entry.getKey())).findFirst().orElse(null))
                .filter(student -> student != null)
                .collect(Collectors.toList());
    }
}
