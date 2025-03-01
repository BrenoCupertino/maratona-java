package portfolio.breno.maratonajava.javacore.QString.test;

public class StringPerfomanceTest01 {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatStringBuilder(100000);
        long fim = System.currentTimeMillis();
        System.out.println(fim - inicio);
    }


    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        // StringBuffer possui as mesmas caracteristicas do StringBuilder porém, é utilizaod em abientes multithreading.
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
