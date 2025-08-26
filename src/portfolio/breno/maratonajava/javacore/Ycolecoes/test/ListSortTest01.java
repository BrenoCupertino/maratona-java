package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> nomes =  new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Julia");
        nomes.add("Miranda");
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println("----------------");

        System.out.println(nomes);
    }
}
