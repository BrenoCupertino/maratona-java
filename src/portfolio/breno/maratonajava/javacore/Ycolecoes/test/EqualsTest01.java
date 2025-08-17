package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import portfolio.breno.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String n = "nome";
        String n1 = new String("nome");
        System.out.println(n == n1);
        System.out.println(n.equals(n1));
        System.out.println("----------------------");

        Smartphone s1 = new Smartphone("123", "iphone");
        Smartphone s2 = new Smartphone("123", "iphone");
        System.out.println(s1.equals(s2)); // Pontos distintos na memoria (HEAP), precisa reescrever "equals".

        Smartphone s3 = s1;
        System.out.println(s1.equals(s3));
    }
}
