package portfolio.breno.maratonajava.javacore.Vio;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File filedir = new File("pasta");
        boolean dir = filedir.mkdir();
        System.out.println(dir);

        File arqdir = new File(filedir, "arquivo.txt");
        boolean arqdirCreated = arqdir.createNewFile();
        System.out.println(arqdirCreated);

        File renamed = new File(filedir, "renamed.txt");
        boolean renamedDone = arqdir.renameTo(renamed);
        System.out.println(renamedDone);
    }
}
