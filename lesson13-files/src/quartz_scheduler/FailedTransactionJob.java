package quartz_scheduler;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import bean.BankTransaction;
import model.DataModel;

public class FailedTransactionJob implements Job {

	// Hàm execute(...) sẽ được thực thi khi đến thời gian, thông tin, cấu hình
	// trong trigger

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("hello");
		List<BankTransaction> transations = DataModel.mockBankTransaction();
		System.out.println("hello1");
		List<BankTransaction> failTransactions = transations.stream().filter(t -> !t.getIsSuccess()).toList();
		System.out.println("hello2");
		System.out.println("Nhưng giao dịch bị lỗi :");
		failTransactions.forEach(System.out::println);

	}

}
