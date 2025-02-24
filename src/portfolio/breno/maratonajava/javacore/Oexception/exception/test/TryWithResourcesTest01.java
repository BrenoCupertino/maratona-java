package portfolio.breno.maratonajava.javacore.Oexception.exception.test;

import portfolio.breno.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import portfolio.breno.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        /* Try com recursos -> Se encarrega de fechar a conexão com a variavel de referencia.
         Logo, só podemos colocar objetos dentro do Try caso a classe desse objeto implemente
         as interfaces Closeable ou extenda a classe AutoCloseable.
         Também, podemos remover o catch do try com recurso. Porém, temos que jogar a exceção.
         */
        try (Leitor1 l1 = new Leitor1();
             Leitor2 l2 = new Leitor2();) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert reader != null;
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
