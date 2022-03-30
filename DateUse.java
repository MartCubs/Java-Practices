import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUse {

	public static void main(String[] args) {
		//Needs to import Java Utility Date "java.util.Date;
		Date d = new Date();
		System.out.println(d);
		
		//need gregorian to manipulate (add days, month etc)
		GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
		gc.add(GregorianCalendar.DATE,1);
		Date d2 = gc.getTime();

		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String sd =  df.format(d2);
		System.out.println(sd);
		
	}

}