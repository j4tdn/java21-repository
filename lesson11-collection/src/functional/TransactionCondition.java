package functional;

import bean.Transaction;

public interface TransactionCondition {
	boolean test(Transaction t);
}
