package portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.valor * 0.2;
    }
}
