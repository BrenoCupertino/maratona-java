package portfolio.breno.maratonajava.javacore.ZZEstreams.test;

import portfolio.breno.maratonajava.javacore.ZZEstreams.dominio.LightNovel;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("t2", 10.99),
            new LightNovel("t5", 2.99),
            new LightNovel("t3", 2.99),
            new LightNovel("t4", 1.99),
            new LightNovel("t1", 3.99)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovels);

        List<String> priceLessFour = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() < 4.00 && priceLessFour.size() < 3) {
                priceLessFour.add(lightNovel.getTitle());
            }
        }

        System.out.println(priceLessFour);
    }
}
