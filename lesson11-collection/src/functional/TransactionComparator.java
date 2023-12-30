package functional;

import java.util.Comparator;

import bean.Transaction;
@FunctionalInterface
public interface TransactionComparator {
	Comparator<Transaction> getComparator();

}
