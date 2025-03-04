package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    // Classe utilizada para internacionalização -> Datas, linguas, moedas, etc...
    public static void main(String[] args) {
        Locale lBrazil = new Locale("pt", "BR");
        Locale lItaly = new Locale("it", "IT");
        Locale lCH = new Locale("it", "CH");

        Calendar c = Calendar.getInstance();

        DateFormat d1 = DateFormat.getDateInstance(DateFormat.FULL, lBrazil);
        DateFormat d2 = DateFormat.getDateInstance(DateFormat.FULL, lItaly);
        DateFormat d3 = DateFormat.getDateInstance(DateFormat.FULL, lCH);

        System.out.println(d1.format(c.getTime()));
        System.out.println(d2.format(c.getTime()));
        System.out.println(d2.format(c.getTime()));

        System.out.println(lBrazil.getDisplayCountry(lItaly));
    }
}
