		package quartz_scheduler;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class Ex02QuartzSchedulerDemo {
	
	public static void main(String[] args) throws SchedulerException {
		// Lập lịch vào 23H hàng ngày, kiểm tra xem hệ thống có giao dịch nào bị lỗi
		
		// Lập lịch - scheduler
		// schedule cho Job nào ở thời gian nào
		
		// Thời gian, thời điểm nào
		//    VD: Thứ 5 hàng tuần
		//      : 20H Thứ 6 hàng tuần
		//      : 10H mỗi ngày đầu tháng
		//      : Sau 10p thực hiện một lần
		// --> Trigger
		
		// Công việc muốn thực hiện
		// --> Job
		
		
		// Chèn log, send email trước, sau khi Job hoàn thành
		// JobListener
		
		// ================================================
		
		System.out.println("Started Application ...");
		
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = schedulerFactory.getScheduler();
		
		// the scheduler will not actually act on any triggers (execute jobs) until 
		// it has been started with the start() method
		scheduler.start();
		
		JobDetail jobDetail = JobBuilder.newJob(FailedTransactionsJob.class)
				.withIdentity("failedTranJob", "group-1")
				.build();
		
		// Seconds Minutes Hours Day-of-Month Month Day-of-Week
		// https://github.com/quartz-scheduler/quartz/blob/main/docs/tutorials/tutorial-lesson-06.md
		
		// simple schedule --> cấu hình đơn giản
		// cron schedule   --> cấu hình thời gian theo pattern
		/*Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("failedTranTrigger", "group-1")
				.withSchedule(CronScheduleBuilder.cronSchedule("50 41 21 * * ?"))
				.build();*/
		
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("failedTranTrigger", "group-1")
				.startAt(time("02/03/2024 21:51:02"))
				.withSchedule(SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(10)
						.withRepeatCount(3))
				.build();
		
		// lập lịch cho job nào ở thời điểm trigger nào
		scheduler.scheduleJob(jobDetail, trigger);
	}
	
	public static Date time(String val) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			return df.parse(val);
		} catch (ParseException e) {
			e.printStackTrace();
			return new Date();
		}
	}
}