package portfolio.breno.maratonajava.javacore.Wnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAtributesTest01 {
    public static void main(String[] args) throws IOException {
        // BasicFIleAtributes, DosFileAtributes(windows), PosixFileAtributes (unix)
        LocalDateTime now = LocalDateTime.now().minusDays(10);
        File file = new File("/home/breno/Downloads/maratona-java/pasta/pastaSub/pastasSubSub/text.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        boolean b = file.setLastModified(now.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("/home/breno/Downloads/maratona-java/pasta/pastaSub/pastasSubSub/text_renamed.txt");
        Files.createFile(path);
        Files.setLastModifiedTime(path, FileTime.fromMillis(now.toInstant(ZoneOffset.UTC).toEpochMilli()));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));

    }
}
