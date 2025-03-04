package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {

    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        // Sempre prefira trabalhar com LocalDate.
        LocalDate dt = LocalDate.of(2025, Month.JANUARY, 27);
        LocalDate now = LocalDate.now();

        System.out.println(dt.getYear());
        System.out.println(dt.getMonth());
        System.out.println(dt.getDayOfWeek());
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dt.get(ChronoField.YEAR));

        System.out.println(dt);
        System.out.println(now);


    }
}
