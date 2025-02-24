package portfolio.breno.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        ExceptionTest01.criarArquivo();
    }

    private static void criarArquivo() {
        File file = new File("arquivo\\teste.txt");

        // Metodo createNewFile é do tipo checked, ou seja, precisamos tratar o possível erro.
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
