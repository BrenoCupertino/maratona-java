package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("t2", 10.99),
                new LightNovel("t5", 2.99),
                new LightNovel("t3", 2.99),
                new LightNovel("t4", 1.99),
                new LightNovel("t4", 1.99),
                new LightNovel("t1", 3.99)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(e -> e.getPrice() >= 8.00));
        System.out.println(lightNovels.stream().allMatch(e -> e.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(e -> e.getPrice() == 0));

        lightNovels.stream()
                .filter(e -> e.getPrice() > 3)
                .findAny()
                        .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(e -> e.getPrice() > 3)
                .min(Comparator.comparing(LightNovel::getPrice))
                        .ifPresent(System.out::println);
    }
}
