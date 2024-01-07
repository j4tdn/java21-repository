package view.online.exercises;

import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;

public class Ex01TransactionApp {

	public static void main(String[] args) {
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
		var inventory = getTransactions();
		System.out.println("\n1. Find all transactions in the year 2011 and sort them by value (small to high)\n");
		
		var trans2021  = filter(inventory, t -> t.getYear() == 2011);
		generate("Find all transactions in the year 2011", trans2021);

		
		trans2021.sort(Comparator.comparingInt(t -> t.getValue()));
		
		generate("Sort them by value (small to high)", trans2021);
				
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("\n2.Find all transactions have value greater than 300 and sort them by trader’s city \n");
		
		var transGreaterThan300 = filter(inventory, t -> t.getValue() > 300);
		generate("Transactions have value greater than 300", transGreaterThan300);
		
		transGreaterThan300.sort(Comparator.comparing(t -> t.getValue()));
		generate("Sort them by trader’s city", transGreaterThan300);
		
		//3. What are all the unique cities where the traders work?
		System.out.println("\n3.What are all the unique cities where the traders work? \n");
		Set<String> uniqueCities = new HashSet<>();
		for (Transaction transaction : inventory) {
			uniqueCities.add(transaction.getTrader().getCity());
		}
		generate("The unique cities where the traders work?", uniqueCities);
		

		//4. Find all traders from Cambridge and sort them by name desc.
		
		var tradersFromCamridge = filter(inventory, t ->t.getTrader().getCity().equalsIgnoreCase("Cambridge"));
		generate("\n4.Find all traders from Cambridge and sort them by name desc", tradersFromCamridge);
		
		//5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("\n5.Traders’ names sorted alphabetically \n");
		Set<String> sortNames = new TreeSet<>();
		for (Transaction transaction : inventory) {
			sortNames.add(transaction.getTrader().getName());
		}
		//6. Are any traders based in Milan?
		var traderInMilan = filter(inventory, t -> "Milan".equalsIgnoreCase(t.getTrader().getCity()));
		generate("6. Traders based in Milan", traderInMilan);
		
		
		//7. Count the number of traders in Milan.
		int size = traderInMilan.size();
		System.out.println("7. Count the number of traders in Milan: " +size);
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		var traderInCambridge = filter(inventory, t -> "Cambridge".equalsIgnoreCase(t.getTrader().getCity()));
		generate("8. traders living in Cambridge", traderInCambridge);
		
		//9. What’s the highest value of all the transactions?
		
		//10. Find the transaction with the smallest value.
	}

	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = List.of(new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));

		return transactions;
	}

	public static <T> List<T> filter(List<T> elements, Predicate<T> predicate) {
		var result = new ArrayList<T>();

		for (var element : elements) {
			if (predicate.test(element)) {
				result.add(element);
			}
		}

		return result;
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
	
}