package homework.cau5;

import static java.util.Comparator.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import static utils.HomeworkUtils.*;

public class ExpenseTrackerApp {

	private static Map<String, Double> expenseMap = new HashMap<>();

	public static void main(String[] args) {
		addExpenses("Ăn uống", 200d);
		addExpenses("Mua sắm", 700d);
		addExpenses("Internet", 500d);
		addExpenses("Giải trí", 800d);

		printfExpenses(expenseMap);

		System.out.println("\n1. Các khoản chi lớn hơn 500K: ");
		listExpensesOver500K();

        System.out.println("\n2. Sắp xếp các khoản chi theo thứ tự tăng dần của các khoản chi tiêu (key):");
        sortExpensesByKey();

        System.out.println("\n3. Sắp xếp các khoản chi theo thứ tự giảm dần bởi số tiền (value):");
        sortExpensesByValue();
	}

	private static void addExpenses(String expenseName, Double amount) {
		expenseMap.put(expenseName, amount);
	}

	private static void printfExpenses(Map<String, Double> expenseMap) {
		System.out.println("Danh sách các khoản chi tiêu trong ngày:");
		for (Map.Entry<String, Double> entry : expenseMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	private static void listExpensesOver500K() {
		System.out.println("Danh sách các khoản chi hơn 500K: ");
		for (Map.Entry<String, Double> entry : expenseMap.entrySet()) {
			if (entry.getValue() > 500) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}

	private static void sortExpensesByKey() {
        Map<String, Double> sortedExpenses = new TreeMap<>(expenseMap);
        printfExpenses(sortedExpenses);
    }

    private static void sortExpensesByValue() {
        Map<String, Double> sortedExpenses = new TreeMap<>((o1, o2) -> expenseMap.get(o2).compareTo(expenseMap.get(o1)));
        sortedExpenses.putAll(expenseMap);
        printfExpenses(sortedExpenses);
    }

}
