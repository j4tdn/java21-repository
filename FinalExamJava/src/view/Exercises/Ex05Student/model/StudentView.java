/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.Exercises.Ex05Student.model;

import java.util.List;

/**
 *
 * @author PC
 */
public class StudentView {
    
    public static void displaySortedStudents(List<Student> students) {
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        printStudents(students);
    }

    public static void displayHighDTBStudents(List<Student> highDTBStudents) {
        System.out.println("\nDanh sách sinh viên có ĐTB > 8:");
        printStudents(highDTBStudents);
    }

    public static void displayFemaleStudents(List<Student> femaleStudents) {
        System.out.println("\nDanh sách sinh viên NỮ:");
        printStudents(femaleStudents);
    }

    public static void displayUniqueStudents(List<Student> uniqueStudents) {
        System.out.println("\nDanh sách sinh viên chỉ xuất hiện một lần:");
        printStudents(uniqueStudents);
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

