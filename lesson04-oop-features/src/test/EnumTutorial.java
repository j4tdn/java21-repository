package test;

public class EnumTutorial {

	public static void main(String[] args) {

		DaysOfTheWeek day = DaysOfTheWeek.FRIDAY;
		System.out.println(day);
		
		if (day == DaysOfTheWeek.FRIDAY) {
			System.out.println("Oh It's almost FRIDAY");
		}
		
		for(DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
			System.out.println(myDay);
		}
		
		System.out.println(Cereals.CAPATAIN_CRUNCH.levelOfDeliciousness);
	}

}
