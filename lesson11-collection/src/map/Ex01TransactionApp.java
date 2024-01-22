package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import bean.Trader;
import bean.Transaction;
import static java.util.Comparator.*;

import java.time.chrono.MinguoChronology;

public class Ex01TransactionApp {
	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();

		System.out.println("--- ___ * START * ___ ---");

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		List<Transaction> result = new ArrayList<>();
		System.err.println("1. All transactions in the year 2011 and sort them by value (small to high): ");
		for (Transaction transaction : transactions) {
			if (transaction.getYear() == 2011) {
				result.add(transaction);
			}
		}
		Collections.sort(result, comparing(Transaction::getValue));
		result.forEach(System.out::println);
		System.out.println();

		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		List<Transaction> resultValue = new ArrayList<>();
		System.err.println("2. All transactions have value greater than 300 and sort them by trader's City: ");
		for (Transaction transaction : transactions) {
			if (transaction.getValue() > 300) {
				resultValue.add(transaction);
			}
		}
		Collections.sort(resultValue, comparing(transaction -> transaction.getTrader().getCity()));
		resultValue.forEach(System.out::println);
		System.out.println();

		// 3. What are all the unique cities where the traders work?
		Set<String> uniqueCities = new HashSet<>();
		System.err.println("3. All the unique cities where the traders work: ");
		for (Transaction transaction : transactions) {
			uniqueCities.add(transaction.getTrader().getCity());
		}
		uniqueCities.forEach(System.out::println);
		System.out.println("\n");

		// 4. Find all the traders from Cambridge and sort them by name desc.
		List<Transaction> resultTrader = new ArrayList<>();
		System.err.println("4. All the traders from Cambridge and sort them by name desc: ");
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals("Cambridge")) {
				resultTrader.add(transaction);
			}
		}
		Collections.sort(resultTrader, comparing(t1->t1.getTrader().getName(),reverseOrder()));
		resultTrader.forEach(System.out::println);
		System.out.println();

		// 5. Return a string of all traders’ names sorted alphabetically.

		Set<String> traderNames = new TreeSet<>();
		System.err.println("5. All traders’ names sorted alphabetically: ");
		for (Transaction transaction : transactions) {
			traderNames.add(transaction.getTrader().getName());
		}
		traderNames.forEach(System.out::println);
		System.out.println();

		// 6. Are any traders based in Milan?
		boolean traderMilan = false;
		System.err.print("6. Are any traders based in Milan ? : ");
		for (Transaction transaction : transactions) {
			if (transaction.getTrader().getCity().equals("Milan")) {
				traderMilan = true;
				System.out.print(traderMilan + ": ");
				System.out.println(transaction.getTrader().getName());
				break;
			}
		}
		System.out.println();

		// 7. Count the number of traders in Milan.
		int tradersInMilanCount = 0;
		Set<String> milanTraders = new HashSet<>();
		System.err.print("7. Count the number of traders in Milan: ");
		for (Transaction transaction : transactions) {
			Trader trader = transaction.getTrader();
			if ("Milan".equals(trader.getCity()) && !(milanTraders.contains(trader.getName()))) {
				tradersInMilanCount++;
				milanTraders.add(trader.getName());
			}
		}
		System.out.println(tradersInMilanCount + ": " + milanTraders);
		System.out.println();

		// 8. Print all transactions’ values from the traders living in Cambridge.
		System.err.print("8. All transactions’ values from the traders living in Cambridge: ");
		for (Transaction transaction : transactions) {
			Trader trader = transaction.getTrader();
			if ("Cambridge".equals(trader.getCity())) {
				System.out.print(transaction.getValue()+" ");
			}
		}
		System.out.println("\n");

		// 9. What’s the highest value of all the transactions?
		int maxValue = Integer.MIN_VALUE;
		System.err.print("9. Highest value of all the transactions: ");
		for(Transaction transaction : transactions) {
			maxValue = Math.max(maxValue, transaction.getValue());
		}
		System.out.println(maxValue);
		System.out.println();
		

		// 10. Find the transaction with the smallest value.
		Transaction smallTransaction = null;
		System.err.print("10. Transaction with the smallest value: ");
		for(Transaction transaction : transactions) {
			if(smallTransaction == null || transaction.getValue() < smallTransaction.getValue()) {
				smallTransaction = transaction;
			}
		}
			if(smallTransaction != null) {
				System.out.println(smallTransaction);
			}
			System.out.println(); 
		
		System.out.println("--- ___ * FINISH * ___ ---");
}

	public static List<Transaction> getTransactions() {
		// traders
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		// transactions
		List<Transaction> transactions = List.of(new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
		return transactions;
	}

	public static void printSeparator() {
		System.out.println("-------------------------------");
	}

}
