package portfolio.breno.maratonajava.javacore.ZZFthreads.test;

import portfolio.breno.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadsAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadsAccountTest01 threadsAccountTest01 = new ThreadsAccountTest01();
        Thread t1 = new Thread(threadsAccountTest01, "Luca");
        Thread t2 = new Thread(threadsAccountTest01, "Caique");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println(Thread.currentThread().getName() + " deu ruim!" + account.getBalance());
            }
        }
    }

    // synchronized -> Se uma thread começar a executar o metodo outra thread não podera utilizar ao mesmo tempo
    /*private synchronized void withdrawal(int amount) {

        if(account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " sacando dinheiro");
            account.withdrawal (amount);
            System.out.println(Thread.currentThread().getName() + " completou o saque!" + " Balanço: " + account.getBalance());
        } else {
            System.out.println(Thread.currentThread().getName() + " balanço indisponivel!");
        }
    }*/

    // Possibilidade de losk no objeto, porém objeto deve ser final
    private synchronized void withdrawal(int amount) {
        synchronized (account) {
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + " sacando dinheiro");
                account.withdrawal(amount);
                System.out.println(Thread.currentThread().getName() + " completou o saque!" + " Balanço: " + account.getBalance());
            } else {
                System.out.println(Thread.currentThread().getName() + " balanço indisponivel!");
            }
        }
    }

}
