package routines;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class LogFile {

    public static void main(String message) {
    	
        String DATE_FORMAT = "MM-dd-yyyy HH:mm:ss";
        
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        TimeZone estTime = TimeZone.getTimeZone("America/New_York");
        dateFormat.setTimeZone(estTime);
        
        Date dateTime_log = new Date();
        String str_dateTime_log = dateFormat.format(dateTime_log);
        
        System.out.println(str_dateTime_log + " | " + message);
    }
}