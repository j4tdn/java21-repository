package view.online.exercise;

import static java.util.Comparator.comparing;
import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class Ex01TransactionApp {

	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();

		System.out.println("--- ___ * START * ___ ---");

		generate("1. Find all transactions in the year 2011 and sort them by value (small to high)",
				transactions.stream()
		         .filter(t -> t.getYear() == 2011)
		         .sorted(comparing(Transaction::getValue))
		         .toList());
		
		System.out.println("================================================");
		
		// Transaction -> Trader --> City 
		
		// Comparator<Transaction> = t -> t.getValue() = Transaction::getValue
		// Comparator<Transaction> = t -> t.getTrader().getCity()

		generate("2. Find all transactions have value greater than 300 and sort them by trader’s city",
				transactions.stream()
		         .filter(t -> t.getValue() > 300)
		         .sorted(comparing(t -> t.getTrader().getCity()))
		         .toList());

		System.out.println("================================================");
		
		generate("3. What are all the unique cities where the traders work?",
				transactions.stream()
		         .map(t -> t.getTrader().getCity())
		         .collect(Collectors.toSet()));
		
		System.out.println("================================================");

		generate("4. Find all traders from Cambridge and sort them by name desc",
				transactions.stream()
				          .map(Transaction::getTrader)
		                  .filter(t -> t.getCity().equals("Cambridge"))
		                  .sorted(comparing(Trader::getName).reversed())
		                  .collect(Collectors.toSet()));
		
		System.out.println("================================================");
		
		System.out.println("\n5. Return a string of all traders’ names sorted alphabetically\n");
		System.out.println(
				transactions.stream()
				          .map(t -> t.getTrader().getName())
				          .distinct()
				          .sorted()
		                  .collect(Collectors.joining(", ")));
		
		System.out.println("================================================");

		System.out.println("\n6. Are any traders based in Milan?\n" +
				transactions.stream()
		                 .anyMatch(t -> t.getTrader().getCity().equals("Milan")));
		
		System.out.println("================================================");

		System.out.println("\n7. Count the number of traders in Milan\n" +
				transactions.stream()
		                 .filter(t -> t.getTrader().getCity().equals("Milan"))
		                 .map(Transaction::getTrader)
		                 .distinct()
		                 .count());

		System.out.println("================================================");
		
		generate("8. Print all transactions’ values from the traders living in Cambridge",
				transactions.stream()
				          .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
				          .map(Transaction::getValue)
				          .toList());
		
		System.out.println("================================================");
		
		System.out.println("\n9. What’s the highest value of all the transactions?\n");
		    transactions.stream()
					.mapToInt(Transaction::getValue)
					.max()
					.ifPresentOrElse(System.out::println,
							         () -> System.out.println("Max not found"));
		
		System.out.println("================================================");
		
		// nếu có nhiều hơn 1 transaction có smallest value trùng nhau
		
		// 1 --> lấy tất cả in ra
		
		// 2 --> dựa vào 1 thuộc tính khác khi smallest value trùng nhau để lấy duy nhất 1 transaction
		
		System.out.println("\n10. Find the transaction with the smallest value.\n");
		OptionalInt minValue = transactions.stream()
				                         .mapToInt(Transaction::getValue)
				                         .min();
		if(minValue.isPresent()) {
			generate("10. Find the transaction with the smallest value.",
					transactions.stream()
					           .filter(t -> t.getValue() == minValue.getAsInt())
					           .toList());
		} else {
			System.out.println("\n10. Find the transaction with the smallest value. --> Not found\n");
		}
		
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
				new Transaction(mario, 2019, 110), 
				new Transaction(mario, 2012, 110),
				new Transaction(alan, 2012, 950));
		return transactions;
	}
}
