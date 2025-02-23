package portfolio.breno.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    /**
     * Modificado de acesso "Private": Somente pode ser acessado dentro da classe
     */

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void print() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome () {
        return this.nome;
    }
}
