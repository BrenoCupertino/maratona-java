package portfolio.breno.maratonajava.javacore.Minterfaces.test;

import portfolio.breno.maratonajava.javacore.Minterfaces.dominio.DataBase;
import portfolio.breno.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import portfolio.breno.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataTest01 {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        db.checkPermission();
        db.load();
        db.remove();

        FileLoader f = new FileLoader();
        f.checkPermission();
        f.load();

        DataLoader.retrieveMaxDataSize();
        DataBase.retrieveMaxDataSize();
    }
}
