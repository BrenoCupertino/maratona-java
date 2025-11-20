package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("t2", 10.99),
            new LightNovel("t5", 2.99),
            new LightNovel("t3", 2.99),
            new LightNovel("t4", 1.99),
            new LightNovel("t1", 3.99)
    ));

    public static void main(String[] args) {
        // FlatMap -> Utilizar para tirar informações de listas aninhadas.
        List<String> sorted = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter((e) -> e.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(sorted);
    }
}
