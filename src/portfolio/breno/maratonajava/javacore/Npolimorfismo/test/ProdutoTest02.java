package portfolio.breno.maratonajava.javacore.Npolimorfismo.test;

import portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        // Utilização do polimorfismo para tratamento das classes que estendem produtos.
        Produto c = new Computador("Ryzen 5", 500);
        System.out.println(c.getNome());
        System.out.println(c.getValor());
        System.out.println(c.calcularImposto());

        System.out.println("----------------");

        Produto c2 = new Tomate("Amarelo", 10);
        System.out.println(c2.getNome());
        System.out.println(c2.getValor());
        System.out.println(c2.calcularImposto());
    }
}
