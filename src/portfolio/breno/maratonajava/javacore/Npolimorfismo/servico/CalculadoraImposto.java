package portfolio.breno.maratonajava.javacore.Npolimorfismo.servico;

import portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void CalcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto: " + produto.getNome() + ".");
        double imposto = produto.calcularImposto();
        System.out.println("    Valor: " + produto.getValor());
        System.out.println("    Imposto: " + imposto);

        // Narrowing cast - Conversão de um tipo maior em um tipo menor, ex.: Produto -> Tomate
        if(produto instanceof Tomate ) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
    }

    /*public static void CalcularImpostoComputador(Computador computador) {
        System.out.println("Relatorio de imposto do computador.");
        double imposto = computador.calcularImposto();
        System.out.println("    Computador: " + computador.getNome());
        System.out.println("    Valor: " + computador.getValor());
        System.out.println("    Imposto: " + imposto);
    }

    public static void CalcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatorio de imposto do tomate.");
        double imposto = tomate.calcularImposto();
        System.out.println("    Tomate: " + tomate.getNome());
        System.out.println("    Valor: " + tomate.getValor());
        System.out.println("    Imposto: " + imposto);
    }*/
}
