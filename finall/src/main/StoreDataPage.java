
package main;

import bean.Item;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StoreDataPage extends JFrame {

    private List<Item> itemList;
    private JTable jTable;
    private DefaultTableModel tableModel;
    private JTextField[] inputFields;

    public StoreDataPage() {
        setTitle("Store Data Page");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize itemList
        itemList = new ArrayList<>();

        // Create and set layout
        setLayout(new BorderLayout());

        // Create JTable and DefaultTableModel
        String[] columnNames = {"StoreId", "ReferenceStoreId", "StockPreviousDay", "ExpectedSales", "IsSelected"};
        Object[][] rowData = new Object[0][columnNames.length];

        tableModel = new DefaultTableModel(rowData, columnNames);
        jTable = new JTable(tableModel);

        // Add JTable to JScrollPane
        JScrollPane scrollPane = new JScrollPane(jTable);

        // Create input fields for each column
        inputFields = new JTextField[columnNames.length];
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));  // 6 rows and 2 columns

        for (int i = 0; i < columnNames.length; i++) {
            inputPanel.add(new JLabel(columnNames[i]));
            inputFields[i] = new JTextField();
            inputPanel.add(inputFields[i]);
        }

        // Add inputPanel and JScrollPane to the frame
        add(inputPanel, BorderLayout.WEST);
        add(scrollPane, BorderLayout.CENTER);

        // Add button to add new row
        JButton addButton = new JButton("Add New Row");
        addButton.addActionListener(e -> addNewRow());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Display the frame
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addNewRow() {
        // Create an array to store user input
        String[] userInput = new String[inputFields.length];

        // Show input dialog for each column
        for (int i = 0; i < inputFields.length; i++) {
            userInput[i] = inputFields[i].getText();
            if (userInput[i].isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter values for all columns.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Create a new Item and add it to the itemList
        Item newItem = new Item(userInput[0], userInput[1], userInput[2], userInput[3], userInput[4]);
        itemList.add(newItem);

        // Update the JTable
        updateTable();
    }

    private void updateTable() {
        // Clear existing rows
        tableModel.setRowCount(0);

        // Add rows from itemList to the table
        for (Item item : itemList) {
            Object[] rowData = {item.getStoreId(), item.getReferenceStoreId(), item.getStockPreviousDay(), item.getExpectedSales(), item.getIsSelected()};
            tableModel.addRow(rowData);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StoreDataPage());
    }
}
