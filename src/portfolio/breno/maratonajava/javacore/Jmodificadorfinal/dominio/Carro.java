package portfolio.breno.maratonajava.javacore.Jmodificadorfinal.dominio;

// Classes com o modificador "final" não poderam ser extendidas.
// Metodos com o modificador "final" não podem ser sobrecarregadas.
public class Carro {
    /**
     * Moficador "Final": Fará com que uma constate fique somente com o valor default da sua inicialização*/
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
