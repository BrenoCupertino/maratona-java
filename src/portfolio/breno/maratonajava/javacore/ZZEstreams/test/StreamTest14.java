package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.Category;
import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("t2", 10.99, Category.FANTASY),
            new LightNovel("t5", 2.99, Category.DRAMA),
            new LightNovel("t3", 2.99, Category.ROMANCE),
            new LightNovel("t4", 1.99, Category.DRAMA),
            new LightNovel("t4", 1.99, Category.ROMANCE),
            new LightNovel("t1", 3.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.counting()));

        System.out.println(collect);

        Map<Category, LightNovel> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors
                                .collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)
                        ));

        System.out.println(collect1);

    }
}
