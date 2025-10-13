package portfolio.breno.maratonajava.javacore.ZZClambdas.test;

import portfolio.breno.maratonajava.javacore.ZZClambdas.dominio.Anime;
import portfolio.breno.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Naruto", 10), new Anime("Dragon", 15)));
//        Collections.sort(anime, (a1, a2) -> a1.getTitle().compareToIgnoreCase(a2.getTitle()));
        Collections.sort(anime, AnimeComparators::compareByTitle);
        System.out.println(anime);
    }
}
