package quartz_scheduler;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import bean.BankTransaction;
import model.DataModel;

public class FailedTransactionJob implements Job {

	// Hàm excecute(...) sẽ được thực thi khiđến thời gian, thông tin
	// cấu hình trong trigger
	
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		List<BankTransaction> failTransactions = DataModel.mockBankTransaction()
					.stream()
					.filter(t -> !t.getisSuccess())
					.toList();
		
		System.out.println("=== Những giao dịch bị lỗi");
		failTransactions.forEach(System.out::println);
		
	}

	
}
