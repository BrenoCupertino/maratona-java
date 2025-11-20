package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.Category;
import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("t2", 10.99, Category.FANTASY),
            new LightNovel("t5", 2.99, Category.DRAMA),
            new LightNovel("t3", 2.99, Category.ROMANCE),
            new LightNovel("t4", 1.99, Category.DRAMA),
            new LightNovel("t4", 1.99, Category.ROMANCE),
            new LightNovel("t1", 3.99, Category.FANTASY)
    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
