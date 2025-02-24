package portfolio.breno.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(RunTimeExceptionTest02.divisao(1, 0));
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return int
     */
    private static int divisao (int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento invalido, não é permitido divisão por zero.");
        }
        return a/b;
    }
}
