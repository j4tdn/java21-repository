package quartz_scheduler;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import model.DataModel;

public class FailedTransactionsJob implements Job{

	// Hàm execute(...) sẽ được thực thi khi đến thời gian, thông tin
	// Cấu hình trong trigger
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		var failTransactions = DataModel.mockBankTransactions()
										.stream()
										.filter(t -> !t.getIsSuccess())
										.toList();
		
	}

}
