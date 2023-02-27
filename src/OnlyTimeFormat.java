import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OnlyTimeFormat {
    public static void main(String[] args) {
        SimpleDateFormat objDateFormat = new SimpleDateFormat("hh:mm:ss");//a:am-pm, z:zone

        Calendar calendar1 = Calendar.getInstance();//Because it's an abstract class. We can't instantiate it with new
        //SET A DATE WITH .set()
        calendar1.set(2019, 00, 15, 17, 20, 00);
    }
}
