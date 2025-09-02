package portfolio.breno.maratonajava.javacore.Zgenerics.test;

import portfolio.breno.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodosGenericosTest01 {

    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa"));
    }

    // Devemos ter o tipo generico depois do modificador de acesso e antes do tipo de retorno
    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }
}
