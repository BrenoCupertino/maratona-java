package portfolio.breno.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class ListFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
        System.out.println("pre " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc){
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc){
        System.out.println("post " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/breno/Downloads/maratona-java/pasta");
        Files.walkFileTree(path, new ListFiles());
    }
}
