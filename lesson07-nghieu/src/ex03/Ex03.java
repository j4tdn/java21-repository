package ex03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03 {

	public static void main(String[] args) {
		time();
		
	}
	private static void time() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

		Date date = new Date();
		System.out.println("1. thời gian hiện tại: " + df.format(date));
	}
}
