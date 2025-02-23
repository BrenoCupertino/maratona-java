package portfolio.breno.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    public void print() {
        super.print();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu, " + this.nome + ",recebi " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
