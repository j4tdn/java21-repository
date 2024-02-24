package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex01De3 extends JFrame {

    private JTextField decimalNumberField;
    private JButton calculateButton;
    private JTextArea resultTextArea;

    public Ex01De3() {
        setTitle("Đặng Hữu Thanh");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        decimalNumberField = new JTextField();
        decimalNumberField.setPreferredSize(new Dimension(90, 40));
        calculateButton = new JButton("Check");
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        resultTextArea.setPreferredSize(new Dimension(300, 90));
        JScrollPane scrollPane = new JScrollPane(resultTextArea);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertAndDisplayFraction();
            }
        });

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        topPanel.add(new JLabel("Nhập số thực có phần thập phân khác 0: "));
        topPanel.add(decimalNumberField);

        bottomPanel.add(calculateButton);

        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void convertAndDisplayFraction() {
        try {
            double decimalNumber = Double.parseDouble(decimalNumberField.getText());

            int[] fraction = convert(decimalNumber);
            int simplifiedNumerator = fraction[0];
            int simplifiedDenominator = fraction[1];

            resultTextArea.setText("Phân số tối giản của " + decimalNumber + " là: " + simplifiedNumerator + "/" + simplifiedDenominator);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập một số thực hợp lệ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int[] convert(double decimalNumber) {
        int precision = 1000000;
        int numerator = (int) Math.round(decimalNumber * precision);
        int denominator = precision;

        int commonDivisor = findGCD(numerator, denominator);

        int[] fraction = {numerator / commonDivisor, denominator / commonDivisor};
        return fraction;
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ex01De3();
            }
        });
    }
}
