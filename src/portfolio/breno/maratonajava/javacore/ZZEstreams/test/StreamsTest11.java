package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("t2", 10.99),
            new LightNovel("t5", 2.99),
            new LightNovel("t3", 2.99),
            new LightNovel("t4", 1.99),
            new LightNovel("t4", 1.99),
            new LightNovel("t1", 3.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        System.out.println(lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice)));
    }
}
