package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        // "Instant" trabalha com nanosegundos.
        Instant i = Instant.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(i);
        System.out.println(ldt);

        System.out.println(i.getEpochSecond());
        System.out.println(i.getNano()); // 1 segundo -> 999.999.999 nanos

        System.out.println(Instant.ofEpochSecond(3, 0));
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
    }
}
