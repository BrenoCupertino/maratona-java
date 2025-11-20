package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.Category;
import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("t2", 10.99, Category.FANTASY),
            new LightNovel("t5", 2.99, Category.DRAMA),
            new LightNovel("t3", 2.99, Category.ROMANCE),
            new LightNovel("t4", 1.99, Category.DRAMA),
            new LightNovel("t4", 1.99, Category.ROMANCE),
            new LightNovel("t1", 3.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.mapping(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE,
                                Collectors.toSet())));
        System.out.println(collect1);
    }
}
