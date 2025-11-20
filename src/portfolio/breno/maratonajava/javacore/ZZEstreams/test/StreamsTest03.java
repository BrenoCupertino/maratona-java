package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("t2", 10.99),
            new LightNovel("t5", 2.99),
            new LightNovel("t3", 2.99),
            new LightNovel("t4", 1.99),
            new LightNovel("t4", 1.99),
            new LightNovel("t1", 3.99)
    ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();

        long count = stream.filter((e) -> e.getPrice() <= 4)
                .count();
        System.out.println(count);

        long count1 = lightNovels.stream()
                .distinct()
                .filter((e) -> e.getPrice() <= 4)
                .count();
        System.out.println(count1);
    }
}
