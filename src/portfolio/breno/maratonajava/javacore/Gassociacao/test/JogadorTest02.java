package portfolio.breno.maratonajava.javacore.Gassociacao.test;

import portfolio.breno.maratonajava.javacore.Gassociacao.dominio.Jogador;
import portfolio.breno.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Messi");
        Time time = new Time("Barcelona");
        j1.setTime(time);
        j1.print();
    }
}
