package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "x1", 15.99));
        mangas.add(new Manga(8L, "x2", 9.50));
        mangas.add(new Manga(7L, "x8", 20.00));
        mangas.add(new Manga(9L, "x0", 11.10));
        mangas.add(new Manga(5L, "x1", 15.99));
        System.out.println(mangas);

        Collections.sort(mangas);
        System.out.println(mangas);

        Collections.sort(mangas, new SortByPrecoComparator());
        System.out.println(mangas);
    }
}
