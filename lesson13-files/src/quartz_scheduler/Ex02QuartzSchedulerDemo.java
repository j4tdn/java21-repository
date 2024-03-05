
package quartz_scheduler;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.crypto.Data;

import org.quartz.CronScheduleBuilder;
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

		// lập lịch vào 23H hàng ngày, kiểm tra xem hệ thống có giao dịch nào bị lỗi

		// Lập lịch - scheduler
		// schedule cho Job nào ở thời gian nào
		
		// Thời gian, thời điểm nào, 
		// VD: thứ 5 hằng tuần
		// 		: 20h thứ 6 hằng tuần
		//		: 10h mỗi ngày đầu tháng
		//		: sau 10p thực hiện một lần
		// --> trigger
		
		// công việc muốn thực hiện
		// --> Job
		
		// chèn log, send email trước, sau khi Job hoàn thành
		
		
		System.out.println("started application....");
		
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = schedulerFactory.getScheduler();
		
		scheduler.start();
		
		JobDetail jobDetail = JobBuilder.newJob(FailedTransactionJob.class)
					.withIdentity("failedTranJob", "group-1")
					.build();
		
		// second minutes hours day-ofmonth month day-of-week
		//
		
		//simple schedule - cấu hình đơn giản
		// cron schedule - câu hình thời gian theo pattern
		/*Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("failedTranTrigger", "group-1")
				.withSchedule(CronScheduleBuilder.cronSchedule("15 44 15 * * ?"))
				.build();*/
		
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("failedTranTrigger", "group-1")
				.startAt(time("05/03/2024 16:01:03"))
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