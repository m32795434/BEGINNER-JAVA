import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtil {
    public static void main(String[] args) {

        //java.util.Date

        Date date = new Date();
        System.out.println("date = " + date);//Wed Nov 09 19:17:01 UYT 2022 like Js
        //Doesn't accept all the locales ---> SimpleDateFormat
        SimpleDateFormat objDateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' hh:mm:ss a z");//a:am-pm, z:zone
        String dateStr = objDateFormat.format(date);
        System.out.println("dateStr = " + dateStr);
        long ms1 = date.getTime();//same as Js
        System.out.println("ms1 = " + ms1);
        long j =0;
        for(long i = 0; i < 1000000000; i++){
            j+=i*2000000000;
        }
        Date date2 = new Date();
        long ms2 = date2.getTime();
        System.out.println("ms2 = " + ms2);
        System.out.println("tiempo que tomó en ejecutarse el for y crear otro date en ms: " + (ms2-ms1));

        //DEPRECATED
        Date date3 = new Date("Tuesday 8, November 2022");//LIKE JS, but it's DEPRECATED. use DateFormat

        //CALENDAR - to create a Date with a date of the past or the future.
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2019, 00, 15, 17, 20, 00);
        Date date4 = calendar1.getTime();
        System.out.println("date without formatting: " + date4);
        String date4Formatted = objDateFormat.format(date4);
        System.out.println("date formatted : " + date4Formatted);
        
    }
}
