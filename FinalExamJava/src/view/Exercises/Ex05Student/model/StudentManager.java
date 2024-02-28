/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.Exercises.Ex05Student.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author PC
 */
public class StudentManager {

    public static void main(String[] args) {
        List<Student> students = readStudentsFromFile("C:\\JAVA21_OOP\\FinalExamJava\\src\\view\\Exercises\\Ex05Student\\model\\Student.txt");

        // 1. Sắp xếp danh sách sinh viên
        sortByDTBAndName(students);
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        printStudents(students);

        // 2. Tìm kiếm danh sách sinh viên có ĐTB > 8
        List<Student> highDTBStudents = findStudentsWithHighDTB(students, 8.0);
        System.out.println("\nDanh sách sinh viên có ĐTB > 8:");
        printStudents(highDTBStudents);

        // 3. Tìm kiếm toàn bộ các sinh viên NỮ
        List<Student> femaleStudents = findFemaleStudents(students);
        System.out.println("\nDanh sách sinh viên NỮ:");
        printStudents(femaleStudents);

        // 4. Tìm kiếm sinh viên chỉ xuất hiện một lần
        List<Student> uniqueStudents = findUniqueStudents(students);
        System.out.println("\nDanh sách sinh viên chỉ xuất hiện một lần:");
        printStudents(uniqueStudents);
    }

    private static List<Student> readStudentsFromFile(String fileName) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(", ");
                String mssv = tokens[0];
                String name = tokens[1];
                double dtb = Double.parseDouble(tokens[2]);
                String gender = tokens[3];

                students.add(new Student(mssv, name, dtb, gender));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }

    private static void sortByDTBAndName(List<Student> students) {
        Collections.sort(students, Comparator
                .comparingDouble(Student::getDtb)
                .thenComparing(Student::getName));
    }

    private static List<Student> findStudentsWithHighDTB(List<Student> students, double threshold) {
        List<Student> highDTBStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getDtb() > threshold) {
                highDTBStudents.add(student);
            }
        }
        return highDTBStudents;
    }

    private static List<Student> findFemaleStudents(List<Student> students) {
        List<Student> femaleStudents = new ArrayList<>();
        for (Student student : students) {
            if ("Nu".equalsIgnoreCase(student.getGender())) {
                femaleStudents.add(student);
            }
        }
        return femaleStudents;
    }

    private static List<Student> findUniqueStudents(List<Student> students) {
        Set<String> seenMSSV = new HashSet<>();
        List<Student> uniqueStudents = new ArrayList<>();

        for (Student student : students) {
            if (seenMSSV.add(student.getMssv())) {
                uniqueStudents.add(student);
            }
        }

        return uniqueStudents;
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
