package view.online.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Comparator. *;
import java.util.List;

import bean.Trader;
import bean.Transaction;
import functional.TransactionCondition;

import static utils.CollectionUtils. *;

public class Ex01TransactionApp {
	public static void main(String[] args) {
		List<Transaction> transactions = getTransactions();
		List<Trader> traders = getTraders();
		/*
		1. Find all transactions in the year 2011 and sort them by value (small to high).
		
		2. Find all transactions have value greater than 300 and sort them by trader’s city
		
		3. What are all the unique cities where the traders work?
		
		4. Find all traders from Cambridge and sort them by name desc.
		
		5. Return a string of all traders’ names sorted alphabetically.
		
		6. Are any traders based in Milan?
		
		7. Count the number of traders in Milan.
		
		8. Print all transactions’ values from the traders living in Cambridge.
		
		9. What’s the highest value of all the transactions?
		
		10. Find the transaction with the smallest value.
		 */
		
		System.out.println("--- ___* START  *___ ---");
		// 1. Find all transactions in the year 2011 and sort them by value (small to high) function
		List<Transaction> transactions1 = find(transactions, t -> t.getYear()==2011);
		transactions1.sort(comparing(Transaction::getValue));
		generate("1. All transactions in the year 2011 and sort them by value ", transactions1);
		
		// 2.Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> transactions2 = find(transactions, t -> t.getValue()>300);
		transactions2.sort(comparing((Transaction t) -> t.getTrader().getCity()));
		generate("2. All transactions have value greater than 300 and sort them by trader’s city ", transactions2);
		
		// 3. What are all the unique cities where the traders work?
		List<String> uniqueCity = findUniqueCity(transactions);
		generate("3. What are all the unique cities where the traders work?", uniqueCity);
		// 4. Find all traders from Cambridge and sort them by name desc
		List<Transaction> transactions4 = find(transactions, t -> t.getTrader().getCity().compareTo("Cambridge")==0);
		transactions4.sort(comparing((Transaction t) -> t.getTrader().getName(), reverseOrder()));
		generate("4. All traders from Cambridge and sort them by name desc", transactions4);
		System.out.println("--- ___* FINISH *___ ---");
		// 5. Return a string of all traders’ names sorted alphabetically
		List<String> uniqueName = findUniqueName(transactions);
		uniqueName.sort(new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			};
		});
		generate("5. String of all traders’ names sorted alphabetically", uniqueName);
		// 6. Are any traders based in Milan?
		System.out.println("6. Are any traders based in Milan ? --> " + checkCityMilan(uniqueCity));
		// 7. Count the number of traders in Milan
		System.out.println("7. the number of traders in Milan --> " + countTraderOfMilan(traders));
		// 8. Print all transactions’ values from the traders living in Cambridge
		List<Transaction> transactions8 = findTransactionOfCambride(transactions);
		List<Integer> cambridgeValues = getValueOfCambridge(transactions8);
		generate("8. all transactions’ values from the traders living in Cambridge", cambridgeValues);
		// 9. What’s the highest value of all the transactions?
		System.out.println("the highest value of all the transactions --> " + highestValueOfTransaction(transactions));
		// 10. Find the transaction with the smallest value.
		List<Transaction> transaction10 = new ArrayList<>();
		transaction10 = smallestTransaction(transactions);
		generate("10. the transaction with the smallest value ", transaction10);
	}
	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = new ArrayList<>(List.of(
		        new Transaction(brian, 2011, 300),
		        new Transaction(raoul, 2012, 1000), 
		        new Transaction(raoul, 2011, 400),
		        new Transaction(mario, 2012, 710), 
		        new Transaction(mario, 2012, 700), 
		        new Transaction(alan, 2012, 950)
		    ));
		return transactions;
	}
	public static List<Trader> getTraders() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Trader> traders = List.of(raoul, mario, alan, brian);
		return traders;
	}
	
	public static List<Transaction> find(List<Transaction> transactions, TransactionCondition test){
		var newTransaction = new ArrayList<Transaction>();
		for(var transaction : transactions) {
			if(test.test(transaction)) {
				newTransaction.add(transaction);
			}
		}
		return newTransaction;
	}
	
	public static List<String> findUniqueCity(List<Transaction> transactions){
		var uniqueCity = new ArrayList<String>();
		for(var transaction : transactions) {
			String city = transaction.getTrader().getCity();
			if(!uniqueCity.contains(city)) {
				uniqueCity.add(city);
			}
		}
		return uniqueCity;
	}
	
	public static List<String> findUniqueName(List<Transaction> transactions){
		var uniqueName = new ArrayList<String>();
		for(var transaction : transactions) {
			String name = transaction.getTrader().getName();
			if(!uniqueName.contains(name)) {
				uniqueName.add(name);
			}
		}
		return uniqueName;
	}
	public static boolean checkCityMilan(List<String> cities) {
		for(String city : cities) {
			if(city.compareTo("Milan")!=0) {
				return false;
			}
		}
		return true;
	}
	
	public static int countTraderOfMilan(List<Trader> traders) {
		int count = 0;
		for(var transaction : traders) {
			if(transaction.getCity().compareTo("Milan") == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static List<Transaction> findTransactionOfCambride(List<Transaction> transactions){
		List<Transaction> newTransactions = new ArrayList<>();
		for(var transaction : transactions) {
			if(transaction.getTrader().getCity().compareTo("Cambridge")==0) {
				newTransactions.add(transaction);
			}
		}
		return newTransactions;
	}
	
	public static List<Integer> getValueOfCambridge(List<Transaction> transactions){
		List<Integer> values = new ArrayList<>();
		for(var transaction : transactions) {
			values.add(transaction.getValue());
		}
		return values;
	}
	
	public static int highestValueOfTransaction(List<Transaction> transactions) {
		int max = 0;
		for(var transaction : transactions) {
			int currentValue = transaction.getValue();
			if(currentValue>max) {
				max = currentValue;
			}
		}
		return max;
	}
	
	public static List<Transaction> smallestTransaction(List<Transaction> transactions) {
		if (transactions.isEmpty()) {
	        return Collections.emptyList(); // Trả về danh sách rỗng nếu không có giao dịch nào
	    }
		transactions.sort(comparing(Transaction::getValue));
		List<Transaction> minTransaction = new ArrayList<>();
		minTransaction.add(transactions.get(0));
		return minTransaction;
	}
	
}
