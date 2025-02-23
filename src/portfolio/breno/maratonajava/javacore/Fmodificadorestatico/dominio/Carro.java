package portfolio.breno.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    /**
     * Modificador de acesso estatico: Fará com que um atributo ou metodo pertença a classe e não somente a uma instancia dessa classe.
     */
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void print() {
        System.out.println("----------------");
        System.out.println("Nome; " + this.nome);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
