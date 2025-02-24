package portfolio.breno.maratonajava.javacore.Npolimorfismo.test;

import portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import portfolio.breno.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        // Utilização do polimorfismo para tratamento das classes que estendem produtos.
        Produto c = new Computador("Ryzen 5", 500);
        CalculadoraImposto.CalcularImposto(c);

        System.out.println("--------------------------------");

        Tomate t = new Tomate("Amarelo", 10);
        t.setDataValidade("01/02/2026");
        CalculadoraImposto.CalcularImposto(t);

    }
}
