package portfolio.breno.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest03 {
    private String name = "Julio";

    // Por coesão, é colocada dentro de outra classe, mas funciona como se estivesse fora dela. Utilização do "static".
    static class Nested {
        void print() {
            System.out.println(new OuterClassTest03().name);
        }
    }

    public static void main(String[] args) {
        Nested s = new Nested();
        s.print();
    }
}
