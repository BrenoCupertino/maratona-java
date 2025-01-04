package portfolio.breno.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String name;
    public double salary;
    public int age;

    public Funcionario(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public void imprime(){
        System.out.println("-------------");
        System.out.println("Nome: " + this.name + "\nIdade: " + this.age + "\nSalario: " + this.salary);
    }

    public static void mediaSalario(double ...salarios) {
        double soma = 0;
        for(double salario: salarios) {
            soma += salario;
        }
        System.out.println("-------------");
        System.out.println("Média salarios: " + soma / salarios.length);
    }
}
