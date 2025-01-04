package portfolio.breno.maratonajava.javacore.Bintroducaometodos.test;

import portfolio.breno.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import portfolio.breno.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante e = new Estudante("Breno", 15, 'M');
        Estudante e1 = new Estudante("Luca", 21, 'M');

        ImprimeEstudante impressora = new ImprimeEstudante();
        impressora.imprime(e);

        e1.imprime();
    }
}
