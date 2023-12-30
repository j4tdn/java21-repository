package view.online.exercises;

import static utils.CollectionUtils.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Trader;
import bean.Transaction;
import functional.TransactionFilter;

public class Ex01TransactionApps {
	public static void main(String[] args) {
		List<Transaction> transactions = getTransactions();
		System.out.println("--- ___ * START * ___ ---");
		TransactionFilter filter2011 = transaction -> transaction.getYear() == 2011;
		TransactionFilter filterValueGreaterThan300 = transaction -> transaction.getValue() > 300;

		Comparator<Transaction> sortByValue = Comparator.comparingInt(Transaction::getValue);
		
//		1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> query1 = filterAndSortTransactions(transactions, filter2011, sortByValue);
		generate("1. Trans 2011 sorted by value ", query1);
//		2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> query2 = filterAndSortTransactions(transactions, filterValueGreaterThan300, sortByValue);
		generate("1. Trans 2011 sorted by value ", query2);
//		3. What are all the unique cities where the traders work?
//		4. Find all traders from Cambridge and sort them by name desc.
//		5. Return a string of all traders’ names sorted alphabetically.
//		6. Are any traders based in Milan?
//		7. Count the number of traders in Milan.
//		8. Print all transactions’ values from the traders living in Cambridge.
//		9. What’s the highest value of all the transactions?
//		10. Find the transaction with the smallest value.

		System.out.println("--- ___ * END * ___ ---");
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

	// 1
//    private static List<Transaction> getTrans2011SortedByValue(List<Transaction> transactions) {
//        List<Transaction> newList = new ArrayList<>();
//        for (Transaction transaction : transactions) {
//            if (transaction.getYear() == 2011) {
//            	newList.add(transaction);
//            }
//        }
//        Collections.sort(newList, Comparator.comparingInt(Transaction::getValue));
//        return newList;
//    }

	
	
	private static List<Transaction> filterAndSortTransactions(
	        List<Transaction> transactions,
	        TransactionFilter filter,
	        Comparator<Transaction> comparator) {
	    List<Transaction> filteredList = new ArrayList<>();

	    for (Transaction transaction : transactions) {
	        if (filter.test(transaction)) {
	            filteredList.add(transaction);
	        }
	    }

	    filteredList.sort(comparator);

	    return filteredList;
	}

	//
}
