package main;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(".Enter your current age: ");
        int age = scanner.nextInt();

        System.out.println(".Enter the time you slept during the day:");
        System.out.print("+ Hours: ");
        int hoursSlept = scanner.nextInt();
        System.out.print("+ Minutes: ");
        int minutesSlept = scanner.nextInt();

        System.out.print(".Enter the bedtime (in 24H format): ");
        int bedtime = scanner.nextInt();

        int recommendedWakeUpHour = calculateRecommendedWakeUpHour(age, hoursSlept, minutesSlept, bedtime);

        System.out.println(" ===> You should wake up at: " + (recommendedWakeUpHour / 60) %24 + "H" + recommendedWakeUpHour % 60);
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
