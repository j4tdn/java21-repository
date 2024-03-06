package quartz_scheduler;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import bean.BankTransaction;
import model.DataModel;

public class Ex02QuartzSchedulerDemo {
	
	public static void main(String[] args) throws SchedulerException {
		// Lập lịch vào 23h hàng ngày, kiểm tra xem hệ thống có giao dịch nào bị lỗi
		
		// Lập lịch - scheduler
		// schedule cho Job nào ở thời gian nào
		
		// Thời gian, thời điểm nào
		//    VD: Thứ 5 hàng tuần
		//      : 20h Thứ 6 hàng tuấn
		//      : 10h mỗi ngày đầu tháng
		//      : Sau 10p thực hiện một lần
		// --> Trigger
		
		// Công việc muốn thực hiện
		// --> Job
		
		// Chèn log, send email trước, sau khi Job hoàn thành
		// JobListener
		
		// =====================================================
		
		System.out.println("Started Application ...");
		
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = schedulerFactory.getScheduler();
		
		// the scheduler will not actually act on any triggers (execute jobs) until it has bean
		// started with the start() method
		scheduler.start();
		JobDetail jobDetail = JobBuilder.newJob(FailedTransactionsJob.class)
				.withIdentity("failedTranJon", "group-1")
				.build();
		
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("failedTranTrigger", "group-1")
				.startAt(time("02/03/2024 22:01:55"))
				.withSchedule(SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(10)
						.withRepeatCount(3))
				.build();
		
		// lập lịch cho job nào ở thời điểm trigger nào
		scheduler.scheduleJob(jobDetail, trigger);
		
		List<BankTransaction> transactions = DataModel.mockBankTransactions();
		
		List<BankTransaction> failTransactions = transactions.stream()
				.filter(t -> !t.getIsSuccess())
				.toList();
		
		System.out.println("=== Những giao dịch bị lỗi ===");
		failTransactions.forEach(System.out::println);
	}
	
	public static Date time(String val) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			return df.parse(val);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
