package portfolio.breno.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta");
        if (Files.notExists(path)) {
            Files.createDirectory(path);
        }

        Path pathS = Paths.get("pasta/pastaSub/pastasSubSub");
        if(Files.notExists(pathS)) {
            Files.createDirectories(pathS);
        }

        Path filePath = Paths.get(pathS.toString(), "text.txt");
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "text_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
