package portfolio.breno.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) throws ParseException {
        Locale jp = new Locale("ja", "JP");
        Locale br = new Locale("pt", "BR");
        Locale it = Locale.ITALIAN;

        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getInstance();
        nf[1] = NumberFormat.getInstance(jp);
        nf[2] = NumberFormat.getInstance(br);
        nf[3] = NumberFormat.getInstance(it);

        double valor = 10_000;

        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.format(valor));
        }

        String valor2 = "1000";

        System.out.println(nf[0].parse(valor2));
    }
}
