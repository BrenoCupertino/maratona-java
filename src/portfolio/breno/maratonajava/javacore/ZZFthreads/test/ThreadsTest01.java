package portfolio.breno.maratonajava.javacore.ZZFthreads.test;

class ThreadExample extends Thread {
    private final char c;

    public ThreadExample(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) System.out.println();
        }
    }
}

class ThreadExample2 implements Runnable {

    private final char c;

    public ThreadExample2(char c) {
        this.c = c;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) System.out.println();

            try {
                Thread.sleep(2000); //Garantido
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadsTest01 {
    public static void main(String[] args) {
//        ThreadExample thread = new ThreadExample('A');
//        ThreadExample threadB = new ThreadExample('B');
//        ThreadExample threadC = new ThreadExample('C');
//        ThreadExample threadD = new ThreadExample('D');
        Thread thread = new Thread(new ThreadExample2('a'), "T1");
        Thread threadB = new Thread(new ThreadExample2('b'), "T2");
        Thread threadC = new Thread(new ThreadExample2('c'), "T3");
        Thread threadD = new Thread(new ThreadExample2('d'), "T4");
        threadD.setPriority(Thread.MAX_PRIORITY); // Não garantido
        thread.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
