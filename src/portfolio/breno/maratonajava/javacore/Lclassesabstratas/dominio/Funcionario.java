package portfolio.breno.maratonajava.javacore.Lclassesabstratas.dominio;

//// Quando criamos uma classe abstrata só poderemos instanciar as classes que a extende.
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public void print() {
        System.out.println("imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    // Estamos forçando todas as classes que extendem "Funcionario" a implementar o calculo de bonus especifico.
    public abstract void calculaBonus();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
