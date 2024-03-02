package quartz_scheduler;

import java.util.List;

import bean.BankTransaction;
import model.DataModel;

public class Ex01Demo {

	public static void main(String[] args) {
		// Lập lịch vào 23h hằng ngày, kiểm tra xem hệ thống có giao dịch nào bị lỗi
		
		List<BankTransaction> transactions = DataModel.mockBankTransactions();
		
		List<BankTransaction> failTransactions = transactions.stream()
				.filter(t -> !t.getIsSuccess())
				.toList();
		
		System.out.println("=== Những giao dịch bị lỗi ===");
		failTransactions.forEach(System.out::println);
		
		
	}
	
}
