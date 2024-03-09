package quartz_scheduler;

import model.Datamodel;

public class Ex01Demo {
	public static void main(String[] args) {
		// Lập lịch vào 23h hàng ngày, kiểm tra xem hệ thống có giao dịch nào bị lỗi
		var transactions = Datamodel.mockBankTransactions();
		
		var failTransactions = transactions.stream()
					.filter(t -> !t.isSuccess())
					.toList();
		
		System.out.println("Những giao dịch bị fail");
		failTransactions.forEach(System.out::println);
	}
}
