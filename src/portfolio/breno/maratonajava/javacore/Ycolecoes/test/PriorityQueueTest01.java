package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest01 {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(); // Caso seja utilizado uma classe no tipo, então deve implementar comparator
        q.add(2);
        q.add(1);
        q.add(3);

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
