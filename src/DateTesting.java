import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTesting {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date today = new Date();
		System.out.println(today);
		
		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.DATE, 1);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(cal.getTime());
		// Output "Wed Sep 26 14:23:28 EST 2012"

		String formatted = format1.format(cal.getTime());
		System.out.println(formatted);
		// Output "2012-09-26"

		System.out.println(format1.parse(formatted));
		// Output "Wed Sep 26 00:00:00 EST 2012"
		
		for (int i=2;i<=100;i++){
			cal.add(Calendar.DATE, 1);
			formatted = format1.format(cal.getTime());
			System.out.println("<tr><td>"+i+"</td><td>"+formatted+"</td><td></td></tr>");
		}
	}

}
