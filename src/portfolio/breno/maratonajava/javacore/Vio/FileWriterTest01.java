package portfolio.breno.maratonajava.javacore.Vio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, false)) {
            fw.write("Escrita Escrita Escrita Escrita Escrita Escrita\nEscrita Escrita Escrita Escrita Escrita Escrita");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        file.delete();
    }
}
