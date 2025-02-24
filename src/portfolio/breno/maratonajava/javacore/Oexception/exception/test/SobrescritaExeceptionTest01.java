package portfolio.breno.maratonajava.javacore.Oexception.exception.test;

import portfolio.breno.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import portfolio.breno.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import portfolio.breno.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExeceptionTest01 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Funcionario f = new Funcionario();

        try {
            p.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        f.salvar();
    }
}
