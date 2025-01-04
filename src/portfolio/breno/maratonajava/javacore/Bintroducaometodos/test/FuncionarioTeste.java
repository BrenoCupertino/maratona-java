package portfolio.breno.maratonajava.javacore.Bintroducaometodos.test;

import portfolio.breno.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Junior", 2500, 25);
        Funcionario f2 = new Funcionario("Maria", 4000, 45);
        Funcionario f3 = new Funcionario("José", 9000, 30);

        f1.imprime();
        f2.imprime();
        f3.imprime();

        Funcionario.mediaSalario(f1.salary, f2.salary, f3.salary);
    }
}
