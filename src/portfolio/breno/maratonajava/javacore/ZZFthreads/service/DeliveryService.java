package portfolio.breno.maratonajava.javacore.ZZFthreads.service;

import portfolio.breno.maratonajava.javacore.ZZFthreads.dominio.Members;

public class DeliveryService implements Runnable {
    private final Members members;

    public DeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String thread = Thread.currentThread().getName();
        System.out.println(thread + " Começando a entregar emails...");
        while(members.isOpen() || members.peddingEmails() > 0) {
            try {
                String s = members.retrieveEmails();
                if(s == null) continue;
                System.out.println(thread + " Enviando email para " + s);
                Thread.sleep(2000);
                System.out.println(thread + " Enviou email para " + s);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(thread + " Emails enviado com sucesso!");
    }
}
