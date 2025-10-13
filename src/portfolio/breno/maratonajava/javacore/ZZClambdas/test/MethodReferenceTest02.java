package portfolio.breno.maratonajava.javacore.ZZClambdas.test;

import portfolio.breno.maratonajava.javacore.ZZClambdas.dominio.Anime;
import portfolio.breno.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instace method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> anime = new ArrayList<>(List.of(new Anime("Naruto", 10), new Anime("Dragon", 15)));
        anime.sort(animeComparators::compareByTitleNonStatic);
        System.out.println(anime);
    }
}
