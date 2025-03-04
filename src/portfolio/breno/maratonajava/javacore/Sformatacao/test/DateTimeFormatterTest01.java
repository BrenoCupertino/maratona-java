package portfolio.breno.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();

        String format = ld.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = ld.format(DateTimeFormatter.ISO_DATE);
        String format3 = ld.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);
        System.out.println(format2);
        System.out.println(format3);

        LocalDate parse = LocalDate.parse("20250304", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(LocalDate.now().format(dtf));
        System.out.println(LocalDate.parse("04/03/2025", dtf));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.CHINA);
        System.out.println(LocalDate.now().format(dtf2));
        System.out.println(LocalDate.parse("04.三月.2025", dtf2));
    }
}
