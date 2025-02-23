package portfolio.breno.maratonajava.javacore.Eblocoinicializacao.teste;

import portfolio.breno.maratonajava.javacore.Eblocoinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto");
        for(int ep: anime.getEpisodios()) {
            System.out.print(ep + " ");
        }
    }
}
