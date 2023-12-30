package functional;

import bean.Transaction;

@FunctionalInterface
public interface TransactionFilter {
    boolean test(Transaction transaction);
}
