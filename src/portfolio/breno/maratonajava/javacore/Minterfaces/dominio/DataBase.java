package portfolio.breno.maratonajava.javacore.Minterfaces.dominio;

public class DataBase implements DataLoader, DataRemover {
    @Override
    public void checkPermission() {
        System.out.println("Implementação da checagem de permissões na classe \"Data Base\"");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados do banco...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro de retrieveMaxDataSize da classe \"DataBase\"");
    }
}
