package portfolio.breno.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count;
    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    // Utiliza conceito de fair, ou seja, pasará a vez para a thread esperando mais tempo.
    // tryLock -> Thread espera um lock por um periodo, caso não consiga, segue a opreção.

    private final Lock lock = new ReentrantLock(true);

    /*public void increment() {
        count++; // Não é Thread-Safe, pode realizar incremento e não ser o valor esperado.
        atomicInteger.incrementAndGet(); // Implementa o Compare-And-Swap, ou seja, o valor que surge do incremento é sempre o esperado.
    }*/

    public void increment() {
        lock.lock();
        try {
            count++;
            atomicInteger.incrementAndGet();
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntergerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());

    }
}
