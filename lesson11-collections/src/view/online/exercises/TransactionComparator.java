package view.online.exercises;

import java.util.Comparator;

import bean.Transaction;

public class TransactionComparator implements Comparator<Transaction> {
	public int compare(Transaction t1, Transaction t2) {
		return t1.getValue() - t2.getValue();
	}
}
