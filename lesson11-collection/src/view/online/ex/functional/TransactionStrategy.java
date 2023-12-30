package view.online.ex.functional;

import Bean.Transaction;

@FunctionalInterface
public interface TransactionStrategy {
	boolean filter(Transaction transaction);
}
