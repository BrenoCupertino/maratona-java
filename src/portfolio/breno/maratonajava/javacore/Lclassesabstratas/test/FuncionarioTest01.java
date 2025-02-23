package portfolio.breno.maratonajava.javacore.Lclassesabstratas.test;

import portfolio.breno.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import portfolio.breno.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente g = new Gerente("Lucas", 8000);

        System.out.println(g);
    }
}
