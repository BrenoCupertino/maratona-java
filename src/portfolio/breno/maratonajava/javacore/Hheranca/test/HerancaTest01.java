package portfolio.breno.maratonajava.javacore.Hheranca.test;

import portfolio.breno.maratonajava.javacore.Hheranca.dominio.Endereco;
import portfolio.breno.maratonajava.javacore.Hheranca.dominio.Funcionario;
import portfolio.breno.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco e = new Endereco("Rua 8 de Maio", "111111-000");

        Pessoa p = new Pessoa("Luca", "12345687-9", e);
        p.print();

        Funcionario f = new Funcionario("João", "1455556789-3", e, 1500);
        f.print();
        f.relatorioPagamento();
    }
}
