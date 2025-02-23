package portfolio.breno.maratonajava.javacore.Minterfaces.dominio;

/*Interfaces agirão como contratos, ou seja, os metodos que a implementa
terá que realizar as implementaçòes dos metodos*/
public interface DataLoader {
    // Todos os atributos de uma interface são constantes, ou seja, public, static e final
    int MAX_DATA_SIZE = 1024;

    // Todos os metodos em uma interface são public e abstract
    void load();

    /*A partir do JAVA 8, interfaces puderam aplicar metodos concretos para garantir a compatibilidade com versões antigas. Utilizamos "default" para definir esses metodos*/
    default void checkPermission() {
        System.out.println("Checagem de permissões na interface \"Data Loader\"...");
    }

    // Metodos estaticos de interfaces não podem ser sobrescritos.
    static void retrieveMaxDataSize() {
        System.out.println("Dentro de retrieveMaxDataSize da Interface");
    }
}
