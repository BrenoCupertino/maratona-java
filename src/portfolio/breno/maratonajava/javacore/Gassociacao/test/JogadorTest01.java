package portfolio.breno.maratonajava.javacore.Gassociacao.test;

import portfolio.breno.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Bebeto");
        Jogador j2 = new Jogador("Ronaldo");
        Jogador j3 = new Jogador("Romario");

        Jogador[] jogadores = new Jogador[]{j1, j2, j3};

        for(Jogador j: jogadores) {
            j.print();
        }
    }
}
