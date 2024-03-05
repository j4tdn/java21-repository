package quartz_scheduler;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class Ex02QuartzScheduloDemo {

	public static void main(String[] args) throws SchedulerException {

		// Lập lịch vào 23h hằng ngày, kiểm tra xem hệ thống có gia dịch trong khoảng thời gian này
		
		// Lập lịch - scheduler
		// Thời gian, thời điểm nào
		// VD: Thứ 5 hằng tuần 
		//	 : 20h Thứ 6 hằng tuần
		//	 : 10h Mỗi ngày đầu tháng
		//	 : Sau 10p thì thực hiện 1 lần
		// --> Trigger
		
		// Công việc mình muốn thực hiện
		// --> Job
		
		// Chèn log, send email trước, sau khi Job hoàn thành
		// JobListener
		
		//===========================
		
		System.out.println("Stared Application");
		
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = schedulerFactory.getScheduler();
		// the scheduler will not actually act no any trigger (execute )
		scheduler.start();
		
		// FailedTransactionJob.class
		JobDetail jobDetail = JobBuilder.newJob(FailedTransactionJob.class)
				.withIdentity("failedTranJob","group-1")
				.build();
		
		// Second Minutes Hours DoM mouth DoW
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("failTranTrigger","group-1") 
		//		.startAt(time("02/03/2024 22:04:00))
				.withSchedule(SimpleScheduleBuilder.simpleSchedule()
						.withIntervalInSeconds(10)
						.withRepeatCount(3))
				.build();
				
		
		//Lập lịch cho job
		scheduler.scheduleJob(jobDetail,trigger);
		
	}
	
	public static Date time(String val) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			return df.parse(val);
		} catch (Exception e) {
			e.printStackTrace();
			return new Date();
		}
	}

}
