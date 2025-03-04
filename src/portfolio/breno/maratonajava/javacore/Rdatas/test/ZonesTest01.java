package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.util.Map;

public class ZonesTest01 {

    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        ZonedDateTime zonedDateTime = ldt.atZone(zoneId);
        System.out.println(zonedDateTime);

        Instant i = Instant.now();
        System.out.println(i);
        ZonedDateTime zonedDateTime1 = i.atZone(zoneId);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        LocalDateTime ldt2 = LocalDateTime.now();

        ZoneOffset zoneOffset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = ldt2.atOffset(zoneOffset);
        System.out.println(offsetDateTime);

        OffsetDateTime oft = OffsetDateTime.of(ldt2, zoneOffset);
        System.out.println(oft);

        OffsetDateTime offsetDateTime1 = i.atOffset(zoneOffset);
        System.out.println(offsetDateTime1);

    }
}
