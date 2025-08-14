package portfolio.breno.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAtributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/breno/Downloads/maratona-java/pasta/pastaSub/pastasSubSub/text.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationtime: " + creationTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);
        System.out.println("lastAccessTime: " + lastAccessTime);

        //BasicFIleAtributesView, DosFileAtributesView(windows), PosixFileAtributesView(unix) -> Alteram arquivos
        System.out.println("----------------------");
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        fileAttributeView.setTimes(lastModifiedTime, FileTime.fromMillis(System.currentTimeMillis()), creationTime);

        // Necessário realizar a leitura do arquivo novamente para ver a mudança
         creationTime = fileAttributeView.readAttributes().creationTime();
         lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
         lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creationtime: " + creationTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);
        System.out.println("lastAccessTime: " + lastAccessTime);
    }
}
