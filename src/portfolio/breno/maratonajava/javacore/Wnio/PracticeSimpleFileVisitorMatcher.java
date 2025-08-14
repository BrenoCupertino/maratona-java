package portfolio.breno.maratonajava.javacore.Wnio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PracticeSimpleFileVisitorMatcher {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");

        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                if (matcher(file, "glob:**/*{Test*}.{java,class}")) {
                    System.out.println(file.getFileName());
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }

    private static boolean matcher (Path file, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        return matcher.matches(file);
    }
}
