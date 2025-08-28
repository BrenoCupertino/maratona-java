package portfolio.breno.maratonajava.javacore.Ycolecoes.test;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>(); // Caso seja usada uma classe na Key, então precisa do compareto
        map.put("A", "Letra A");
        map.put("B", "Letra B");
        map.put("C", "Letra C");

        map.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

//        System.out.println(map.headMap("B")); // Encontra valores abaixo do especificado
//        map.headMap("B").remove("A"); // Altera o map original
//        System.out.println(map);

        System.out.println(map.headMap("C", true)); // Inclui o valor e retorna os abaixo
        System.out.println(map);
    }
}
