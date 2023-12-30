package view.online.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Bean.Trader;
import Bean.Transaction;

public class Ex01TransactionApp {

	public static void main(String[] args) {

		List<Transaction> transactions = getTransactions();

		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		System.out.println("Câu 1:");
		List<Transaction> result = getTrsInYearAndSort(transactions, 2011);

		for (Transaction transaction : result) {
			System.out.println(transaction);
		}
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("Câu 2:");
		List<Transaction> result2 = getTrsGreaterThan300AndSort(transactions, 300);

		for (Transaction transaction : result2) {
			System.out.println(transaction);
		}
		// 3. What are all the unique cities where the traders work?
		// 4. Find all traders from Cambridge and sort them by name desc.
		// 5. Return a string of all traders’ names sorted alphabetically.
		// 6. Are any traders based in Milan?
		// 7. Count the number of traders in Milan.
		// 8. Print all transactions’ values from the traders living in Cambridge.
		// 9. What’s the highest value of all the transactions?
		// 10. Find the transaction with the smallest value.


	}
	
	// filter And Sort Strategy
//    public static List<Transaction> filterAndSort(List<Transaction> transactions, TransactionStrategy strategy) {
//        List<Transaction> result = new ArrayList<>();
//
//        for (Transaction transaction : transactions) {
//            if (strategy.filter(transaction)) {
//                result.add(transaction);
//            }
//        }
//
//        Collections.sort(result, Comparator.comparing(tr -> tr.getTrader().getCity()));
//
//        return result;
//    }

	// Câu 1:
	private static List<Transaction> getTrsInYearAndSort(List<Transaction> transactions, int year) {

		List<Transaction> result = new ArrayList<>();

		for (Transaction transaction : transactions) {
			if (transaction.getYear() == 2011) {
				result.add(transaction);
			}
		}

		Collections.sort(result, Comparator.comparing(Transaction::getValue));

		return result;
	}
	
	// Câu 2:
	private static List<Transaction> getTrsGreaterThan300AndSort(List<Transaction> transactions, int value) {

		List<Transaction> result = new ArrayList<>();

		for (Transaction transaction : transactions) {
			if (transaction.getValue() > 300) {
				result.add(transaction);
			}
		}

		Collections.sort(result, Comparator.comparing(tr -> tr.getTrader().getCity()));

		return result;
	}
	
	// print Result
	private static void printResult(List<Transaction> result) {
        for (Transaction transaction : result) {
            System.out.println(transaction);
        }
    }

	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		// Transaction
		List<Transaction> transactions = List.of(
							new Transaction(brian, 2011, 300), 
							new Transaction(raoul, 2012, 1000),
							new Transaction(raoul, 2011, 400), 
							new Transaction(mario, 2012, 710), 
							new Transaction(mario, 2012, 700),
							new Transaction(alan, 2012, 950));
		return transactions;
	}

}
