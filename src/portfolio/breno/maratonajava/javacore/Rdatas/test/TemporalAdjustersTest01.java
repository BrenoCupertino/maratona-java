package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        ld = ld.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println(ld);

        ld = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
        System.out.println(ld);

        ld = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY));
        System.out.println(ld);

        ld = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(ld);

    }
}
