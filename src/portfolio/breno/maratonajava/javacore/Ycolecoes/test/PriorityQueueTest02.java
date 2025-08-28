package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> q = new PriorityQueue<>(new SortByPrecoComparator().reversed());
        q.add(new Manga(5L, "x1", 15.99, 0));
        q.add(new Manga(8L, "x2", 9.50, 1));
        q.add(new Manga(7L, "x8", 20.00, 5));
        q.add(new Manga(9L, "x0", 11.10, 0));
        q.add(new Manga(19L, "x1", 30.00, 0));
        q.forEach(System.out::println);
    }
}
