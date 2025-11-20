package portfolio.breno.maratonajava.javacore.ZZDoptional.test;

import portfolio.breno.maratonajava.javacore.ZZDoptional.dominio.Anime;
import portfolio.breno.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Anime> byTitle = MangaRepository.findByTitle("Titulo 1");

        byTitle.ifPresent(m -> m.setTitle("Titulo 111"));
        System.out.println(byTitle);

        Anime byId = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);

        Anime anime = MangaRepository.findByTitle("Titulo 4").
                orElseGet(() -> new Anime(4, "Titulo 4", 200));
        System.out.println(anime);

        System.out.println();
    }
}
