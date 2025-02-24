package portfolio.breno.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        // Nào podemos colocar tipos mais generico a frente de catchs mais especificos.
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException, IllegalArgumentException e ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }


         /*Multi catch -> exceptions que não estam na mesma linha de herança podem ser
         colocadas dentro de um mesmo catch separada via pipe.*/
        try {
            talvezLanceExeception();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceExeception() throws SQLException, FileNotFoundException {
    }
}
