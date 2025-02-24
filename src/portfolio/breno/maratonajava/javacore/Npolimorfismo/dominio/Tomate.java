package portfolio.breno.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    private static String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.valor * 0.05;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        Tomate.dataValidade = dataValidade;
    }
}
