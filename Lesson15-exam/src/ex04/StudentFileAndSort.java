package ex04;

import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
    private String mssv;
    private String ten;
    private double diemTB;
    private String gioiTinh;

    public Student(String mssv, String ten, double diemTB, String gioiTinh) {
        this.mssv = mssv;
        this.ten = ten;
        this.diemTB = diemTB;
        this.gioiTinh = gioiTinh;
    }

    public String getMssv() {
        return mssv;
    }

    public String getTen() {
        return ten;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public int compareTo(Student other) {
        if (this.diemTB != other.diemTB) {
            return Double.compare(this.diemTB, other.diemTB);
        } 
        else {
            return this.ten.compareTo(other.ten);
        }
    }
    
    @Override
    public String toString() {
        return mssv + ", " + ten + ", " + diemTB + ", " + gioiTinh;
    }
}

public class StudentFileAndSort {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("student.txt");
            writer.println("102130174, Le Na, 7.8, Nu");
            writer.println("102130125, Hoang Nam, 8.2, Nam");
            writer.println("102130176, Van Cuong, 9.8, Nam");
            writer.println("102130177, Van Cong, 6.8, Nam");
            writer.println("102130178, Ngoc Nu, 9.1, Nu");
            writer.println("102130180, Hoang Nhung, 7.8, Nu");
            writer.println("102130181, Hoang Nhung, 7.1, Nu");
            writer.close();

            ArrayList<Student> students = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String mssv = parts[0];
                String ten = parts[1];
                double diemTB = Double.parseDouble(parts[2]);
                String gioiTinh = parts[3];
                students.add(new Student(mssv, ten, diemTB, gioiTinh));
            }
            reader.close();

            Collections.sort(students);

            System.out.println("Danh sách sinh viên đã được sắp xếp:");
            for (Student student : students) {
                System.out.println(student);
            }

            System.out.println("\nKết quả tìm kiếm:");
            searchStudentsWithGPAGreaterThanEight(students);
            searchFemaleStudents(students);
            searchStudentsAppearingOnce(students);

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc hoặc ghi vào file.");
            e.printStackTrace();
        }
    }

    public static void searchStudentsWithGPAGreaterThanEight(ArrayList<Student> students) {
        System.out.println("\nSinh viên có ĐTB > 8:");
        for (Student student : students) {
            if (student.getDiemTB() > 8) {
                System.out.println(student);
            }
        }
    }

    public static void searchFemaleStudents(ArrayList<Student> students) {
        System.out.println("\nSinh viên NỮ:");
        for (Student student : students) {
            if (student.getGioiTinh().equalsIgnoreCase("Nu")) {
                System.out.println(student);
            }
        }
    }

    public static void searchStudentsAppearingOnce(ArrayList<Student> students) {
        System.out.println("\nSinh viên chỉ xuất hiện một lần:");
        Map<String, Integer> appearanceCount = new HashMap<>();
        for (Student student : students) {
            String mssv = student.getMssv();
            appearanceCount.put(mssv, appearanceCount.getOrDefault(mssv, 0) + 1);
        }
        for (Student student : students) {
            if (appearanceCount.get(student.getMssv()) == 1) {
                System.out.println(student);
            }
        }
    }
}