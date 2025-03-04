package portfolio.breno.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {

    public static void main(String[] args) {
        // Classe "Date" está obsoleta porém, ainda é utilizada em sistemas legados.
        Date d = new Date(); // o valor referenciado é um long representando os milissegundos desde 01/01/1970.
        Date d2 = new Date(1_000_000_000L);
        System.out.println(d);
        System.out.println(d2);
    }
}
