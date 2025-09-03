package portfolio.breno.maratonajava.javacore.ZZAclassesinternas.test;

import portfolio.breno.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        carros.sort(new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareToIgnoreCase(o2.getNome());
            }
        });
        System.out.println(carros);
    }
}
