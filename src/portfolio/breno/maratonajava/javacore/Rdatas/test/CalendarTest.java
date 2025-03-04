package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    public static void main(String[] args) {
        /* Classe "Calendar" criada para resolver problemas (relacionados a internacionalização)
         que a Classe "Date" trazia. A classe é abstrata  e devemos recuperar a instacia dela.*/
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia");
        }

        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.DAY_OF_MONTH, 1);

        // Conversão classe "Calendar" para "Date"
        Date d = c.getTime();
        System.out.println(d);

    }
}
