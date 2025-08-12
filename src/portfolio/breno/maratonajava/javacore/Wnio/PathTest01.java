package portfolio.breno.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/breno/Downloads/maratona-java/pasta/renamed.txt");
        Path path2 = Paths.get("/home/breno/Downloads/maratona-java/pasta", "renamed.txt");
        Path path3 = Paths.get("/home/breno/Downloads","/maratona-java/pasta/", "renamed.txt");
        System.out.println(path.getFileName().toFile());
        System.out.println(path2.getFileName().toFile());
        System.out.println(path3.getFileName().toFile());

        Path pathN = Paths.get("text.txt");
        Files.createFile(pathN);
    }
}
