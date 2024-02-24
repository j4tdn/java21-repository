package main;

import java.util.Scanner;

public class Ex02De3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("B1. Nhập tuổi hiện tại của bạn: ");
        int age = sc.nextInt();

        System.out.println("B2. Nhập thời gian đã ngủ trong ngày");
        System.out.print("+ Số giờ: ");
        int hoursSlept = sc.nextInt();
        System.out.print("+ Số phút: ");
        int minutesSlept = sc.nextInt();

        System.out.print("B3. Nhập thời gian bắt đầu ngủ (24H): ");
        int bedtime = sc.nextInt();

        int recommendedWakeUpHour = calculateRecommendedWakeUpHour(age, hoursSlept, minutesSlept, bedtime);

        System.out.println("Bạn nên thức dậy lúc: " + (recommendedWakeUpHour / 60) %24 + "H" + recommendedWakeUpHour % 60);
    }

    private static int calculateRecommendedWakeUpHour(int age, int hoursSlept, int minutesSlept, int bedtime) {
        int totalMinutesSlept = hoursSlept * 60 + minutesSlept;

        int minSleepTime;
        if (age >= 65) {
            minSleepTime = 7 * 60;
        } else if (age >= 18) {
            minSleepTime = 7 * 60 + 1;
        } else if (age >= 14) {
            minSleepTime = 8 * 60;
        } else if (age >= 4) {
            minSleepTime = 10 * 60;
        } else {
            minSleepTime = 20 * 60;
        }

        int recommendedWakeUpHour = bedtime * 60 + totalMinutesSlept + minSleepTime;

        return recommendedWakeUpHour;
    }
}
