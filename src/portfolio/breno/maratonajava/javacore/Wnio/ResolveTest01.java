package portfolio.breno.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        //União de paths
        Path proj = Paths.get("home/breno");
        Path arq = Paths.get("dev/text.txt");

        Path resolve = proj.resolve(arq);
        System.out.println("Path: " + resolve);

        Path absoluto = Paths.get("/home/breno");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("text.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto)); // Não resolve de relativo para absoluto
        System.out.println("4 " + relativo.resolve(file));
        System.out.println("5 " + file.resolve(absoluto));
        System.out.println("6 " + file.resolve(relativo));
    }
}
