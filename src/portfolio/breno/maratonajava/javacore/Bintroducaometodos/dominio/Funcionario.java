package portfolio.breno.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private double[] salarios;
    private int age;
    private double media;

    public Funcionario(String name, double[] salary, int age) {
        this.name = name;
        this.salarios = salary;
        this.age = age;
    }

    public void imprime(){
        System.out.println("-------------");
        System.out.println("Nome: " + this.name + "\nIdade: " + this.age + "\nSalario: " + this.salarios);
    }

    public void mediaSalario() {
        for(double salario: this.salarios) {
            media += salario;
        }
         media = media / this.salarios.length;

        System.out.println("-------------");
        System.out.println("Média salarios: " + media);
    }

    public double[] getSalary() {
        return salarios;
    }
}
