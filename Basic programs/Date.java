import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date{
    public static void main(String[] args) {
        GregorianCalendar d= new GregorianCalendar();
        int today= d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.DATE);
        System.out.println(today+" "+month);
    }
}