package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = LocalDate.of(2025, Month.JANUARY, 17);
        LocalTime lt = LocalTime.of(18, 45, 45);

        System.out.println(ldt);

        LocalDateTime ldt1 = ld.atTime(lt);
        LocalDateTime ldt2 = lt.atDate(ld);

        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
