package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamsTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("t2", 10.99),
            new LightNovel("t5", 2.99),
            new LightNovel("t3", 2.99),
            new LightNovel("t4", 1.99),
            new LightNovel("t4", 1.99),
            new LightNovel("t1", 3.99)
    ));

    public static void main(String[] args) {
//        Double reduce = lightNovels.stream()
//                .map(LightNovel::getPrice)
//                .filter(price -> price > 3)
//                .reduce(0.00, Double::sum);
//
           double reduce = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
          System.out.println(reduce);
    }
}
