package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Ex02 extends JFrame {
    private JTextField inputTextField;
    private JLabel resultLabel;

    public Ex02
    () {
        setTitle("Đặng Hữu Thanh");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("Nhập chuỗi:"));
        inputTextField = new JTextField();
        panel.add(inputTextField);

        JButton findButton = new JButton("Tìm ký tự nhiều nhất");
        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	findAndDisplay();
            }
        });
        panel.add(findButton);

        resultLabel = new JLabel("Kết quả:");
        panel.add(resultLabel);

        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void findAndDisplay() {
        String input = inputTextField.getText();
        String result = findMost(input);
        resultLabel.setText("Kết quả: " + result);
    }

    private String findMost(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        int maxCount = 0;
        for (int count : charCountMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        ArrayList<Character> mostFrequentChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                mostFrequentChars.add(entry.getKey());
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : mostFrequentChars) {
            result.append("\"").append(c).append("\", ");
        }

        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ex02();
            }
        });
    }
}
