package main;

import bean.Student;
import bean.StudentManager;
import model.DataModel;
import java.util.List;
import java.util.Scanner;

public class Ex05 {

    private static StudentManager studentManager;

    public static void main(String[] args) {
        studentManager = new StudentManager(DataModel.getStudents());
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        do {
        	System.out.println("------------------ MENU OPTION -------------------");
            System.out.println("Chọn chức năng:");
            System.out.println("1. Sắp xếp sinh viên theo ĐTB");
            System.out.println("2. Hiển thị sinh viên có điểm TB > 8");
            System.out.println("3. Hiển thị sinh viên nữ");
            System.out.println("4. Hiển thị sinh viên xuất hiện một lần");
            System.out.println("5. Kết thúc");
            System.out.println("----------------------- END ----------------------");
            
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    studentManager.sortStudentsByDiemTBAndHoTen();
                    displayStudents(studentManager.getStudents());
                    break;
                case 2:
                    displayStudents(studentManager.findStudentsWithDiemTBGreaterThan8());
                    break;
                case 3:
                    displayStudents(studentManager.findFemaleStudents());
                    break;
                case 4:
                    displayStudents(studentManager.findUniqueStudents());
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (!quit);
    }

    private static void displayStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getMssv() + ", " + student.getHoTen() + ", " + student.getDiemTB() + ", " + student.getGioiTinh());
        }
    }
}
