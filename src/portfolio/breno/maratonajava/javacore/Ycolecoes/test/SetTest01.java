package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
//        Set<Manga> mangas = new HashSet<Manga>(); // Não aceita duplicatas
        Set<Manga> mangas = new LinkedHashSet<Manga>(); // Mantém ordem de inserção
        mangas.add(new Manga(5L, "x1", 15.99, 0));
        mangas.add(new Manga(8L, "x2", 9.50, 1));
        mangas.add(new Manga(7L, "x8", 20.00, 5));
        mangas.add(new Manga(9L, "x0", 11.10, 0));
        mangas.add(new Manga(5L, "x1", 15.99, 0));

        mangas.forEach(System.out::println);
    }
}
