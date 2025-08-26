package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "x1", 15.99));
        mangas.add(new Manga(8L, "x2", 9.50));
        mangas.add(new Manga(7L, "x8", 20.00));
        mangas.add(new Manga(9L, "x0", 11.10));
        mangas.add(new Manga(5L, "x1", 15.99));
        System.out.println(mangas);

        Collections.sort(mangas, new SortByPrecoComparator());
        System.out.println(mangas);

        Manga mangaToSearch = new Manga(9L, "x0", 11.10);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, new SortByPrecoComparator()));
    }
}
