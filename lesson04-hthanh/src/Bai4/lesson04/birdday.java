package Bai4.lesson04;

public class birdday {
	private int day;
	private int month;
	private int year;

	public birdday() {
		// TODO Auto-generated constructor stub
	}

	public birdday(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day > 0 && day < 32)
			this.day = day;
		else
			setDay(day);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (day > 0 && day < 13)
			this.month = month;
		else
			setMonth(month);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 0 && year < 13)
			this.year = year;
		else
			setYear(year);
	}

	@Override
	public String toString() {
		return "birdday [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
