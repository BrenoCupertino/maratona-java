package portfolio.breno.maratonajava.javacore.ZZGconcorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;
    private final ReentrantLock lock = new ReentrantLock(true);
    private final Condition openCondition = lock.newCondition();

    public boolean isOpen() {
        return open;
    }

    public int peddingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMember(String email) {
        lock.lock();
        try {
            String thread = Thread.currentThread().getName();
            System.out.println(thread + "Adicionou email na lista!");
            emails.add(email);
            openCondition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String retrieveEmails() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Checando se há emails!");
        lock.lock();
        try {
            while(peddingEmails() == 0) {
                if(!isOpen()) return null;
                System.out.println(Thread.currentThread().getName() + "Sem emails na lista! Entrando em modo de espera.");
                openCondition.await();
            }
            return emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Encerrando emails!");
            openCondition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
