package view.online.exercises;

import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Trader;
import bean.Transaction;
public class Ex01TransactionApp {
	
	public static void main(String[] args) {
		
		List<Transaction> transactions = getTransactions();
		
		System.out.println("--- ___ * START * ___ ---");
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> transactionsIn2011 = new ArrayList<>();
		for(Transaction transaction: transactions) {
			if(transaction.getYear() == 2011) {
				transactionsIn2011.add(transaction);
			}
		}

		generate("1. Transaction in 2021", transactionsIn2011);
			
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> highValueTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getValue() > 300) {
                highValueTransactions.add(transaction);
            }
        }
        
        generate("2. High value transactions sorted by trader's city", highValueTransactions);
		
		// 3. What are all the unique cities where the traders work?
        Set<String> uniqueCities = new HashSet<>();
        for (Transaction transaction : transactions) {
            uniqueCities.add(transaction.getTrader().getCity());
        }
        generate("3. Unique cities where traders work", uniqueCities);
        
		// 4. Find all traders from Cambridge and sort them by name desc.
        List<Trader> tradersInCambridge = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if ("Cambridge".equals(transaction.getTrader().getCity())) {
                tradersInCambridge.add(transaction.getTrader());
            }
        }
        generate("4. Traders in Cambridge sorted by name (desc)", tradersInCambridge);
        
        
		// 5. Return a string of all traders’ names sorted alphabetically.
		
        
		// 6. Are any traders based in Milan?
		
		// 7. Count the number of traders in Milan.
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		// 9. What’s the highest value of all the transactions?
		
		// 10. Find the transaction with the smallest value.
		
		System.out.println("--- ___ * FINISH * ___ ---");
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
			new Transaction(mario, 2012, 710), 
			new Transaction(mario, 2012, 700), 
			new Transaction(alan, 2012, 950)
		);
		return transactions;
	}
	
}