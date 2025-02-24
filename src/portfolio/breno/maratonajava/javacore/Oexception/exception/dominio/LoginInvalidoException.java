package portfolio.breno.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login Invalido. Tente novamente");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
