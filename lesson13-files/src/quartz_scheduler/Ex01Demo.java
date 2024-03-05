package quartz_scheduler;

import java.util.List;

import bean.BankTransaction;
import model.DataModel;

public class Ex01Demo {

	public static void main(String[] args) {
		// Lập lịch vào 23h hằng ngày, kiểm tra xem hệ thống có gia dịch trong khoảng thời gian này


		List<BankTransaction> transations = DataModel.mockBankTransaction();

		List<BankTransaction> failTransactions = transations.stream().filter(t -> !t.getIsSuccess()).toList();

		System.out.println("Nhưng cái bị lỗi :");
		failTransactions.forEach(System.out::println);

	}

}
