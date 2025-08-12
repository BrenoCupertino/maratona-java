package portfolio.breno.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        // Como chegar de um path até outro?
        Path dir = Paths.get("/home/breno");
        Path arq = Paths.get("/home/breno/dev/class.java");
        Path relativize = dir.relativize(arq);
        System.out.println("relativize: Dir -> Arq... " + relativize);

        Path absoluto = Paths.get("/home/breno");
        Path absoluto2 = Paths.get("/usr/local");
        Path relativo = Paths.get("temp");
        Path file = Paths.get("temp/text.txt");

        System.out.println("1 " + absoluto.relativize(absoluto2));
        System.out.println("2 " + absoluto.relativize(arq));
        System.out.println("3 " + relativo.relativize(file));
        System.out.println("1 " + file.relativize(relativo));
    }
}
