package view.online.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import src.Trader;
import src.Transaction;

public class Ex01TransactionApp {

	public static void main(String[] args) {
		List<Transaction> transactions = getTransactions();

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		// 3. What are all the unique cities where the traders work?
		// 4. Find all traders from Cambridge and sort them by name desc.
		// 5. Return a string of all traders’ names sorted alphabetically.
		// 6. Are any traders based in Milan?
		// 7. Count the number of traders in Milan.
		// 8. Print all transactions’ values from the traders living in Cambridge.
		// 9. What’s the highest value of all the transactions?
		// 10. Find the transaction with the smallest value.

		System.out.println(" ================ Start ==================");

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		List<Transaction> transactions2011 = getTransactionsInYear(transactions, 2011);
		sortTransactionsByValue(transactions2011);
		System.out.println("Transactions in 2011 sorted by value: " + transactions2011);
		System.out.println("\n---------------------------------------------------------");

		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city.
		List<Transaction> highValueTransactions = getHighValueTransactions(transactions, 300);
		sortTransactionsByCity(highValueTransactions);
		System.out.println("Transactions with value > 300 sorted by trader's city: " + highValueTransactions);
		System.out.println("\n---------------------------------------------------------");

		// 3. What are all the unique cities where the traders work?
		Set<String> uniqueCities = getUniqueCities(transactions);
		System.out.println("Unique cities where traders work: " + uniqueCities);
		System.out.println("\n---------------------------------------------------------");

		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> tradersFromCambridge = getTradersFromCity(transactions, "Cambridge");
		sortTradersByNameDesc(tradersFromCambridge);
		System.out.println("Traders from Cambridge sorted by name desc: " + tradersFromCambridge);
		System.out.println("\n---------------------------------------------------------");

		// 5. Return a string of all traders’ names sorted alphabetically.
		String allTraderNames = getAllTraderNamesSorted(transactions);
		System.out.println("All traders' names sorted alphabetically: " + allTraderNames);
		System.out.println("\n---------------------------------------------------------");

		// 6. Are any traders based in Milan?
		boolean tradersInMilan = anyTradersInCity(transactions, "Milan");
		System.out.println("Any traders based in Milan? " + tradersInMilan);
		System.out.println("\n---------------------------------------------------------");

		// 7. Count the number of traders in Milan.
		long numberOfTradersInMilan = countTradersInCity(transactions, "Milan");
		System.out.println("Number of traders in Milan: " + numberOfTradersInMilan);
		System.out.println("\n---------------------------------------------------------");

		// 8. Print all transactions’ values from the traders living in Cambridge.
		printTransactionValuesFromCity(transactions, "Cambridge");
		System.out.println("\n---------------------------------------------------------");

		// 9. What’s the highest value of all the transactions?
		int highestValue = getHighestTransactionValue(transactions);
		System.out.println("Highest value of all transactions: " + highestValue);
		System.out.println("\n---------------------------------------------------------");

		// 10. Find the transaction with the smallest value.

		System.out.println(" ================ End ==================");
	}

	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
		return transactions;
	}

	// Tìm các giao dịch theo một năm cụ thể
	private static List<Transaction> getTransactionsInYear(List<Transaction> transactions, int year) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getYear() == year) {
				result.add(transaction);
			}
		}
		return result;
	}

	// Sắp xếp các giao dịch theo giá trị
	private static void sortTransactionsByValue(List<Transaction> transactions) {
		transactions.sort(Comparator.comparingInt(Transaction::getValue));
	}

	// Tìm các giao dịch có số tiền lớn hơn số tiền được chỉ định
	private static List<Transaction> getHighValueTransactions(List<Transaction> transactions, int value) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (transaction.getValue() > value) {
				result.add(transaction);
			}
		}
		return result;
	}

	// Sắp xếp các giao dịch theo "thành phố"
	private static void sortTransactionsByCity(List<Transaction> transactions) {
		transactions.sort(Comparator.comparing(transaction -> transaction.getTrader().getCity()));
	}

	// Tìm các thành phố duy nhất được chỉ định
	private static Set<String> getUniqueCities(List<Transaction> transactions) {
		Set<String> uniqueCities = new HashSet<>();
		for (Transaction transaction : transactions) {
			uniqueCities.add(transaction.getTrader().getCity());
		}
		return uniqueCities;
	}

	// Lấy thông tin người giao dịch từ tên thành phố cụ thể
	private static List<Trader> getTradersFromCity(List<Transaction> transactions, String city) {
		List<Trader> result = new ArrayList<>();
		for (Transaction transaction : transactions) {
			if (city.equals(transaction.getTrader().getCity())) {
				result.add(transaction.getTrader());
			}
		}
		return result;
	}

	// Sắp xếp người giao dịch theo thứ tự giảm dần
	private static void sortTradersByNameDesc(List<Trader> traders) {
		traders.sort(Comparator.comparing(Trader::getName).reversed());
	}

	// Sắp xếp người giao dịch theo bảng chữ cái
	private static String getAllTraderNamesSorted(List<Transaction> transactions) {
		Set<String> allNames = new TreeSet<>();
		for (Transaction transaction : transactions) {
			allNames.add(transaction.getTrader().getName());
		}
		return String.join(", ", allNames);
	}

	// Kiếm tra người giao dịch có ở trong thành phố hay không
	private static boolean anyTradersInCity(List<Transaction> transactions, String city) {
		for (Transaction transaction : transactions) {
			if (city.equals(transaction.getTrader().getCity())) {
				return true;
			}
		}
		return false;
	}

	// Đếm số lượng người giao dịch ở trong một thành phố cụ thể
	private static long countTradersInCity(List<Transaction> transactions, String city) {
		long count = 0;
		for (Transaction transaction : transactions) {
			if (city.equals(transaction.getTrader().getCity())) {
				count++;
			}
		}
		return count;
	}

	// In giá trị giao dịch theo thông tin người giao dịch
	private static void printTransactionValuesFromCity(List<Transaction> transactions, String city) {
		for (Transaction transaction : transactions) {
			if (city.equals(transaction.getTrader().getCity())) {
				System.out.println(transaction.getValue());
			}
		}
	}

	// Tìm giá trị giao dịch cao nhất.
	private static int getHighestTransactionValue(List<Transaction> transactions) {
		int highestValue = Integer.MIN_VALUE;
		for (Transaction transaction : transactions) {
			highestValue = Math.max(highestValue, transaction.getValue());
		}
		return highestValue;
	}

}
