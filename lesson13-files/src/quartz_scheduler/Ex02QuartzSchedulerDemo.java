package quartz_scheduler;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;

import model.Datamodel;

public class Ex02QuartzSchedulerDemo {
	public static void main(String[] args) throws SchedulerException {
		// Lập lịch vào 23h hàng ngày, kiểm tra xem hệ thống có giao dịch nào bị lỗi
		
		// Lập lịch - scheduler
		// Thời gian, thời điểm nào
		// VD: Thứ 5 hàng tuần
		// 	 : 20h Thứ hàng tuần
		// 	 : 10h mỗi ngày đầu tháng
		//   : Sau 10 phút thực hiện một lần
		// --> Trigger
		
		// Công việc muốn thực hiện
		// --> Job
		//
		// chèn log, send email trước, sau khi job haonf thành
		// jobListener
		
		// =============================================
		
		System.out.println("Started Application ...");
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = schedulerFactory.getScheduler();
		
		// the scheduler will not actually act on any triggers (execute jobs)  until
		// it has been start with the start() method
		scheduler.start();
		
		JobDetail jobDetail = JobBuilder.newJob(FailedTransactionsJob.class)
				.withIdentity("failTranJob", "group-1")
				.build();
		
		// simple schedule --> cấu hình đơn giản
		// cron schedule 
//		Trigger trigger = TriggerBuilder.newTrigger()
//				.withIdentity("failTranTrigger", "group-2")
//				.withSchedule(CronScheduleBuilder.cronSchedule("50 44 21 ? * SAT"))
//				.build();
		
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("failTranTrigger", "group-2")
				.startAt(time("02/03/2024 2:54:02"))
				.withSchedule(SimpleScheduleBuilder.simpleSchedule()
					.withIntervalInSeconds(10)
					.withRepeatCount(3))
				.build();
		
		
		// Lập lịch cho job nào ở thời điểm trigger nào
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
