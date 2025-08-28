package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Breno");
        Consumidor c2 = new Consumidor("Lucas");

        Manga x1 = new Manga(5L, "x1", 15.99, 0);
        Manga x2 = new Manga(8L, "x2", 9.50, 1);
        Manga x3 = new Manga(7L, "x8", 20.00, 5);
        Manga x4 = new Manga(9L, "x0", 11.10, 0);
        Manga x5 = new Manga(5L, "x1", 15.99, 0);

        Map<Consumidor, Manga> map = new HashMap<>();
        map.put(c1, x1);
        map.put(c2, x2);
        map.forEach((consumidor, manga) -> {
            System.out.println(consumidor.getNome() + " - " + manga.getNome());
        });
    }
}
