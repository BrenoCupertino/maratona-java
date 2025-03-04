package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now().minusYears(24);
        System.out.println(ChronoUnit.DAYS.between(ldt, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(ldt, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(ldt, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(ldt, LocalDateTime.now()));
    }
}
