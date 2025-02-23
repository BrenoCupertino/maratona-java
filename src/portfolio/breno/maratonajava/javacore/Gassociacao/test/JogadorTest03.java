package portfolio.breno.maratonajava.javacore.Gassociacao.test;

import portfolio.breno.maratonajava.javacore.Gassociacao.dominio.Jogador;
import portfolio.breno.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador j = new Jogador("CR7");

        Time t = new Time("Real Madrid");
        t.setJogadores(new Jogador[]{j});

        t.print();
    }
}
