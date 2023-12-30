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

public class Ex01TransactionApp {
	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();

		System.out.println("--- ___ * START * ___ ---");

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		List<Transaction> result1 = new ArrayList<>();
		for (Transaction transaction : transactions) {
		    if (transaction.getYear() == 2011) {
		        result1.add(transaction);
		    }
		}
		Collections.sort(result1, Comparator.comparing(Transaction::getValue));
		result1.forEach(System.out::println);
		System.out.println();
		
		 


		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		
		List<Transaction> result2 = new ArrayList<>();
		for (Transaction transaction : transactions) {
		    if (transaction.getValue() > 300) {
		        result2.add(transaction);
		    }
		}
		Collections.sort(result2, Comparator.comparing(transaction -> transaction.getTrader().getCity()));
		result2.forEach(System.out::println);
		System.out.println();
		


		// 3. What are all the unique cities where the traders work?
		Set<String> uniqueCities = new HashSet<>();
		for (Transaction transaction : transactions) {
		    uniqueCities.add(transaction.getTrader().getCity());
		}
		for (String city : uniqueCities) {
		    System.out.println(city);
		    
		}
		System.out.println();


		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> cambridgeTraders = new ArrayList<>();
		for (Transaction transaction : transactions) {
		    Trader trader = transaction.getTrader();
		    if ("Cambridge".equals(trader.getCity()) && !cambridgeTraders.contains(trader)) {
		        cambridgeTraders.add(trader);
		    }
		}
		Collections.sort(cambridgeTraders, Comparator.comparing(Trader::getName).reversed());
		cambridgeTraders.forEach(System.out::println);
		System.out.println();
		


		// 5. Return a string of all traders’ names sorted alphabetically.
		
		Set<String> traderNames = new TreeSet<>();
		for (Transaction transaction : transactions) {
		    traderNames.add(transaction.getTrader().getName());
		}
		String result5 = String.join(", ", traderNames);
		System.out.println(result5);
		System.out.println();


		// 6. Are any traders based in Milan?
		boolean anyTradersInMilan = false;
		for (Transaction transaction : transactions) {
		    if ("Milan".equals(transaction.getTrader().getCity())) {
		        anyTradersInMilan = true;
		        break;
		    }
		}
		System.out.println(anyTradersInMilan);
		System.out.println();

		// 7. Count the number of traders in Milan.
		int tradersInMilanCount = 0;
		Set<String> milanTraders = new HashSet<>();
		for (Transaction transaction : transactions) {
		    Trader trader = transaction.getTrader();
		    if ("Milan".equals(trader.getCity()) && !milanTraders.contains(trader.getName())) {
		        tradersInMilanCount++;
		        milanTraders.add(trader.getName());
		    }
		}
		System.out.println(tradersInMilanCount);
		System.out.println();

		

		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		for (Transaction transaction : transactions) {
		    Trader trader = transaction.getTrader();
		    if ("Cambridge".equals(trader.getCity())) {
		        System.out.println(transaction.getValue());
		    }
		}
		System.out.println();
		// 9. What’s the highest value of all the transactions?
		
		int highestValue = Integer.MIN_VALUE;
		for (Transaction transaction : transactions) {
		    highestValue = Math.max(highestValue, transaction.getValue());
		}
		System.out.println(highestValue);
		System.out.println();


		// 10. Find the transaction with the smallest value.
		Transaction smallestTransaction = null;
		for (Transaction transaction : transactions) {
		    if (smallestTransaction == null || transaction.getValue() < smallestTransaction.getValue()) {
		        smallestTransaction = transaction;
		    }
		}
		if (smallestTransaction != null) {
		    System.out.println(smallestTransaction);
		}

		

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
