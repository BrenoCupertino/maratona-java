package portfolio.breno.maratonajava.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        // Erros acontecem na JVM e não podemos recuperar o programa em tempo de execução.
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
