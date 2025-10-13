package portfolio.breno.maratonajava.javacore.ZZDoptional.repositorio;

import portfolio.breno.maratonajava.javacore.ZZDoptional.dominio.Anime;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Anime> Anime = List.of(new Anime(1, "Titulo 1", 65), new Anime(2, "Titulo 2", 396));

    public static Optional<Anime> findByTitle(String title) {
        return findBy(m -> m.getTitle().equals(title));
    }

    public static Optional<Anime> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }

    private static Optional<Anime> findBy(Predicate<Anime> predicate) {
        for (Anime anime : Anime) {
            if(predicate.test(anime)) {
                return Optional.of(anime);
            }
        }
        return Optional.empty();
    }
}
