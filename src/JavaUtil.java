import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JavaUtil {
    public static void main(String[] args) {

        //java.util.Date

        Date date = new Date();
        System.out.println("date = " + date);//Wed Nov 09 19:17:01 UYT 2022 like Js
        //SimpleDateFormat doesn't accept all the locales --->In that case, use DateFormat.
        SimpleDateFormat objDateFormat = new SimpleDateFormat("dd.MM.yyyy G 'at' hh:mm:ss a z");//a:am-pm, z:zone
        String dateStr = objDateFormat.format(date);//-----(2)-----always over a Date Obj. RETURN A STRING.
        System.out.println("dateStr = " + dateStr);
        long ms1 = date.getTime();//same as Js
        System.out.println("ms1 = " + ms1);
        long j =0;
        for(long i = 0; i < 1000000000; i++){
            j+=i*2000000000;
        }
        Date date2 = new Date();

        long ms2 = date2.getTime();//---(1)---HERE .getTime() return a NUMBER
        System.out.println("ms2 = " + ms2);
        System.out.println("tiempo que tomó en ejecutarse el for y crear otro date en ms: " + (ms2-ms1));

        //DEPRECATED
        Date date3 = new Date("Tuesday 8, November 2022");//LIKE JS, but it's DEPRECATED. use DateFormat

        //CALENDAR - to create a Date with a date of the past or the future.
        Calendar calendar1 = Calendar.getInstance();//Because it's an abstract class. We can't instantiate it with new
        //SET A DATE WITH .set()
        calendar1.set(2019, 00, 15, 17, 20, 00);

        Date date4 = calendar1.getTime();//---(1)--- HERE .getTime() RETURN A DATE OBJECT. ¡It's not the same method!
        System.out.println("date without formatting: " + date4);
        String date4Formatted = objDateFormat.format(date4);//-----(2)-----always over a Date Obj. RETURN A STRING.
        System.out.println("date formatted : " + date4Formatted);

//        SET A DATE WITH a string
        SimpleDateFormat objDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        Scanner s = new Scanner(System.in);
        System.out.println("Insert a date. Format: dd-MM-yyyy");
        try {
            Date date5 = objDateFormat2.parse(s.nextLine());//this .parse() return a Date obj
            System.out.println("date5 = " + date5);
            System.out.println("con formato dd.MM.yyyy G 'at' hh:mm:ss a z = " + objDateFormat.format(date5));
        } catch (ParseException e) {
            System.out.println("Please try again!");
            System.out.println(e.getMessage());
            main(args);
//            e.printStackTrace();
//            throw new RuntimeException(e); // If this run, it stops the code here
            System.exit(0);
        }
        //SO-REVIEW
        Date date6 = new Date();
        Date date7 = Calendar.getInstance().getTime();
        System.out.println("date6 y date7 are equals?: "+ date6.equals(date7));//TRUE

        //CONTINUE
        //COMPARING TWO DATES.
        System.out.println("Comparing two dates...");
        System.out.println("Insert a date. Format: dd-MM-yyyy");
        try {
            Date date8 = objDateFormat2.parse(s.nextLine());
            //other way to compare: if(date8.compareTo(date6)>0)
            if(date8.after(date6)){
                System.out.println("date inserted is from the future");
}else if(date8.before(date6)){
                System.out.println("the date inserted is a date from the past");
            }else{
                System.out.println("the date inserted is the current time");
            }
        } catch (ParseException e) {
            System.out.println("exception message= " + e.getMessage());
            main(args);
            System.exit(0);

//            throw new RuntimeException(e);
        }
    }
}
