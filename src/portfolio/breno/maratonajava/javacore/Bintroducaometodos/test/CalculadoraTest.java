package portfolio.breno.maratonajava.javacore.Bintroducaometodos.test;

import portfolio.breno.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        c.soma(10, 20);
        System.out.println(c.sub(50, 15));
        c.imprimeDiv(10, 2);

        int n1 = 10;
        int n2 = 26;
        c.alteraNumeros(n1, n2);
        System.out.println("\n" + "Dentro do CalculadoraTest: ");
        System.out.println("Num 1: " + n1 + "\nNum 2: " + n2);
    }
}
