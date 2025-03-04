package portfolio.breno.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) throws ParseException {
        Locale jp = new Locale("ja", "JP");
        Locale br = new Locale("pt", "BR");
        Locale it = Locale.ITALIAN;

        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(jp);
        nf[2] = NumberFormat.getCurrencyInstance(br);
        nf[3] = NumberFormat.getCurrencyInstance(it);

        double valor = 10_000.215;

        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valor2 = "￥10,000";

        System.out.println(nf[1].parse(valor2));
    }
}
