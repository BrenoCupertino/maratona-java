package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "x1", 15.99, 0));
        mangas.add(new Manga(8L, "x2", 9.50, 1));
        mangas.add(new Manga(7L, "x8", 20.00, 5));
        mangas.add(new Manga(9L, "x0", 11.10, 0));
        mangas.add(new Manga(5L, "x1", 15.99, 0));

        /*Iterator<Manga> iterator = mangas.iterator(); // Java joga execeção caso tente alterar lista em tempo de execução, utilizar iterator.
        while (iterator.hasNext()) {
            if (iterator.next().getQuantidade() == 0) {
                iterator.remove();
            }
        }*/

        // Programação funcional
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
