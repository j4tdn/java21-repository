package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Ex03De3 extends JFrame {
    private JTextField textField1, textField2;
    private JLabel resultLabel;

    public Ex03De3() {
        setTitle("Đặng Hữu Thanh");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("Chuỗi thứ nhất:"));
        textField1 = new JTextField();
        panel.add(textField1);

        panel.add(new JLabel("Chuỗi cần kiểm tra:"));
        textField2 = new JTextField();
        panel.add(textField2);

        JButton checkButton = new JButton("Kiểm tra ");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnagrams();
            }
        });
        panel.add(checkButton);

        resultLabel = new JLabel("Kết quả:");
        panel.add(resultLabel);

        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void checkAnagrams() {
        String str1 = textField1.getText();
        String str2 = textField2.getText();

        boolean areAnagrams = areAnagrams(str1, str2);

        if (areAnagrams) {
            resultLabel.setText("Kết quả: True - Đây là đảo ngữ.");
        } else {
            resultLabel.setText("Kết quả: False - Đây không phải là đảo ngữ.");
        }
    }

    private boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charArray2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ex03De3();
            }
        });
    }
}
