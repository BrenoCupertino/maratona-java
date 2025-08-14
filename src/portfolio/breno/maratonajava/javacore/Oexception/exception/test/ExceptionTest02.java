package portfolio.breno.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        ExceptionTest02.criarArquivo();
    }

    /* Em metodos privados, como são os metodos da própria classe que pode chama-lo, é interessante utilizar
    o try/catch. No entanto, em metodos públicos, não fazemos ideia de quem pode chamar o metódo. Nesse caso,
    passamos a responsabilidade pra quem chamou.*/

    public static void criarArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            // Podemos tratar uma exception e ainda lança-la para quem chamou!
            e.printStackTrace();
            throw e;
        }
    }
}
