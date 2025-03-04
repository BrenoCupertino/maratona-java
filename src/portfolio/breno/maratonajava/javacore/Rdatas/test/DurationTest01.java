package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.now().plusYears(2);

        LocalTime lt = LocalTime.now();
        LocalTime lt2 = LocalTime.now().plusHours(2);

        // Usada para calculos entre datas que possuam tempo.
        Duration d = Duration.between(ldt, ldt2);
        Duration d1 = Duration.between(lt, lt2);

        System.out.println(d);
        System.out.println(d1);


    }
}
