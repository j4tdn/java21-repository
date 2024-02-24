package Example;

import static java.util.Comparator.*;
import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class Ex01TransactionApp {

	public static void main(String[] args) {
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> transactions = getTransactions();
		System.out.println("\n1. Find all transactions in the year 2011 and sort them by value (small to high)\n");
		transactions.stream()
		.filter(t -> t.getYear() == 2011)
		.sorted(comparing(Transaction::getValue))
		.toList();
		generate("Find all transactions in the year 2011", 
				transactions.stream()
				.filter(t -> t.getYear() == 2011)
				.sorted(comparing(Transaction::getValue))
				.toList());
		
		
		
		transactions.stream()
		.filter(t -> t.getValue() >300)
		.sorted(comparing(t -> t.getTrader().getCity()))
		.toList();
		
				
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("\n2.Find all transactions have value greater than 300 and sort them by trader’s city \n");
		
		generate("Transactions have value greater than 300", 
				transactions.stream()
				.filter(t -> t.getValue() >300)
				.sorted(comparing(t -> t.getTrader().getCity()))
				.toList());
		
		
		//3. What are all the unique cities where the traders work?
		generate("The unique cities where the traders work?",
				
				transactions.stream()
				.map(t -> t.getTrader().getCity())
				.collect(Collectors.toSet()));
		

		//4. Find all traders from Cambridge and sort them by name desc.
		
		generate("4. Find all traders from Cambridge and sort them by name desc.",
				
				transactions.stream()
				.map(Transaction::getTrader)
				.filter(t -> "Cambridge".equalsIgnoreCase(t.getCity()))
				.collect(Collectors.toSet()));
		
		//5. Return a string of all traders’ names sorted alphabetically.
		//System.out.println("\n5.Traders’ names sorted alphabetically \n");
		///Set<String> sortNames = new TreeSet<>();
		//for (Transaction transaction : inventory) {
		//	sortNames.add(transaction.getTrader().getName());
		//}
		System.out.println("5. Return a string of all traders’ names sorted alphabetically =" +
			transactions.stream()
			.map(t ->t.getTrader().getName())
			.distinct()  //loại bỏ các phần tử trùng nhau
			.sorted()
			.collect(Collectors.joining(",")));	
			
		//6. Are any traders based in Milan?
		//var traderInMilan = filter(inventory, t -> "Milan".equalsIgnoreCase(t.getTrader().getCity()));
		//generate("6. Traders based in Milan", traderInMilan);
		System.out.println("6. Are any traders based in Milan: " +
				
				transactions.stream()
				.anyMatch(t ->"Milan".equalsIgnoreCase(t.getTrader().getCity())));
		
		//7. Count the number of traders in Milan.
		
		System.out.println("7. Count the number of traders in Milan: " +
				
				transactions.stream()
				.filter(t -> "Milan".equalsIgnoreCase(t.getTrader().getCity()))
				.distinct()
				.count());
		//int size = traderInMilan.size();
		//System.out.println("7. Count the number of traders in Milan: " +size);
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		//var traderInCambridge = filter(inventory, t -> "Cambridge".equalsIgnoreCase(t.getTrader().getCity()));
		//generate("8. traders living in Cambridge", traderInCambridge);
		generate("8. traders living in Cambridge" ,
				
				transactions.stream()
				.filter(t ->"Cambridge".equalsIgnoreCase(t.getTrader().getCity()))
				.map(Transaction::getValue)
				.toList());
		
		//9. What’s the highest value of all the transactions?
		
			//int max = Integer.MIN_VALUE;
			//for (Transaction t : inventory) {
			//	max = Math.max(max, t.getValue());
		//	}
			//System.out.println("9. the highest value of all the transactions " +max);
	System.out.println("9. the highest value of all the transactions: " +
			transactions.stream()
			.mapToInt(Transaction::getValue)
			.max());
	//cách 2
		transactions.stream()
		.mapToInt(Transaction::getValue)
		.max()
		.ifPresentOrElse(
				val -> System.out.print("9. the highest value of all the transactions:" +val),
				() -> System.out.println("9.Max not found"));
		
		
			//10. Find the transaction with the smallest value.
			
			//int min = Integer.MAX_VALUE;
		//	for (Transaction t :inventory) {
		//		min = Math.min(min, t.getValue());
		//	}
		//	System.out.println("10. transaction with the smallest value " +min);
		OptionalInt minValue = transactions.stream()
				.mapToInt(Transaction::getValue)
				.min();
		if (minValue.isPresent()) {
			generate("10. transaction with the smallest value", 
					transactions.stream()
					.filter(t -> t.getValue() == minValue.getAsInt()).toList());
		} else {
			System.out.println("10.transaction with the smallest value: -> not found");
		}
	}

	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = List.of(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400), 
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
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
	
}