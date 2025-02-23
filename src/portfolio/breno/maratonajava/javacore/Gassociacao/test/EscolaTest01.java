package portfolio.breno.maratonajava.javacore.Gassociacao.test;

import portfolio.breno.maratonajava.javacore.Gassociacao.dominio.Escola;
import portfolio.breno.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {
        Professor p = new Professor("Lucas");
        Professor p2 = new Professor("Junior");
        Professor p3 = new Professor("Maicon");

        Escola e = new Escola("Estadual Bom Juá", new Professor[]{p, p2, p3});

        e.print();

    }
}
