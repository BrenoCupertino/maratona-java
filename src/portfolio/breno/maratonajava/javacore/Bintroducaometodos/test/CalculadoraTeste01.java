package portfolio.breno.maratonajava.javacore.Bintroducaometodos.test;

import portfolio.breno.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int[] arr = {1, 5, 80, 30, 45, 10};
        c.somaArray(arr);
        c.somaArrayVarArgs(arr);
        c.somaArrayVarArgs(1, 5, 80, 30, 45, 10);
    }
}
