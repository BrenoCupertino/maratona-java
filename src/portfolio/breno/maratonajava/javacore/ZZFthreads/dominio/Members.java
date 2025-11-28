package portfolio.breno.maratonajava.javacore.ZZFthreads.dominio;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int peddingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMember(String email) {
        synchronized (emails) {
            String thread = Thread.currentThread().getName();
            System.out.println(thread + "Adicionou email na lista!");
            emails.add(email);
            emails.notifyAll();
        }
    }

    public String retrieveEmails() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Checando se há emails!");
        synchronized (emails) {
            while(peddingEmails() == 0) {
                if(!isOpen()) return null;
                System.out.println(Thread.currentThread().getName() + "Sem emails na lista! Entrando em modo de espera.");
                emails.wait();
            }
            return emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (emails) {
            System.out.println(Thread.currentThread().getName() + " Encerrando emails!");
            emails.notifyAll();
        }
    }
}
