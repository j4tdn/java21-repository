package view;

import java.util.HashMap;
import java.util.Map;

public class Ex05 {

	public static void main(String[] args) {
        Map<String, Double> expenses = new HashMap<>();
        expenses.put("Mua thực phẩm", 450000.0);
        expenses.put("Điện thoại di động", 700000.0);
        expenses.put("Xăng xe", 600000.0);
        expenses.put("Mua quần áo", 850000.0);
        expenses.put("Sửa xe", 400000.0);

        System.out.println("Các khoản chi lớn hơn 500,000 VNĐ:");
        listExpensesGreaterThan(expenses, 500000.0);

        System.out.println("\nCác khoản chi theo thứ tự tăng dần của các khoản chi tiêu:");
        sortExpensesByKey(expenses);

        System.out.println("\nCác khoản chi theo thứ tự giảm dần bởi số tiền:");
        sortExpensesByValueDescending(expenses);
    }

	private static void listExpensesGreaterThan(Map<String, Double> expenses, double amount) {
        expenses.entrySet().stream()
            .filter(entry -> entry.getValue() > amount)
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " VNĐ"));
    }

    private static void sortExpensesByKey(Map<String, Double> expenses) {
        expenses.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " VNĐ"));
    }

    private static void sortExpensesByValueDescending(Map<String, Double> expenses) {
        expenses.entrySet().stream()
            .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " VNĐ"));
    }
    
	
}
