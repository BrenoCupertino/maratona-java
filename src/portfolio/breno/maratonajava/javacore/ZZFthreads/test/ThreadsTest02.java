package portfolio.breno.maratonajava.javacore.ZZFthreads.test;

class ThreadExample3 implements Runnable {

    private final char c;

    public ThreadExample3(char c) {
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) System.out.println();

            Thread.yield(); // Pausa na thread, dar a vex. Sem garantia que será utilizado.
        }
    }
}

public class ThreadsTest02 {
    public static void main(String[] args) throws InterruptedException {
//        Runnable example = () -> {
//            System.out.println("Forma 2");
//        };
//        new Thread(example).start();
//
//        Thread t1 = new Thread(() -> {
//            System.out.println("Forma 1");
//        });

        Thread t1 = new Thread(new ThreadExample3('a'), "KA");
        Thread t2 = new Thread(new ThreadExample3('b'), "ME");

        t1.start();
        t1.join(); // Junta a Thread principal "main" a t1, irá executar t1 ate terminar e depois chamará t2.
        t2.start();
    }


}
