package main;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Ex03 extends JFrame {
    private JTextField inputField;
    private JTextArea outputArea;

    public Ex03() {
        super("Đặng Hữu Thanh");

        inputField = new JTextField(20);
        JButton checkButton = new JButton("Check");
        outputArea = new JTextArea(10, 20);

        checkButton.addActionListener(e -> processInput());

        setLayout(new BorderLayout());
        
        JPanel inputPanel = new JPanel(new GridLayout(2, 1));
        inputPanel.add(new JLabel("Enter a number:"));
        inputPanel.add(inputField);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);
        add(checkButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400); 
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void processInput() {
        String inputText = inputField.getText();
        try {
            int num = Integer.parseInt(inputText);
            if (isHappyNumber(num)) {
                outputArea.setText(num + " là số hạnh phúc");
            } else {
                outputArea.setText(num + " không phải là số hạnh phúc.");
            }
        } catch (NumberFormatException ex) {
            outputArea.setText("Vui lòng nhập một số nguyên dương");
        }
    }

    private boolean isHappyNumber(int num) {
        Set<Integer> number = new HashSet<>();

        while (num != 1 && !number.contains(num)) {
        	number.add(num);
            num = calculate(num);
        }

        return num == 1;
    }

    private int calculate(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ex03::new);
    }
}
