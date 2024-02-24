package main;

import bean.Student;
import bean.StudentManager;
import model.Datamodel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Ex05 extends JFrame {

    private JComboBox<String> functionComboBox;
    private JButton executeButton;
    private JButton displayResultButton;  
    private JTextArea outputTextArea;
    private StudentManager studentManager;

    public Ex05() {
        setTitle("Đặng Hữu Thanh");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        functionComboBox = new JComboBox<>(new String[]{"Sắp xếp sinh viên", "Điểm TB > 8", "Sinh viên Nữ", "Sinh viên xuất hiện một lần"});
        executeButton = new JButton("Thực hiện");
        displayResultButton = new JButton("Data");
        outputTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(outputTextArea);

        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSelectedFunction();
            }
        });

        displayResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayStudents(studentManager.getStudents());
            }
        });

        Dimension buttonSize = new Dimension(150, 30);
        executeButton.setPreferredSize(buttonSize);
        displayResultButton.setPreferredSize(buttonSize);

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Chọn chức năng: "));
        topPanel.add(functionComboBox);
        topPanel.add(executeButton);
        add(topPanel, BorderLayout.NORTH);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(executeButton);
        bottomPanel.add(displayResultButton);
        add(bottomPanel, BorderLayout.SOUTH);

        add(scrollPane, BorderLayout.CENTER);

        studentManager = new StudentManager(Datamodel.getStudents());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void performSelectedFunction() {
        String selectedFunction = (String) functionComboBox.getSelectedItem();
        if (selectedFunction != null) {
            switch (selectedFunction) {
                case "Sắp xếp sinh viên":
                    studentManager.sortStudentsByDiemTBAndHoTen();
                    break;
                case "Điểm TB > 8":
                    displayStudents(studentManager.findStudentsWithDiemTBGreaterThan8());
                    break;
                case "Sinh viên Nữ":
                    displayStudents(studentManager.findFemaleStudents());
                    break;
                case "Sinh viên xuất hiện một lần":
                    displayStudents(studentManager.findUniqueStudents());
                    break;
            }
        }
    }

    private void displayStudents(List<Student> students) {
        StringBuilder result = new StringBuilder();
        for (Student student : students) {
            result.append(student.getMssv()).append(", ").append(student.getHoTen()).append(", ").append(student.getDiemTB()).append(", ").append(student.getGioiTinh()).append("\n");
        }

        outputTextArea.setText(result.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ex05();
            }
        });
    }
}
