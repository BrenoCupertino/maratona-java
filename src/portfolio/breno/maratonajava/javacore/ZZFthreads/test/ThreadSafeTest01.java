package portfolio.breno.maratonajava.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private final List<String> nomes = new ArrayList<String>();

    public synchronized void add(String nome) {
        nomes.add(nome);
    }

    // Necessário sincronizar metodo
    public synchronized void removeFirst() {
        if(!nomes.isEmpty()) {
            System.out.println(Thread.currentThread().getName());
            nomes.remove(0);
        } else {
            System.out.println("Lista vazia!");
        }
    }
}

public class ThreadSafeTest01 {

    public static void main(String[] args) {
        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("ME");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
