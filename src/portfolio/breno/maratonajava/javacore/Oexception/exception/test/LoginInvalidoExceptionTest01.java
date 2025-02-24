package portfolio.breno.maratonajava.javacore.Oexception.exception.test;

import portfolio.breno.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Objects;
import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);

        String usernameDB = "Breno";
        String passwordDB = "senha14";

        System.out.println("Usuario");
        String usernameTeclado = scanner.nextLine();

        System.out.println("Senha");
        String passwordTeclado = scanner.nextLine();

        if(!Objects.equals(usernameTeclado, usernameDB) || !Objects.equals(passwordTeclado, passwordDB)) {
            throw new LoginInvalidoException("Usuário ou senha incorreta.");
        }

        System.out.println("Usuario logado com sucesso");
    }
}
