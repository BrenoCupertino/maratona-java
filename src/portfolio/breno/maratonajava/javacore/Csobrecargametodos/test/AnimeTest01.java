package portfolio.breno.maratonajava.javacore.Csobrecargametodos.test;

import portfolio.breno.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime  = new Anime();
        anime.init("TV", "Naruto", 258);
        anime.print();

        Anime anime2 = new Anime();
        anime2.init("TV", "Dragon Ball Z", 500, "Ação");
        anime2.print();
    }
}
