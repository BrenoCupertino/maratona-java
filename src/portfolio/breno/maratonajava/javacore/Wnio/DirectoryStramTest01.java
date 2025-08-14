package portfolio.breno.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStramTest01 {
    // Permissão para navegar entre pastas em um só nível
    public static void main(String[] args) {
        Path root = Paths.get(".");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(root)) {
            for(Path path: stream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
