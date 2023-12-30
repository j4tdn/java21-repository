package view.online.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class Ex01TransactionApp {

	public static void main(String[] args) {
		
		List<Transaction> transactions = getTransactions();
		
		System.out.println("---___ * START * ___---");
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> transactionsIn2011 = transactions.stream()
								.filter(transaction -> transaction.getYear() == 2011)
								.sorted(Comparator.comparing(Transaction::getValue))
								.collect(Collectors.toList());
		System.out.println("1. " + transactionsIn2011);
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> transactionWithValueOver300 = transactions.stream()
								.filter(transaction -> transaction.getValue() > 300)
								.sorted(Comparator.comparing(transaction -> transaction.getTrader().getCity()))
								.collect(Collectors.toList());
		System.out.println("2. " + transactionWithValueOver300);						
		// 3. What are all the unique cities where the traders work?
		Set<String> uniqueCity = transactions.stream()
								.map(transaction -> transaction.getTrader().getCity())
								.collect(Collectors.toSet());
		System.out.println("3. " + uniqueCity);
		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> traderFromCambridge = transactions.stream()
								.map(Transaction::getTrader)
								.filter(trader -> trader.getCity().equals("Cambridge"))
								.sorted(Comparator.comparing(Trader::getName).reversed())
								.collect(Collectors.toList());
		System.out.println("4. " + traderFromCambridge);
		// 5. Return a string of all traders’ names sorted alphabetically.
		String allTrader = transactions.stream()
					.map(transaction -> transaction.getTrader().getName())
					.distinct()
					.sorted()
					.collect(Collectors.joining(", "));
		System.out.println("5. " + allTrader);
		// 6. Are any traders based in Milan?
		boolean anyTraderInMilan = transactions.stream()
					.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
		System.out.println("6. " + anyTraderInMilan);
		// 7. Count the number of traders in Milan.
		long numberOfTraderInMilan = transactions.stream()
					.filter(transaction -> transaction.getTrader().getCity().equals("Milan"))
					.count();
		System.out.println("7. " + numberOfTraderInMilan);
		// 8. Print all transactions’ values from the traders living in Cambridge.
		transactions.stream()
			.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
			.map(Transaction::getValue)
			.forEach(System.out::println);
		// 9. What’s the highest value of all the transactions?
		// 10. Find the transaction with the smallest value.
		
		System.out.println("---___ * END * ___---");
		
	}
	
	public static List<Transaction> getTransactions() {
		// Trader
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		// Transaction
		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000), 
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2012, 710), 
			new Transaction(mario, 2012, 700), 
			new Transaction(alan, 2012, 950)
		);
		return transactions;
	}
}
