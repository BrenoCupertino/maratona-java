package portfolio.breno.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Temos dois tipos de exceptions: checked e unchecked!
        // Checked -> Filhas diretas da classe Exception. Se não tratadas, lançam erro em tempo de compilação.
        /* Unchecked -> Filhas ou a própria classe RunTimeException.
        Quando lançadas, provável erro na lógica do desenvolvedor*/

        // NullPointerException
        Object o = null;
        System.out.println(o.toString());

        // ArrayIndexOutOfBoundsException
        int[] a = {1, 2};
        System.out.println(a[2]);
    }
}
