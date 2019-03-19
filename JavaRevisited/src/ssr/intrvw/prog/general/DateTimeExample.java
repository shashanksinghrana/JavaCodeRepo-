package ssr.intrvw.prog.general;

import java.text.*;  
import java.util.Date;  
public class DateTimeExample {  
public static void main(String[] args)throws Exception {  
	System.out.println(DateTimeExample.timeFormat("11:30 PM"));
}  
public static String timeFormat(String time) throws ParseException{
	//String time = "11:30:00 PM";
	SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a");
    Date date = parseFormat.parse(time);
	return displayFormat.format(date);
}
} 

