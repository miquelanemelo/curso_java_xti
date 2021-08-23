package Java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas2 {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(1995, Calendar.FEBRUARY, 10);
		Date date = c.getTime();	
		
		Locale canada = Locale.CANADA;
		Locale usa = Locale.US;
		Locale italia = Locale.ITALY;
				
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, canada);
		System.out.println(f.format(date));

		f = DateFormat.getDateInstance(DateFormat.FULL, usa);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, italia);
		System.out.println(f.format(date));
	}

}
