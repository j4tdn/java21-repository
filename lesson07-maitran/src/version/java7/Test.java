package version.java7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Test {
	public static void main(String[] args) {
        TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin"); 

        Calendar c = Calendar.getInstance(tzBerlin);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(tzBerlin); 

        String formattedTime = sdf.format(c.getTime());
        System.out.println("Time berlin: " + formattedTime);
    }
}
