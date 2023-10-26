package ex02;

import static java.util.Calendar.YEAR;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02WeekdayCalcualator {
	static Scanner sc = new Scanner(System.in);
	static 	Date date = new Date();
	static Ex02WeekdayCalcualator obj = new Ex02WeekdayCalcualator();
	static int count = 0;
	static int count1 = 0;
	static int count2 = 0;
	static int dcount=0;
	static int ucount=0;
	static int resultDay=0;
	static int totalDayofWeeks= 0;
	static int totalDay = 0;
	public static void main(String[] args) {
	
		System.out.println("Nhập thời gian(dd/MM/yyyy)");
		String dateEnter = sc.nextLine();
		try {
			conventerToDate(dateEnter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n"+date.getDate()+" " +calMonthofYear(date)+" "+ conventerDateToCalendar(date).get(Calendar.YEAR) + " is a " +calDayofWeek(date)+".");
		System.out.println("Additional facts");
		//tick1
		int dayNumberofYear = conventerDateToCalendar(date).get(Calendar.DAY_OF_YEAR);
		int dayMaxofYear = conventerDateToCalendar(date).getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(" * It is day number "+dayNumberofYear+" of the year, "+(dayMaxofYear-dayNumberofYear)+" day left.");
		Calendar date1 = conventerDateToCalendar(date);
		//tick2
		if(date.getDay()==0) {System.out.println(" * It is "+calDayofWeek(date)+" number "+totalToMonthYears(date,8,1,2)+" out of "+totalInYears(date,8,1,2)+" in "+ date1.get(Calendar.YEAR)+".");};
		if(date.getDay()==1) {System.out.println(" * It is "+calDayofWeek(date)+" number "+totalToMonthYears(date,2,3,4)+" out of "+totalInYears(date,2,3,4)+" in "+ date1.get(Calendar.YEAR)+".");};
		if(date.getDay()==2) {System.out.println(" * It is "+calDayofWeek(date)+" number "+totalToMonthYears(date,3,4,5)+" out of "+totalInYears(date,3,4,5)+" in "+ date1.get(Calendar.YEAR)+".");};
		if(date.getDay()==3) {System.out.println(" * It is "+calDayofWeek(date)+" number "+totalToMonthYears(date,4,5,6)+" out of "+totalInYears(date,4,5,6)+" in "+ date1.get(Calendar.YEAR)+".");};
		if(date.getDay()==4) {System.out.println(" * It is "+calDayofWeek(date)+" number "+totalToMonthYears(date,5,6,7)+" out of "+totalInYears(date,5,6,7)+" in "+ date1.get(Calendar.YEAR)+".");};
		if(date.getDay()==5) {System.out.println(" * It is "+calDayofWeek(date)+" number "+totalToMonthYears(date,6,7,8)+" out of "+totalInYears(date,6,7,8)+" in "+ date1.get(Calendar.YEAR)+".");};
		if(date.getDay()==6) {System.out.println(" * It is "+calDayofWeek(date)+" number "+totalToMonthYears(date,7,8,1)+" out of "+totalInYears(date,7,8,1)+" in "+ date1.get(Calendar.YEAR)+".");};
		//tick3
		dayOfMonths(date);
		System.out.println(" * It is "+calDayofWeek(date)+" number "+totalDay+ " out of "+totalDayofWeeks+" in "+calMonthofYear(date)+" "+ date1.get(Calendar.YEAR)+".");
		//tick4
		System.out.println(" * Year "+date1.get(Calendar.YEAR)+" has "+date1.getActualMaximum(Calendar.DAY_OF_YEAR) +" days.");
		//tick5
		System.out.println(" * "+calMonthofYear(date)+" "+date1.get(Calendar.YEAR)+" has "+date1.getActualMaximum(Calendar.DAY_OF_MONTH) +" days.");
	}
		
		
	
	public static void conventerToDate(String dateEnter) throws Exception {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dateEnter);
	}
	
	public static String calDayofWeek(Date date) {
		String[] weekdaysString = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String weekdayString = weekdaysString[date.getDay()];
		return weekdayString;
	}
	public static String calMonthofYear(Date date) {
		String[] months = {"January", "February", "March", "April", "May", "June", "July","August", "September", "October", "November", "December"};
		String monthString = months[date.getMonth()];
		return monthString;
	}
	public static Calendar conventerDateToCalendar(Date date) {
		Calendar dateCalendar = Calendar.getInstance();
		dateCalendar.setTime(date);
		return dateCalendar;
	}
	public static int totalInYears(Date date, int a1, int a2, int a3) {
		int years = date.getYear();
		Calendar date2 = Calendar.getInstance();
		for(int i = 0; i<=11; i++) {
			date2.set(years, i, 1);
			int maxMonth = date2.getActualMaximum(Calendar.DAY_OF_MONTH);
				if(maxMonth == 31) {
					date2.set(years, i, 31);
					int week = date2.get(Calendar.DAY_OF_WEEK);
					if(week==a1||week==a2||week==a3) {
						count++;
					} 
				} else if(maxMonth == 30) {
					date2.set(years, i, 30);
					int week1 = date2.get(Calendar.DAY_OF_WEEK);
					if(week1==a1||week1==a2) {
						count++;
					} 	
			}		
		}
		int totalInYear = count*5+(12-count)*4;
		return totalInYear;
	}
	public static int totalToMonthYears(Date date, int b1, int b2, int b3) {
		int years = date.getYear();
		int months = date.getMonth()+1;
		Calendar date2 = Calendar.getInstance();
		for(int i = 0; i<=months; i++) {
			date2.set(years, i, 1);
			int maxMonth = date2.getActualMaximum(Calendar.DAY_OF_MONTH);
				if(maxMonth == 31) {
					date2.set(years, i, 31);
					int week = date2.get(Calendar.DAY_OF_WEEK);
					if(week==b1||week==b2||week==b3) {
						count1++;
					} 
				} else if(maxMonth == 30) {
					date2.set(years, i, 30);
					int week1 = date2.get(Calendar.DAY_OF_WEEK);
					if(week1==b1||week1==b2) {
						count1++;
					} 	
			}		
		}
		int totalInYear = count1*5+((months)-count1)*4;
		return totalInYear;
	}
	public static void dayOfMonths(Date date) {
		int day = date.getDate();
		while(day>=1) {
			day-=7;
			if(day>=1) {
				dcount++;
			}
		}
		
		day = date.getDate();
		while(day<=31) {
			day+=7;
			if(day<=31) {
				ucount++;
			}
		}
		if((dcount+ucount)==4) {
		if(dcount==0&&ucount==4) {
			 resultDay = 1;
		} else if(dcount==1&&ucount==3) {
			 resultDay = 2;
		} else if(dcount==2&&ucount==2) {
			 resultDay = 3;
		} else if(dcount==3&&ucount==1) {
			 resultDay = 4;
		}else if(dcount==4&&ucount==0) {
			 resultDay = 5;
		}
		totalDayofWeeks = dcount + ucount+1;
		totalDay = resultDay;
		} else if((dcount+ucount)==3) {
			if(dcount==0&&ucount==3) {
				 resultDay = 1;
		} else if(dcount==1&&ucount==2) {
				 resultDay = 2;
		} else if(dcount==2&&ucount==1) {
				 resultDay = 3;
		} else if(dcount==3&&ucount==0) {
				 resultDay = 4;
		}
		totalDayofWeeks = dcount + ucount+1;
		totalDay = resultDay;
		}
	}

}
