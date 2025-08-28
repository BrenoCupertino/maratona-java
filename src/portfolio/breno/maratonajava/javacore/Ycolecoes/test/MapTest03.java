package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Breno");
        Consumidor c2 = new Consumidor("Lucas");

        Manga x1 = new Manga(5L, "x1", 15.99, 0);
        Manga x2 = new Manga(8L, "x2", 9.50, 1);
        Manga x8 = new Manga(7L, "x8", 20.00, 5);
        Manga x0 = new Manga(9L, "x0", 11.10, 0);
        Manga x3 = new Manga(3L, "x3", 15.99, 0);

        Map<Consumidor, List<Manga>> map = new LinkedHashMap<>();
        map.put(c1, List.of(x1, x2, x8));
        map.put(c2, List.of(x0, x3));

        for (Map.Entry<Consumidor, List<Manga>> entry : map.entrySet()) {
            System.out.print(entry.getKey());
            for (Manga manga : entry.getValue()) {
                System.out.print(" -> " + manga);
            }
            System.out.println();
        }

    }
}
