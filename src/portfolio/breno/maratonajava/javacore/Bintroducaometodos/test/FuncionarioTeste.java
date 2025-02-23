package portfolio.breno.maratonajava.javacore.Bintroducaometodos.test;

import portfolio.breno.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Junior", new double[]{2500, 1300, 1800}, 25);

        f1.mediaSalario();
    }
}
