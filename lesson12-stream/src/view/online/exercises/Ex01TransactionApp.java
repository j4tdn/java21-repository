package view.online.exercises;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

import static java.util.Comparator.*;
import static utils.CollectionUtils.*;

public class Ex01TransactionApp {
	
	public static void main(String[] args) {
		
		List<Transaction> transactions = getTransactions();
		
		System.out.println("--- ___ * START * ___ ---");
				
		generate("1. Find all transactions in the year 2011 and sort them by value (small to high)",
				 transactions.stream()
					.filter(t -> t.getYear() == 2011)
					.sorted(comparing(Transaction::getValue))
					.toList());
		
		// Transaction -> Trader --> City
		
		// Comparator<Transaction> = t -> t.getValue() = Transaction::getValue
		// Comparator<Transaction> = t -> t.getTrader().getCity() x= Transaction::getTrader::getCity
		
		// Function<Transaction, Trader> = Transaction::getTrader
		
		generate("2. Find all transactions have value greater than 300 and sort them by trader’s city",
				 transactions.stream()
					.filter(t -> t.getValue() > 300)
					.sorted(comparing(t -> t.getTrader().getCity()))
					.toList());

		generate("3. What are all the unique cities where the traders work?",
				transactions.stream()
					.map(t -> t.getTrader().getCity())
					.collect(Collectors.toSet()));

		generate("4. Find all traders from Cambridge and sort them by name desc.",
				transactions.stream()
					.map(Transaction::getTrader)
					.filter(t -> "Cambridge".equals(t.getCity()))
					.sorted(comparing(Trader::getName).reversed())
					.collect(Collectors.toSet()));

		System.out.println("5. Return a string of all traders’ names sorted alphabetically = " +
				transactions.stream()
					.map(t -> t.getTrader().getName())
					.distinct()
					.sorted()
					.collect(Collectors.joining(", ")));
		
		System.out.println("6. Are any traders based in Milan = " + 
				transactions.stream()
					.anyMatch(t -> "Milan".equals(t.getTrader().getCity())));
	
		System.out.println("7. Count the number of traders in Milan = " + 
				transactions.stream()
					.filter(t -> "Milan".equals(t.getTrader().getCity()))
					.map(Transaction::getTrader)
					.distinct()
					.count());
		
		generate("8. Print all transactions’ values from the traders living in Cambridge",
				transactions.stream()
					.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
					.map(Transaction::getValue)
					.toList());
		
		transactions.stream()
			.mapToInt(Transaction::getValue)
			.max()
			.ifPresentOrElse(
					val -> System.out.print("9. What’s the highest value of all the transactions = " + val), 
					() -> System.out.println("9. What’s the highest value of all the transactions --> Max Not Found"));
		
		// nếu có nhiều hơn 1 transaction có smallest value trùng nhau
		
		// 1 --> lấy tất cả in ra
		
		// 2 --> dựa vào 1 thuộc tính khác khi smallest value trùng nhau để lấy duy nhất 1 transaction 
		
		OptionalInt minValue = transactions.stream()
				.mapToInt(Transaction::getValue)
				.min();
		
		if (minValue.isPresent()) {
			generate("\n\n10. Find the transaction with the smallest value",
					transactions.stream().filter(t -> t.getValue() == minValue.getAsInt()).toList());
		} else {
			System.out.println("\\n\\n10. Find the transaction with the smallest value --> Not Found");
		}
		
		
		System.out.println("\n--- ___ * FINISH * ___ ---");
	}
	
	public static List<Transaction> getTransactions() {
		// traders
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		// transactions
		List<Transaction> transactions = List.of(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000), 
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2019, 110), 
			new Transaction(mario, 2012, 110), 
			new Transaction(alan, 2012, 950)
		);
		return transactions;
	}
	
}
