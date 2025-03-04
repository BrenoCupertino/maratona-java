package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = LocalTime.of(23, 25, 30);

        System.out.println(lt);
        System.out.println(lt2);

        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());

    }
}
