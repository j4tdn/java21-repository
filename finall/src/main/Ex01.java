package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Ex01 extends JFrame {
    private JTextField inputField;
    private JTextArea outputArea;

    public Ex01() {
        super("Đặng Hữu Thanh");

        inputField = new JTextField(20);
        JButton processButton = new JButton("Checkkk");
        outputArea = new JTextArea(10, 20);

        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processInput();
            }
        });

        setLayout(new FlowLayout());
        add(new JLabel("Enter elements (space-separated):"));
        add(inputField);
        add(processButton);
        add(new JScrollPane(outputArea));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void processInput() {
        String inputText = inputField.getText();
        String[] elements = inputText.split(" ");

        if (elements.length > 0) {
            int[] arr = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                try {
                    arr[i] = Integer.parseInt(elements[i]);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid integers.");
                    return;
                }
            }

            printUnique(arr);
            printDuplicate(arr);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin trước khi xử lý.");
        }
    }

    private void printUnique(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> uniqueElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueElements.add(entry.getKey());
            }
        }

        outputArea.append("Unique elements: " + Arrays.toString(uniqueElements.toArray()) + "\n");
    }

    private void printDuplicate(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int n : arr) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        ArrayList<Integer> duplicate = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
            	duplicate.add(entry.getKey());
            }
        }

        outputArea.append("Duplicate elements: " + Arrays.toString(duplicate.toArray()) + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ex01());
    }
}
