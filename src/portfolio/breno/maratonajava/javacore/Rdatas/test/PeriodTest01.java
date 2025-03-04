package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.now().plusYears(4);

        // Utilizada para trabalhar somente com datas sem tempo.
        Period p = Period.between(ld, ld2);
        System.out.println(p);

        Period p2 = Period.between(LocalDate.of(2002, Month.APRIL, 24), ld);
        System.out.println(p2);

        Period p3 = Period.ofWeeks(25);
        System.out.println(p3);

        // Como pegar os meses de p3?
        System.out.println(ld.until(ld.plusDays(p3.getDays())));

    }
}
