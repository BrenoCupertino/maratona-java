package portfolio.breno.maratonajava.javacore.Npolimorfismo.test;

import portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import portfolio.breno.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador c = new Computador("NUC10i7", 5000);
        Tomate t = new Tomate("Tomate Verde", 7);

        CalculadoraImposto.CalcularImpostoComputador(c);
        CalculadoraImposto.CalcularImpostoTomate(t);
    }
}
