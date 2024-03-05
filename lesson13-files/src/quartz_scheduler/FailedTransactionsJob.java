package quartz_scheduler;

import java.time.LocalDateTime;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import model.DataModel;

public class FailedTransactionsJob implements Job {
	
	// Hàm execute(..) sẽ được thực thi khi đến thời gian, thông tin
	// cấu hình trong trigger
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		var failTransactions = DataModel.mockBankTransactons()
										.stream()
										.filter(t -> !t.getIsSuccess())
										.toList();
		
		System.out.println("=== Những giao dịch bị lỗi(" + LocalDateTime.now() + ") ===");
		failTransactions.forEach(System.out::println);
	}
	
}
