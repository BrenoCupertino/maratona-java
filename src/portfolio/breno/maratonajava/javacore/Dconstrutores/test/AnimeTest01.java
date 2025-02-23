package portfolio.breno.maratonajava.javacore.Dconstrutores.test;

import portfolio.breno.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime  = new Anime("TV", "Dragon Ball Z", 500, "Ação", "Fox");
        anime.print();
    }
}
