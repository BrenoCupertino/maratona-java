package portfolio.breno.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/arquivo.zip");
        Path zipado = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(path, zipado);
    }

    private static void zip(Path zip, Path zipados) {
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zip));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(zipados);
        ) {
            for (Path file : directoryStream) {
                // 4 entapas para zipar:
                //Etapa 1: Preparação do objeto
                new ZipEntry(file.getFileName().toString());

                //Etapa 2: Comunicação com o ZipOutputStream
                zipStream.putNextEntry(new ZipEntry(file.getFileName().toString()));

                // Etapa 3: Copia do arquivo para o zip
                Files.copy(file, zipStream);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
