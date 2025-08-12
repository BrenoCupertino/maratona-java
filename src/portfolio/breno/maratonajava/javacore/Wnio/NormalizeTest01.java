package portfolio.breno.maratonajava.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        //Elimina elementos redudantes do path
        String proj = "home/breno/dev";
        String arq = "../../text.txt";

        Path path = Paths.get(proj, arq);
        System.out.println("Path: " + path);
        System.out.println("Path: " + path.normalize());

        Path path1 = Paths.get("/home/./breno/./dev/");
        System.out.println("Path: " + path1);
        System.out.println("Path: " + path1.normalize());
    }
}
