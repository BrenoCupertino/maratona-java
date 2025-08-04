package portfolio.breno.maratonajava.javacore.Vio;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            System.out.println(file.createNewFile());
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
            System.out.println(Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDate());
            if(file.exists()){
                System.out.println(file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
