package view.online.exercise;

import static java.util.Comparator.reverseOrder;
import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;

public class Ex01TransactionApp {

	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();

		System.out.println("--- ___ * START * ___ ---");

		System.out.println("\n1. Find all transactions in the year 2011 and sort them by value (small to high)\n");
		List<Transaction> transIn2011 = findAllTransaction(transactions, t -> t.getYear() == 2011);
		generate("--> All transactions in the year 2011", transIn2011);

		transIn2011.sort(Comparator.comparingInt(t -> t.getValue()));
		System.out.println();
		
		generate("--> Sort by value (small to high)", transIn2011);
		
		System.out.println("\n================================================\n");

		System.out.println("\n2. Find all transactions have value greater than 300 and sort them by trader’s city\n");
		List<Transaction> transValueGreater300 = findAllTransaction(transactions, t -> t.getValue() > 300);
		generate("--> All transactions have value greater than 300", transValueGreater300);
		
		transValueGreater300.sort(Comparator.comparing(t -> t.getTrader().getCity()));
		generate("--> Sort by trader’s city", transValueGreater300);

		System.out.println("\n================================================\n");
		
		// 3. What are all the unique cities where the traders work?

		System.out.println("\n4. Find all traders from Cambridge and sort them by name desc\n");
		List<Transaction> tradersFromCambridge = findAllTransaction(transactions, t -> t.getTrader().getCity().equals("Cambridge"));
		generate("--> All traders from Cambridge", tradersFromCambridge);
		
		tradersFromCambridge.sort(Comparator.comparing(t -> t.getTrader().getName(), reverseOrder()));
		
		generate("--> Sort by name desc", tradersFromCambridge);
		
		System.out.println("\n================================================\n");
		
		// 5. Return a string of all traders’ names sorted alphabetically.

		// 6. Are any traders based in Milan?

		// 7. Count the number of traders in Milan.

		// 8. Print all transactions’ values from the traders living in Cambridge.

		// 9. What’s the highest value of all the transactions?

		// 10. Find the transaction with the smallest value.

		System.out.println("--- ___ * END * ___ ---");
	}

	public static List<Transaction> findAllTransaction(List<Transaction> transactions, Predicate<Transaction> p) {
		List<Transaction> trans = new ArrayList<>();
		for (Transaction t : transactions) {
			if (p.test(t)) {
				trans.add(t);
			}
		}
		return trans;
	}

	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300), 
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400), 
				new Transaction(mario, 2012, 710), 
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
		return transactions;
	}
}
