package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Manga;
import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone t0, Smartphone t1) {
        return t0.getBrand().compareTo(t1.getBrand());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<Smartphone>(new SmartphoneComparator()); // Necessário a classe do tipo implementar comparable
        set.add(new Smartphone("123", "Samsumg"));
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new SortByPrecoComparator()); // Organiza elementos baseado no compareto.
        mangas.add(new Manga(5L, "x1", 15.99, 0));
        mangas.add(new Manga(8L, "x2", 9.50, 1));
        mangas.add(new Manga(7L, "x8", 20.00, 5));
        mangas.add(new Manga(9L, "x0", 11.10, 0));
        mangas.add(new Manga(19L, "x1", 30.00, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------");

        // Metodos de Comparação
        // lower <, higher >, floor <=, ceiling >=.
        Manga x15 = new Manga(15L, "x15", 15.99, 0);
        System.out.println(mangas.lower(x15));
        System.out.println(mangas.higher(x15));
        System.out.println(mangas.ceiling(x15));
        System.out.println(mangas.floor(x15));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());

    }
}
