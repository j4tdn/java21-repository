package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int age = getIp("Tuổi: ", ip);
		
		System.out.println("Thời gian đã ngủ");
		int hours = getIp("Số giờ: ", ip);
		int minutes = getIp("Số phút: ", ip);
		
		int sleepStartHours = getIp("Thời gian bắt đầu ngủ: ", ip);
		
		double recommendedSleepTime = getRecommendedSleepTime(age);
		
		double totalSleepTime = hours + (minutes / 60);

        double remainingSleepTime = recommendedSleepTime - totalSleepTime;

        int remainingHours = (int) remainingSleepTime;
        int remainingMinutes = (int) ((remainingSleepTime - remainingHours) * 60);

        int wakeUpHours = sleepStartHours + remainingHours;
        int wakeUpMinutes = remainingMinutes;
		if(wakeUpHours >= 24) {
			wakeUpHours -= 24;
		}
		
		System.out.println("\nBạn nên thức dậy lúc: " + wakeUpHours + "H" + wakeUpMinutes);
	}
	
	public static int getIp(String s, Scanner ip) {
		while (true) {
			try {
				System.out.print(s);
				return Integer.parseInt(ip.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số nguyên!");
			}
		}
	}
	
	public static double getRecommendedSleepTime(int age) {
		if(age >= 1 && age <=3) {
			return 20;
		}else if(age >= 4 && age <= 13){
			return (10 + 12) / 2;
		}else if(age >= 14 && age <= 17){
			return (8 + 10) / 2;
		}else if(age >= 18 && age <= 64){
			return (7 + 9) / 2;
		}else{
			return (7 + 8) / 2;
		}
	}
	
}
