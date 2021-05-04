import java.text.SimpleDateFormat;
import java.util.Date;

public class firstProgram {
	
	
	public static void main(String[] args) {
		
		
		/* https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html */
		
		//Tue May 04 03:12:16 CDT 2021
		Date currentDate = new Date();
		System.out.println(currentDate); 
		
		//05/04/21
		SimpleDateFormat date = new SimpleDateFormat("MM/dd/YY");
		System.out.println(date.format(currentDate));
		
		//03:12
		SimpleDateFormat time = new SimpleDateFormat("hh:mm");
		System.out.println(time.format(currentDate)); 
		
		//03:14 AM
		SimpleDateFormat timeAmPm = new SimpleDateFormat("hh:mm a");
		System.out.println(timeAmPm.format(currentDate)); 
		
		//5
		SimpleDateFormat monthOfYear = new SimpleDateFormat("M");
		System.out.println(monthOfYear.format(currentDate));
		
		//Tue
		SimpleDateFormat dayName = new SimpleDateFormat("EE");
		System.out.println(dayName.format(currentDate));
	}

}
 
